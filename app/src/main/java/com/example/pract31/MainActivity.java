package com.example.pract31;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnDoubleTapListener,
        GestureDetector.OnGestureListener, View.OnTouchListener {

    ImageView imageMish;
    private TextView txt;
    private GestureDetectorCompat gdc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView)findViewById(R.id.Text);
        gdc = new GestureDetectorCompat(this,this);
        gdc.setOnDoubleTapListener(this);
        startService(new Intent(this, OnSwipeTouchListener.class));

    }



    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        gdc.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
    @Override
    public boolean onSingleTapConfirmed(@NonNull MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onDoubleTap(@NonNull MotionEvent motionEvent) {

        return false;
    }

    @Override
    public boolean onDoubleTapEvent(@NonNull MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onDown(@NonNull MotionEvent motionEvent) {
        txt.setText("Свап вниз?");
        return false;
    }

    @Override
    public void onShowPress(@NonNull MotionEvent motionEvent) {

    }

    @Override
    public boolean onSingleTapUp(@NonNull MotionEvent motionEvent) {
        txt.setText("onSingleTapUp");

        return false;
    }

    @Override
    public boolean onScroll(@NonNull MotionEvent motionEvent, @NonNull MotionEvent motionEvent1, float v, float v1) {
        txt.setText("onScroll ");
//        Intent intent2 = new Intent(this, MainActivity3.class);
//        startActivity(intent2);
        return false;
    }

    @Override
    public void onLongPress(@NonNull MotionEvent motionEvent) {

txt.setText("onLongPress: ");

    }





    @Override
    public boolean onFling(@Nullable MotionEvent motionEvent, @NonNull MotionEvent motionEvent1, float v, float v1) {
        return false;
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }
}

