package com.allen;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class SecondActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        InitOrderDemo kangkang = new InitOrderDemo("Kangkang");
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

        List<Integer> list = Arrays.asList(1, 1, 2, 2, 3, 4, 5);
        List<Integer> collect = list.stream().map(i -> i * 3).filter(i -> i <= 13).distinct().collect(Collectors.toList());

    }

    private int sum(int a, int b) {
        return a + b;
    }
}
