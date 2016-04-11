package com.example.www.myapplication;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TaskFeedBackActivity extends AppCompatActivity {
    private ListView myListview;
    public List<Map<String, Object>> mData;
    //创建数据源
    String [] titles = new String[]{"太极股份有限公司1","太极股份有限公司2","太极股份有限公司3","太极股份有限公司4","太极股份有限公司5","太极股份有限公司6","太极股份有限公司7","太极股份有限公司8"};
    String [] add1 = new String[]{"海关总署1","海关总署","海关总署","海关总署","海关总署","海关总署","海关总署","海关总署8",};
    String [] add2 = new String[]{"办公厅1","办公厅1","办公厅1","办公厅1","办公厅1","办公厅1","办公厅8","办公厅8"};
    String [] date = new String[]{"2016","2016","2016","2016","2016","2016","2016","2016"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_feed_back);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        myListview = (ListView)findViewById(R.id.listview);
        mData= getData();
        MyAdapter myAdapter = new MyAdapter(this);
        myListview.setAdapter(myAdapter);


    }

    private List<Map<String, Object>> getData(){
        List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < titles.length; i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("titles", titles[i]);
            map.put("add1", add1[i]);
            map.put("add2", add2[i]);
            map.put("date", date[i]);
            data.add(map);
        }
        return data;
    }

    public void popDialog(){
        new AlertDialog.Builder(this).setTitle("信息反馈").setMessage("详情介绍。。。。").setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(TaskFeedBackActivity.this, "lalal", Toast.LENGTH_SHORT).show();
            }
        }).show();
    }
    public class MyAdapter extends BaseAdapter {

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
            viewHolder.tv_title.setText((String)mData.get(position).get("titles"));
            viewHolder.tv_add1.setText((String) mData.get(position).get("add1"));
            viewHolder.tv_add1.setText((String)mData.get(position).get("add2"));
            viewHolder.tv_add1.setText((String)mData.get(position).get("date"));
            viewHolder.bt_info.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    popDialog();
                }
            });
            viewHolder.bt_feed.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    popDialog();
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

}
