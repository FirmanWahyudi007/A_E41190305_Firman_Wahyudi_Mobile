package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button linear,scrollview,scrollhorizontal,relative,constraint,tabel,frame,material;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linear = (Button)findViewById(R.id.linearButton);
        linear.setOnClickListener(this);
        scrollview = (Button)findViewById(R.id.ViewButton);
        scrollview.setOnClickListener(this);
        scrollhorizontal = (Button)findViewById(R.id.HorizontalButton);
        scrollhorizontal.setOnClickListener(this);
        relative = (Button)findViewById(R.id.RelativeButton);
        relative.setOnClickListener(this);
        constraint = (Button)findViewById(R.id.ConstraintButton);
        constraint.setOnClickListener(this);
        tabel = (Button)findViewById(R.id.TabelButton);
        tabel.setOnClickListener(this);
        frame = (Button)findViewById(R.id.FrameButton);
        frame.setOnClickListener(this);
        material = (Button)findViewById(R.id.MaterialButton);
        material.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.linearButton:
                Intent linear = new Intent(MainActivity.this, LinearActivity.class);
                startActivity(linear);
                break;
            case R.id.ViewButton:
                Intent ScrollView = new Intent(MainActivity.this, ScrollViewActivity.class);
                startActivity(ScrollView);
                break;
            case R.id.HorizontalButton:
                Intent ScrollViewHorizon = new Intent(MainActivity.this, ScrollViewHorizontalActivity.class);
                startActivity(ScrollViewHorizon);
                break;
            case R.id.RelativeButton:
                Intent Relative = new Intent(MainActivity.this, RelativeActivity.class);
                startActivity(Relative);
                break;
            case R.id.ConstraintButton:
                Intent Constraint = new Intent(MainActivity.this, ConstraintActivity.class);
                startActivity(Constraint);
                break;
            case R.id.TabelButton:
                Intent Tabel = new Intent(MainActivity.this, TabelActivity.class);
                startActivity(Tabel);
                break;
            case R.id.FrameButton:
                Intent Frame = new Intent(MainActivity.this, FrameActivity.class);
                startActivity(Frame);
                break;
            case R.id.MaterialButton:
                Intent Material = new Intent(MainActivity.this, MaterialDesignActivity.class);
                startActivity(Material);
                break;
            default:
                break;
        }
    }

}