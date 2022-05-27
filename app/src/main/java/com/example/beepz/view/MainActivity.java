package com.example.beepz.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.beepz.R;
import com.example.beepz.services.MainAdapter;
import com.example.beepz.services.MainRepository;
import com.example.beepz.services.model.Response;
import com.example.beepz.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity implements MainAdapter.AdapterCallBack {

    private RecyclerView recyclerView;
    private MainViewModel viewModel;
    private MainAdapter adapter;
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        progressBar = findViewById(R.id.progress_bar);

        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        viewModel.fetchDataFromServer(new MainRepository.CallBack() {
            @Override
            public void onResponse(Response response) {
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), RecyclerView.VERTICAL, false));
                adapter = new MainAdapter(response.getData().getData(), MainActivity.this);
                recyclerView.setAdapter(adapter);
                progressBar.setVisibility(View.GONE);
            }

            @Override
            public void onError(String error) {
                Toast.makeText(getApplicationContext(), error, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void itemClickListener(String orderTrackName, int orderTrackLevel, String readableOrderNo) {
        Intent intent = new Intent(getApplicationContext(),TrackerActivity.class);
        intent.putExtra("name", orderTrackName);
        intent.putExtra("level", orderTrackLevel);
        intent.putExtra("order_no", readableOrderNo);
        startActivity(intent);
    }
}