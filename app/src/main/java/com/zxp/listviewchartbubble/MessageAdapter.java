package com.zxp.listviewchartbubble;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by xiaoxin on 2017/6/16.
 */

public class MessageAdapter extends BaseAdapter {

    private ArrayList<Message> msgList;
    private LayoutInflater mInflater;

    public MessageAdapter(ArrayList<Message> msgList, Context context) {
        this.msgList = msgList;
        mInflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return msgList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        Message msg=msgList.get(position);
        return msg.getUserid();
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        ViewHolder viewHolder;
        if(convertView==null){
            if(getItemViewType(position)==0){
                view=mInflater.inflate(R.layout.chat_left,null);
                viewHolder=new ViewHolder();
              //  viewHolder.icon=(ImageView)view.findViewById(R.id.iv_icon_left);
                viewHolder.text=(TextView)view.findViewById(R.id.tv_left);
            }else {
                view=mInflater.inflate(R.layout.chart_right,null);
                viewHolder=new ViewHolder();
               // viewHolder.icon=(ImageView)view.findViewById(R.id.iv_icon_right);
                viewHolder.text=(TextView)view.findViewById(R.id.tv_right);
            }
            view.setTag(viewHolder);
        }else{
            view=convertView;
            viewHolder=(ViewHolder)view.getTag();
        }
        viewHolder.text.setText(msgList.get(position).getContent());
        return view;
    }

    static class ViewHolder{
       // ImageView icon;
        TextView text;
    }



}
