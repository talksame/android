package com.example.study33;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showToast("Oncreate");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        showToast("OnDestroy");
    }

    public void showToast(String data){
        Toast.makeText(this,data, Toast.LENGTH_SHORT).show();
    }


}
