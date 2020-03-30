package com.example.bao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.ocpsoft.prettytime.PrettyTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Customadapter extends ArrayAdapter<Docbao> {

    public Customadapter(Context context, int resource, List<Docbao> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            view = inflater.inflate(R.layout.custom_listview, null);
        }
        Docbao p = getItem(position);
        if (p != null) {
            // Anh xa + Gan gia tri
            TextView txtTitle = (TextView) view.findViewById(R.id.txttitle);
            txtTitle.setText(p.title);
            TextView txtTime = (TextView) view.findViewById(R.id.txtTime);
            txtTime.setText(dateTime(p.pubDate));
            ImageView imageView = view.findViewById(R.id.imganh);
            Picasso.with(getContext()).load(p.image).into(imageView);
        }
        return view;
    }
    public String dateTime(String t) {
        PrettyTime prettyTime = new PrettyTime(Locale.ENGLISH);
        String time = null;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z", Locale.ENGLISH);
            Date date = simpleDateFormat.parse(t);
            time = prettyTime.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return time;
    }

}