package com.railtelindia.news;

/**
 * Created by Devesh Chaturvedi on 003-03-06-2017.
 */

public class News {

    private String mNewsAuthor;
    private String mNewsTitle;
    private String mNewsDescription;
    private String mNewsUrl;
    private String mNewsDate;

    public News(String author,String title,String description,String url,String date){

        mNewsAuthor = author;
        mNewsTitle = title;
        mNewsDescription = description;
        mNewsUrl = url;
        mNewsDate = date;
    }

    public String getmNewsAuthor() {
        return mNewsAuthor;
    }

    public String getmNewsTitle() {
        return mNewsTitle;
    }

    public String getmNewsDescription() {
        return mNewsDescription;
    }

    public String getmNewsUrl() {
        return mNewsUrl;
    }

    public String getmNewsDate() {
        return mNewsDate;
    }
}
