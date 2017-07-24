package com.railtelindia.news;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Devesh Chaturvedi on 003-03-06-2017.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context,ArrayList<News> users){

        super(context,0,users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        News news = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        // Lookup view for data population
        TextView title = (TextView) convertView.findViewById(R.id.title);
        TextView author = (TextView) convertView.findViewById(R.id.author);
        TextView description = (TextView) convertView.findViewById(R.id.description);
        TextView time = (TextView) convertView.findViewById(R.id.time);
        // Populate the data into the template view using the data object

        title.setText(news.getmNewsTitle());
        author.setText(news.getmNewsAuthor());
        description.setText(news.getmNewsDescription());
        time.setText(news.getmNewsDate());
        // Return the completed view to render on screen
        return convertView;
    }
}
