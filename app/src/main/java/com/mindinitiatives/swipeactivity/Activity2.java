package com.mindinitiatives.swipeactivity;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.r0adkll.slidr.Slidr;
import com.r0adkll.slidr.model.SlidrInterface;


public class Activity2 extends AppCompatActivity {

    Button lockSlide, unlockSlide;
    SlidrInterface slidr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        slidr = Slidr.attach(this);

        lockSlide = findViewById(R.id.lockSlide);
        unlockSlide = findViewById(R.id.unlockSlide);

        lockSlide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slidr.lock();
            }
        });
        unlockSlide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slidr.unlock();
            }
        });
    }


}
