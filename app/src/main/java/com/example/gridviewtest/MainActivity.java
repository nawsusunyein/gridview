package com.example.gridviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String[] thumnailImages = {
            "img1","img2","img3","img4","img5","img6","img1","img2","img3","img4","img5","img6",
    };

    private String[] imageNames = {"Error 1","Error 2","Error 3","Error 4","Error 5","Error 6","Error 7","Error 8","Error 9","Error 10","Error 11","Error 12"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gridView = (GridView) findViewById(R.id.gvView);
        ImageAdapter gridArrayAdapter = new ImageAdapter(this,R.layout.gv_cell,thumnailImages,imageNames);
        gridView.setAdapter(gridArrayAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent fullImageIntent = new Intent(MainActivity.this,FullImageActivity.class);
                fullImageIntent.putExtra("pos",position);
                fullImageIntent.putExtra("imgName",thumnailImages[position]);
                startActivity(fullImageIntent);
                Toast.makeText(MainActivity.this, imageNames[position]+" Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
