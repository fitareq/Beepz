package com.example.beepz.services;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.beepz.R;
import com.example.beepz.services.model.TrackerModel;

import java.util.List;

public class TrackerAdapter extends RecyclerView.Adapter<TrackerAdapter.mViewHolder> {

    private List<TrackerModel> trackers;
    private int level;
    private Context context;

    public TrackerAdapter(List<TrackerModel> trackers, int level, Context context) {
        this.trackers = trackers;
        this.level = level;
        this.context = context;
    }

    @NonNull
    @Override
    public mViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.tracker_card, parent, false);
        return new mViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull mViewHolder holder, int position) {
        TrackerModel current = trackers.get(position);
        if (position == 0) holder.mView.setVisibility(View.GONE);
        else holder.mView.setVisibility(View.VISIBLE);

        holder.mTracker.setText(current.getName());
        if (position < level){
            holder.mTracker.setTextColor(context.getResources().getColor(R.color.orange));
            holder.mCircle.setBackgroundResource(current.getCircleColored());
            holder.mImage.setBackgroundResource(current.getImageColored());
            holder.mView.setBackgroundColor(context.getResources().getColor(R.color.black));

        }else {
            holder.mCircle.setBackgroundResource(current.getCircleNormal());
            holder.mImage.setBackgroundResource(current.getImageNormal());
        }
    }

    @Override
    public int getItemCount() {
        return trackers != null ? trackers.size():0;
    }

    public class mViewHolder extends RecyclerView.ViewHolder{

        ImageView mCircle, mImage;
        TextView mTracker;
        View mView;
        public mViewHolder(@NonNull View itemView) {
            super(itemView);

            mCircle = itemView.findViewById(R.id.circle);
            mImage = itemView.findViewById(R.id.image);
            mTracker = itemView.findViewById(R.id.text);
            mView = itemView.findViewById(R.id.view);
        }
    }
}
