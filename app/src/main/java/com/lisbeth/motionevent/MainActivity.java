package com.lisbeth.motionevent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.view.MotionEventCompat;

import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements
        GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener {
    private static  final String DEBUG_TAG = "Gestures";
    private GestureDetectorCompat mDetector;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        //View myView = findViewById(R.id.squareMain);
        mDetector = new GestureDetectorCompat(this,this);

        mDetector.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        if (this.mDetector.onTouchEvent(event)) {
            return true;
        }
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onDown(MotionEvent event) {
        Toast.makeText(this, "Scroll abajo", Toast.LENGTH_SHORT).show();
        return true;
    }

    @Override
    public boolean onFling(MotionEvent event1, MotionEvent event2,
                           float velocityX, float velocityY) {
        Toast.makeText(this, "Fling", Toast.LENGTH_SHORT).show();
        return true;
    }

    @Override
    public void onLongPress(MotionEvent event) {
        Toast.makeText(this, "Aplastar durante rato", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onScroll(MotionEvent event1, MotionEvent event2, float distanceX,
                            float distanceY) {
        Toast.makeText(this, "Scroll "+distanceX+" to "+ distanceY, Toast.LENGTH_SHORT).show();
        return true;
    }

    @Override
    public void onShowPress(MotionEvent event) {
        Toast.makeText(this, "onShowPress ", Toast.LENGTH_SHORT).show();

    }

    @Override
    public boolean onSingleTapUp(MotionEvent event) {
        Toast.makeText(this, "onSingleTapUp ", Toast.LENGTH_SHORT).show();

        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent event) {
        Toast.makeText(this, "doble tap ", Toast.LENGTH_SHORT).show();
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent event) {
        Toast.makeText(this, "doble tap ", Toast.LENGTH_SHORT).show();

        return true;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent event) {
        Toast.makeText(this, "un tap ", Toast.LENGTH_SHORT).show();

        return true;
    }
}


