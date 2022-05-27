package com.example.beepz.services;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.beepz.R;
import com.example.beepz.services.model.Datum;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.mViewHolder> {
    private List<Datum> data;
    private AdapterCallBack adapterCallBack;
    private View mView;
    public MainAdapter(List<Datum> data, AdapterCallBack adapterCallBack) {
        this.data = data;
        this.adapterCallBack = adapterCallBack;
    }

    @NonNull
    @Override
    public mViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_card, parent, false);
        return new mViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull mViewHolder holder, int position) {
        Datum current = data.get(position);
        String service_name = current.getCategory().getCategoryName();
        String car_details = "Car Details: "+current.getCar().getVehicleNickName()+" "+current.getCar().getPlateNumber();
        String date_of_services = "Date of Services: "+current.getBookingDate();
        String order_track_name = current.getOrderTrack().getName();
        int order_track_level = current.getOrderTrack().getLevel();
        String readableOrderNo = current.getReadableOrderNo();


        holder.serviceName.setText(service_name);
        holder.carDetails.setText(car_details);
        holder.dateOfServices.setText(date_of_services);
        holder.orderTrackName.setText(order_track_name);


        mView.setOnClickListener(view -> {
            adapterCallBack.itemClickListener(order_track_name, order_track_level, readableOrderNo);
        });


    }

    @Override
    public int getItemCount() {
        return data != null ? data.size(): 0;
    }


    public class mViewHolder extends RecyclerView.ViewHolder{

        TextView serviceName, carDetails, dateOfServices, orderTrackName;
        public mViewHolder(@NonNull View itemView) {
            super(itemView);
            mView = itemView;
            serviceName = itemView.findViewById(R.id.service_name);
            carDetails = itemView.findViewById(R.id.car_details);
            dateOfServices = itemView.findViewById(R.id.date_of_services);
            orderTrackName = itemView.findViewById(R.id.order_track_name);
        }
    }


    public interface AdapterCallBack{
        void itemClickListener(String orderTrackName, int orderTrackLevel, String readableOrderNo);
    }
}
