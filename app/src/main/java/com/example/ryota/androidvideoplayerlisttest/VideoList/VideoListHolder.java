package com.example.ryota.androidvideoplayerlisttest.VideoList;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.ryota.androidvideoplayerlisttest.R;

public class VideoListHolder extends RecyclerView.ViewHolder {
    public TextView videoNameTextView;
    public VideoListHolder(View itemView) {
        super(itemView);
        videoNameTextView = itemView.findViewById(R.id.videoNameTextView);
    }
}
