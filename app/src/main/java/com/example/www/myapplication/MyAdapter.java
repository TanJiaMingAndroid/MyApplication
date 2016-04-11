package com.example.www.myapplication;

import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.Map;

/**
 * Created by 39481 on 2016/4/11.
 */
/*
public class MyAdapter extends BaseAdapter {
    public List<Map<String, Object>> mData;
    private LayoutInflater mInflater;
    public MyAdapter(Context context) {
        this.mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null){
            viewHolder = new ViewHolder();
            convertView = mInflater.inflate(R.layout.item,null);
            viewHolder.tv_title = (TextView)convertView.findViewById(R.id.tv_title);
            viewHolder.tv_add1 = (TextView)convertView.findViewById(R.id.add1);
            viewHolder.tv_add2 = (TextView)convertView.findViewById(R.id.add2);
            viewHolder.tv_date = (TextView)convertView.findViewById(R.id.date);
            viewHolder.bt_info = (Button)convertView.findViewById(R.id.bt_info);
            viewHolder.bt_feed = (Button)convertView.findViewById(R.id.bt_feed);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder)convertView.getTag();
        }
        viewHolder.tv_title.setText((String)mData.get(position).get("title"));
        viewHolder.tv_add1.setText((String) mData.get(position).get("add1"));
        viewHolder.tv_add1.setText((String)mData.get(position).get("add2"));
        viewHolder.tv_add1.setText((String)mData.get(position).get("date"));
        viewHolder.bt_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        viewHolder.bt_feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return convertView;
    }



    public class ViewHolder{
        private TextView tv_title;
        private TextView tv_add1;
        private TextView tv_add2;
        private TextView tv_date;
        private Button bt_info;
        private Button bt_feed;
    }
}
*/
