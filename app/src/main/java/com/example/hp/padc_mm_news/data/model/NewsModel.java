package com.example.hp.padc_mm_news.data.model;

import com.example.hp.padc_mm_news.data.vo.NewsVO;
import com.example.hp.padc_mm_news.events.RestApiEvents;
import com.example.hp.padc_mm_news.network.MMNewsDataAgentImpl;
import com.example.hp.padc_mm_news.utils.AppConstants;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by HP on 12/3/2017.
 */

public class NewsModel {

    private static NewsModel objInstance;
    private List<NewsVO> mNews;
    private int mmNewsPageIndex =1;
    //private Map<String, NewsVO> mNewsVOMap;

    private NewsModel(){
        EventBus.getDefault().register(this);
        mNews = new ArrayList<>();
    }

    public static NewsModel getInstance(){
        if (objInstance == null){
            objInstance = new NewsModel();
        }
        return objInstance;
    }

    public void startLoadingMMNews(){
        MMNewsDataAgentImpl.getInstance().loadMMNews(AppConstants.ACCESS_TOKEN, mmNewsPageIndex);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onNewsDataLoaded(RestApiEvents.NewsDataLoadedEvent event){
        mNews.addAll(event.getLoadedNews());
        mmNewsPageIndex = event.getLoadedPageIndex()+1;
    }

//    public List<NewsVO> getmNewsList() {
//        if (mNewsVOMap == null)
//            return new ArrayList<>();
//
//        return new ArrayList<>(mNewsVOMap.values());
//    }


}
