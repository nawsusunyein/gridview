package com.example.gridviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

public class FullImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image);
        Intent imageIntent = getIntent();
        String imgName = imageIntent.getExtras().getString("imgName");
        ImageView fullImgView = (ImageView) findViewById(R.id.imgFullView);
        int id = getResources().getIdentifier(imgName, "drawable", this.getPackageName());
        fullImgView.setImageResource(id);
    }
}
