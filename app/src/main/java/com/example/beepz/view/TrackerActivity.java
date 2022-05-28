package com.example.beepz.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.beepz.R;
import com.example.beepz.services.TrackerAdapter;
import com.example.beepz.services.model.TrackerModel;

import java.util.ArrayList;
import java.util.List;

public class TrackerActivity extends AppCompatActivity {

    private TrackerAdapter adapter;
    private RecyclerView recyclerView;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracker);

        recyclerView = findViewById(R.id.tracker_recycler_view);
        textView = findViewById(R.id.order_number);

        int level = getIntent().getIntExtra("level", 1);
        String name = getIntent().getStringExtra("name");
        String order_no = getIntent().getStringExtra("order_no");
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();

        textView.setText(order_no);

        List<TrackerModel> trackerModels = new ArrayList<>();
        trackerModels.add(new TrackerModel("Booking Confirmed", R.drawable.ic_outline_circle_24, R.drawable.ic_baseline_check_circle_24, R.drawable.ic_outline_thumb_up_alt_24_black, R.drawable.ic_outline_thumb_up_alt_24));
        trackerModels.add(new TrackerModel("Driver on the way to pickup", R.drawable.ic_outline_circle_24, R.drawable.ic_baseline_check_circle_24, R.drawable.ic_baseline_moped_24_black, R.drawable.ic_baseline_moped_24));
        trackerModels.add(new TrackerModel("QR Code Scanned", R.drawable.ic_outline_circle_24, R.drawable.ic_baseline_check_circle_24, R.drawable.ic_baseline_qr_code_24, R.drawable.ic_baseline_qr_code_24_colored));
        trackerModels.add(new TrackerModel("Car Picked Up", R.drawable.ic_outline_circle_24, R.drawable.ic_baseline_check_circle_24, R.drawable.ic_baseline_local_shipping_24, R.drawable.ic_baseline_local_shipping_24_colored));
        trackerModels.add(new TrackerModel("Reached Garage", R.drawable.ic_outline_circle_24, R.drawable.ic_baseline_check_circle_24, R.drawable.ic_outline_garage_24, R.drawable.ic_outline_garage_24_colored));
        trackerModels.add(new TrackerModel("Service Started", R.drawable.ic_outline_circle_24, R.drawable.ic_baseline_check_circle_24, R.drawable.ic_baseline_design_services_24, R.drawable.ic_baseline_design_services_24_colored));
        trackerModels.add(new TrackerModel("Service Ended", R.drawable.ic_outline_circle_24, R.drawable.ic_baseline_check_circle_24, R.drawable.ic_baseline_check_24, R.drawable.ic_baseline_check_24_colored));
        trackerModels.add(new TrackerModel("Driver on the way to Drop Off", R.drawable.ic_outline_circle_24, R.drawable.ic_baseline_check_circle_24, R.drawable.ic_outline_pin_drop_24, R.drawable.ic_outline_pin_drop_24_colored));
        trackerModels.add(new TrackerModel("Booking Completed", R.drawable.ic_outline_circle_24, R.drawable.ic_baseline_check_circle_24, R.drawable.ic_baseline_done_all_24, R.drawable.ic_baseline_done_all_24_colored));


        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        adapter = new TrackerAdapter(trackerModels, level, this);
        recyclerView.setAdapter(adapter);
    }
}