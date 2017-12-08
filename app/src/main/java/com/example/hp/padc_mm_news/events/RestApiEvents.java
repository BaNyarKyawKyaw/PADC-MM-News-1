package com.example.hp.padc_mm_news.events;

import com.example.hp.padc_mm_news.data.vo.NewsVO;

import java.util.List;

/**
 * Created by HP on 12/3/2017.
 */

public class RestApiEvents {

    public static class EmptyResponseEvent {
        private String emptyMsg;

        public EmptyResponseEvent(String emptyMsg) {
            this.emptyMsg = emptyMsg;
        }

        public String getEmptyMsg() {
            return emptyMsg;
        }
    }

    public static class ErrorInvokingAPIEvent {
        private String errorMsg;

        public ErrorInvokingAPIEvent(String errorMsg) {
            this.errorMsg = errorMsg;
        }

        public String getErrorMsg() {
            return errorMsg;
        }
    }

    public static class NewsDataLoadedEvent {
        private int loadedPageIndex;
        private List<NewsVO> loadedNews;

        public NewsDataLoadedEvent(int loadedPageIndex, List<NewsVO> loadedNews) {
            this.loadedPageIndex = loadedPageIndex;
            this.loadedNews = loadedNews;
        }

        public int getLoadedPageIndex() {
            return loadedPageIndex;
        }

        public List<NewsVO> getLoadedNews() {
            return loadedNews;
        }
    }
}
