package com.example.ryota.androidvideoplayerlisttest.VideoList;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ryota.androidvideoplayerlisttest.R;

import java.util.List;

public class VideoListAdapter extends RecyclerView.Adapter<VideoListHolder> {
    private List<VideoRowData> videoRowDataList;

    public VideoListAdapter(List<VideoRowData> list){
        this.videoRowDataList = list;
    }

    @NonNull
    @Override
    public VideoListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_data,parent,false);
        VideoListHolder videoListHolder = new VideoListHolder(inflate);
        return videoListHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull VideoListHolder holder, int position) {
        holder.videoNameTextView.setText(videoRowDataList.get(position).getVideoName());
    }

    @Override
    public int getItemCount() {
        return videoRowDataList.size();
    }
}