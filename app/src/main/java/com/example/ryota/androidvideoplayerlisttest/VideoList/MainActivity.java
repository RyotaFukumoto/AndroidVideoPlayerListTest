package com.example.ryota.androidvideoplayerlisttest.VideoList;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.ryota.androidvideoplayerlisttest.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        VideoListAdapter adapter = new VideoListAdapter(this.createDataset());
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private List<VideoRowData> createDataset() {

        List<VideoRowData> dataset = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            VideoRowData data = new VideoRowData();
            data.setVideoName("曲" + i + "番");

            Log.d("videodata",""+i);
            dataset.add(data);
        }
        return dataset;
    }
}