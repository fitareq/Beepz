package com.example.beepz.services;

import android.app.Application;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.beepz.services.model.Response;
import com.google.gson.Gson;

public class MainRepository {

    private Application application;
    public MainRepository(Application application)
    {
        this.application = application;
    }



    public void fetchDataFromServer(CallBack callBack){
        String url = "http://netvia.r-y-x.net/api/v1/Get/Customer/active/request?CustomerId=34";
        RequestQueue requestQueue = Volley.newRequestQueue(application.getApplicationContext());

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, response -> {

            Gson gson = new Gson();
            Response response1 = gson.fromJson(response, Response.class);
            callBack.onResponse(response1);
        }, error -> {
            callBack.onError("Error occurred while data loading...");
        });

        requestQueue.add(stringRequest);
    }

    public interface CallBack{
        void onResponse(Response response);
        void onError(String error);
    }
}
