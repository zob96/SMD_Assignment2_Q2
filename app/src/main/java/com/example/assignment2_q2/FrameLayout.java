package com.example.assignment2_q2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FrameLayout extends AppCompatActivity implements View.OnClickListener {


    ImageView img1,img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);
        img1 =   findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img1.setOnClickListener(this);
        img2.setOnClickListener(this);

        Button btn= findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent i= new Intent(getApplicationContext(), RelativeLayout.class);
                startActivity(i);

            }
        });

    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.img1)
        {
            img1.setVisibility(View.GONE);
            img2.setVisibility(View.VISIBLE);
        }

        else if (view.getId() == R.id.img2)
        {
            img2.setVisibility(View.GONE);
            img1.setVisibility(View.VISIBLE);
        }

    }



}
