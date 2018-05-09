package com.example.ryota.androidvideoplayerlisttest;

import android.content.Intent;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RowClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TypedArray array = getResources().obtainTypedArray(R.array.video);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        VideoListAdapter adapter = new VideoListAdapter(this, videoRowData(array) ,this);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    public List<VideoRowData> videoRowData(TypedArray array){
        List<VideoRowData> list = new ArrayList<>();
        for(int i = 0;i<array.length();i++){
            VideoRowData data = new VideoRowData();
            String str = (String) array.getText(i);
            String path = (String) array.getText(i);
            str = str.substring(8,str.length()-4);
            str = str.replace("_"," ");
            data.setVideoName(str);

            data.setPath(path.substring(0,str.length()-4));
            list.add(data);
        }

        return list;
    }

    @Override
    public void rowClicked(VideoRowData rowData) {
        Intent intent = new Intent(MainActivity.this,VideoPlayActivity.class);
        Log.d("test", String.valueOf(rowData.getPath()));
        intent.putExtra("text",rowData.getPath());
        startActivity(intent);
    }
}
