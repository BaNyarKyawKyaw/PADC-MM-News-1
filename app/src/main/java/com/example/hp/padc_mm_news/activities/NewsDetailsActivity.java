package com.example.hp.padc_mm_news.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.example.hp.padc_mm_news.R;
import com.example.hp.padc_mm_news.adapters.NewsAdapter;
import com.example.hp.padc_mm_news.adapters.NewsImagesPagerAdapter;
import com.example.hp.padc_mm_news.adapters.RelatedNewsAdapter;
import com.example.hp.padc_mm_news.components.SmartRecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by HP on 11/11/2017.
 */

public class NewsDetailsActivity extends AppCompatActivity {

    @BindView(R.id.vp_news_details_images)
    ViewPager vpNewsDetailsImages;

    @BindView(R.id.rv_related_news_list)
    SmartRecyclerView rvRelatedNewsList;

    public static Intent newIntent(Context context){
        Intent intent = new Intent(context,NewsDetailsActivity.class);
        return intent;
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_details);
        ButterKnife.bind(this,this);

        NewsImagesPagerAdapter newsImagesPagerAdapter = new NewsImagesPagerAdapter(getApplicationContext());
        vpNewsDetailsImages.setAdapter(newsImagesPagerAdapter);

        RelatedNewsAdapter relatedNewsAdapter = new RelatedNewsAdapter(getApplicationContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        rvRelatedNewsList.setAdapter(relatedNewsAdapter);
        rvRelatedNewsList.setLayoutManager(linearLayoutManager);
    }
}
