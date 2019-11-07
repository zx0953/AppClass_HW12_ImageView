package com.example.appclass_hw12_imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean click = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void BtnOnclick(View view){
        ImageView imageview = findViewById(R.id.imageView);
        if(click){
            imageview.setImageResource(R.drawable.image2);
            click = false;
        }else {
            imageview.setImageResource(R.drawable.image1);
            click = true;
        }
    }
}
