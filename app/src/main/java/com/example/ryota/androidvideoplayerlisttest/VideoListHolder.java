package com.example.ryota.androidvideoplayerlisttest;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


public class VideoListHolder extends RecyclerView.ViewHolder {
    public final TextView videoNameTextView;
    final LinearLayout linearLayout;
    VideoListHolder(View inflate) {
        super(inflate);
        this.videoNameTextView = inflate.findViewById(R.id.videoNameTextView);
        this.linearLayout = inflate.findViewById(R.id.linear_layout);
    }
}