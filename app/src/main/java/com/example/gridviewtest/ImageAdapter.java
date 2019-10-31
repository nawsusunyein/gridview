package com.example.gridviewtest;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

public class ImageAdapter extends ArrayAdapter {

    private String[] images = new String[]{};
    private String[] names = new String[]{};

    public ImageAdapter(@NonNull Context context, int resource,  String[] images, String[] names) {
        super(context, resource);
        this.images = images;
        this.names = names;
    }

    @Override
    public int getCount() {
        int positionCount = images.length;

        return images.length;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v;

        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        v = inflater.inflate(R.layout.gv_cell, null);

        TextView textView = (TextView) v.findViewById(R.id.tv);
        ImageView imageView = (ImageView) v.findViewById(R.id.ivGallery);

        int id = getContext().getResources().getIdentifier(images[position], "drawable", getContext().getPackageName());
        textView.setText(names[position]);
        imageView.setImageResource(id);

        return v;

    }


}
