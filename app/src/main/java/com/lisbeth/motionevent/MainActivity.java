package com.lisbeth.motionevent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.graphics.Color;
import android.os.Bundle;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class MainActivity  extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener{
    private static  final String DEBUG_TAG = "Gestures";
    private GestureDetectorCompat mDetector;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDetector = new GestureDetectorCompat(this,this);
        mDetector.setOnDoubleTapListener(this);

        getSupportActionBar().hide();
    }


    @Override
    public boolean onTouchEvent(MotionEvent event){
        if (this.mDetector.onTouchEvent(event)) {

            return true;
        }

        return super.onTouchEvent(event);
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent event1, MotionEvent event2, float distanceX,
                            float distanceY) {
        return true;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        View view5 = findViewById(R.id.view5);
        view5.setBackgroundResource(R.color.cardColor5_hover);
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        try {
            float diffY = motionEvent1.getY() - motionEvent.getY();
            float diffX = motionEvent1.getX() - motionEvent.getX();

            if (Math.abs(diffX) >Math.abs(diffY)){
                if (Math.abs(diffX)> 100 && Math.abs(v)>100){
                    if (diffX>0){
                        View view1 = findViewById(R.id.view1);
                        view1.setBackgroundResource(R.color.cardColor1_hover);
                    }else {
                        View view2 = findViewById(R.id.view2);
                        view2.setBackgroundResource(R.color.cardColor1_defaul);
                    }
                }
            }else{
                if (diffY>0){
                    View view3 = findViewById(R.id.view3);
                    view3.setBackgroundResource(R.color.cardColor3_hover);
                }else if(diffY<0){
                    View view4 = findViewById(R.id.view4);
                    view4.setBackgroundResource(R.color.cardColor2_defaul);
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }


    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }
}


