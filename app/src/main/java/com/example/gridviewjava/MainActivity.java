package com.example.gridviewjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.gridviewjava.adapter.CustomAdapter;

public class MainActivity extends AppCompatActivity {
    GridView simpleGrid;
    public int person[] ={R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4,
            R.drawable.img5, R.drawable.img6, R.drawable.img7, R.drawable.img8, R.drawable.img9,
            R.drawable.img10,R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4,
            R.drawable.img5, R.drawable.img6,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleGrid = findViewById(R.id.gridview);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), person);
        simpleGrid.setAdapter(customAdapter);

        simpleGrid.setOnItemClickListener((parent, view, position, id) -> {

            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("image", person[position]); // put image data in Intent
            startActivity(intent); // start Intent
        });
    }

}