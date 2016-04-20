package com.nanodegree.android.sunshine;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Elias on 19/04/2016.
 */
public class ForecastArrayAdapter extends ArrayAdapter<String> {
    private List<String> strings;

    public ForecastArrayAdapter(Context context, int resource, List objects) {
        super(context, resource, objects);
        strings = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        if(row == null) {
            LayoutInflater inflater = ((Activity) getContext()).getLayoutInflater();
            row = inflater.inflate(R.layout.list_item_forecast, parent, false);
        }
        TextView tv = (TextView) row.findViewById(R.id.list_item_forecast_textview);
        tv.setText(strings.get(position));

        return row;
    }
}
