package com.example.event;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    GestureDetector detector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        View view = findViewById(R.id.view);
        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();

                float curX = event.getX();
                float cury = event.getY();
                if(action == MotionEvent.ACTION_DOWN) {
                    println("눌림 : " + curX + ',' + cury);
                }
                else if ( action == MotionEvent.ACTION_MOVE) {
                    println("움직임 : " + curX + ',' + cury);
                }
                else if ( action == MotionEvent.ACTION_UP){
                    println("손 땜 : " + curX + ',' + cury);
                }

                return true;
            }
        });


        detector = new GestureDetector(this, new GestureDetector.OnGestureListener() {
            @Override
            public boolean onDown(MotionEvent e) {
                return false;
            }

            @Override
            public void onShowPress(MotionEvent e) {

            }

            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                return false;
            }

            @Override
            public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
                return false;
            }

            @Override
            public void onLongPress(MotionEvent e) {

            }

            @Override
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                return false;
            }
        });
        View view2 = findViewById(R.id.view2);


        view2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
             detector.onTouchEvent(event);
             return true;
            }
        });

    }


    public void println(String data){
        textView.append(data + "\n");
    }



}
