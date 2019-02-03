package com.example.zozancan.landmarkbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        TextView textView = (TextView) findViewById(R.id.textView);

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");

        textView.setText(name);

        imageView.setImageBitmap(MainActivity.selectedImage);
    }
}
