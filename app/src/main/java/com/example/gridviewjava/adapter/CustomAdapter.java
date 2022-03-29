package com.example.gridviewjava.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.gridviewjava.R;

public class CustomAdapter extends BaseAdapter {
    Context context;
    int[] person;
    LayoutInflater inflter;
    public CustomAdapter(Context applicationContext, int[] person) {
        this.context = applicationContext;
        this.person = person;
        inflter = (LayoutInflater.from(applicationContext));
    }
    @Override
    public int getCount() {
        return person.length;
    }
    @Override
    public Object getItem(int i) {
        return null;
    }
    @Override
    public long getItemId(int i) {
        return 0;
    }
    @SuppressLint({"ViewHolder", "InflateParams"})
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.activity_iteam, null); // inflate the layout
        ImageView icon = view.findViewById(R.id.icon); // get the reference of ImageView
        icon.setImageResource(person[i]); // set logo images
        return view;
    }
}
