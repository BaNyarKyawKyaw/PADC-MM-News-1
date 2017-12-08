package com.example.hp.padc_mm_news;

import android.app.Application;

import com.example.hp.padc_mm_news.data.model.NewsModel;

/**
 * Created by E5-575G on 11/4/2017.
 */

public class MMNewsApp extends Application {

    public static final String LOG_TAG = "MMNewsApp";

    @Override
    public void onCreate() {
        super.onCreate();
        NewsModel.getInstance().startLoadingMMNews();
    }
}
