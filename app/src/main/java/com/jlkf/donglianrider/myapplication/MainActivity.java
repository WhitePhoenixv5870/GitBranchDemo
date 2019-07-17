package com.jlkf.donglianrider.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void main() {
        Log.d("MainActivity", "主代码");
        Log.d("MainActivity", "主代码第一次修改");
        Log.d("MainActivity", "主代码第二次修改");



    }

    public void branch1(){
        Log.d("MainActivity","分支1");
    }


    public void branch2(){
        Log.d("MainActivity","分支2");
    }

    public void branch3(){
        Log.d("MainActivity","分支3");
    }

    public void branch4(){
        Log.d("MainActivity","分支4");
    }

    public void branch5(){
        Log.d("MainActivity","分支5");
    }

}
