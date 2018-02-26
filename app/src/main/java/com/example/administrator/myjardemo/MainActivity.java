package com.example.administrator.myjardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mylibrary.Uuu;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void textOnclick(View view) {
        Toast.makeText(this, ""+ Uuu.getData(), Toast.LENGTH_SHORT).show();
    }
}
