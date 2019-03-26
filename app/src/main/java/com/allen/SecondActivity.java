package com.allen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ACache aCache = new ACache();
        Log.d("wbl", ACache.Companion.getName());
    }

    private int sum(int a, int b){
        return a+b;
    }
}
