package com.allen;

import android.content.Context;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class ACache {

    public static String CACHE_DIR = "AppCaches";
    public static String CACHE_CONFIG_DIR = "AppConfigCaches";
    public static long MAX_SIZE = 1000 * 1000 * 50;  // 50 mb
    public static int MAX_COUNT = Integer.MAX_VALUE ;// 不限制存放数据的数量
    public static String RANDOM_KEY = "random_key";
    public static Map mInstanceMap = new HashMap<String, ACache>(8);


    private ACache(File cacheDir, Long max_size, int max_count, Context context, String cacheName) {

    }
}
