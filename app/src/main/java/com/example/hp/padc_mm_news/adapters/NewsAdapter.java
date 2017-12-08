package com.example.hp.padc_mm_news.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.example.hp.padc_mm_news.R;
import com.example.hp.padc_mm_news.data.vo.NewsVO;
import com.example.hp.padc_mm_news.delegates.NewsItemsDelegate;
import com.example.hp.padc_mm_news.viewholders.NewsViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by E5-575G on 11/4/2017.
 */

public class NewsAdapter extends BaseRecyclerAdapter<NewsViewHolder, NewsVO> {

    private NewsItemsDelegate mNewsItemDelegate;

    public NewsAdapter(Context context, NewsItemsDelegate newsItemsDelegate) {
        super(context);
        mNewsItemDelegate = newsItemsDelegate;
        mData = new ArrayList<>();
    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        /*
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        *   We can also get the context by above way
        */
        View newsItemView = mLayoutInflater.inflate(R.layout.view_item_news, parent, false);
        return new NewsViewHolder(newsItemView, mNewsItemDelegate);
    }
}
