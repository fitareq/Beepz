package com.example.beepz.viewmodel;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.beepz.services.MainRepository;
import com.example.beepz.services.model.Response;

public class MainViewModel extends AndroidViewModel {

    private MainRepository repository;
    public MainViewModel(@NonNull Application application) {
        super(application);
        repository = new MainRepository(application);
    }

    public void fetchDataFromServer(MainRepository.CallBack callBack){
        repository.fetchDataFromServer(callBack);
    }
}
