package com.example.drawable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textview;

    GestureDetector detector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview = findViewById(R.id.textView);

        View view = findViewById(R.id.view);
        view.setOnTouchListener( new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();
                float x = event.getX();
                float y = event.getY();

                if ( action == MotionEvent.ACTION_DOWN){
                    prints("손가락 눌림 : " + x + " " + y);
                }
                else if ( action == MotionEvent.ACTION_MOVE){
                    prints("손가락 움직임 : " + x + " " + y);
                }
                else {
                    prints("손가락 뗌 : " + x + " " + y);
                }

                return true;
            }
        });

    }

    public void prints(String data){
        textview.append(data + "\n");
    }


}
