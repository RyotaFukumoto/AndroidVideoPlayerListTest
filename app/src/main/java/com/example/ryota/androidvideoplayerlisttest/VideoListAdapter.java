package com.example.ryota.androidvideoplayerlisttest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

class VideoListAdapter extends RecyclerView.Adapter<VideoListHolder> {
    private final List<VideoRowData> videoRowDataList;
    private final RowClickListener rowClickListener;
    private View.OnClickListener listener;


    VideoListAdapter(Context context, List<VideoRowData> list, RowClickListener listener) {
        super();

        this.videoRowDataList = list;
        this.rowClickListener = listener;
    }

    @NonNull
    @Override
    public VideoListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_data,parent,false);
        return new VideoListHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull VideoListHolder holder, int position) {
        final VideoRowData rowData = this.videoRowDataList.get(position);
        holder.videoNameTextView.setText(rowData.getVideoName());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoListAdapter.this.rowClickListener.rowClicked(rowData);
            }
        });
    }


    @Override
    public int getItemCount() {
        return this.videoRowDataList.size();
    }
}
