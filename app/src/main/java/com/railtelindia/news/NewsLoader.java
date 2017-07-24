package com.railtelindia.news;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by Devesh Chaturvedi on 003-03-06-2017.
 */

public class NewsLoader extends AsyncTaskLoader<List<News>> {

    String Url;
    public NewsLoader(Context context, String url) {
        super(context);
        Url=url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<News> loadInBackground() {
        if (Url.length() < 1 || Url == null) {
            return null;
        }
        List<News> result = QueryNews.fetchNewsData(Url);
        return result;
    }
}
