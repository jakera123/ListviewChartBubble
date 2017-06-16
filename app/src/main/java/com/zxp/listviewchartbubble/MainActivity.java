package com.zxp.listviewchartbubble;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Message> msgList;
    private MessageAdapter mAdapter;
    private EditText et_left_ziling,et_right_jiaxuan;
    private Button btn_left_ziling,btn_right_jiaxuan;
    private ListView lv_chat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msgList=new ArrayList<>();
        et_left_ziling=(EditText)findViewById(R.id.et_left);
        et_right_jiaxuan=(EditText)findViewById(R.id.et_right);

        btn_left_ziling=(Button)findViewById(R.id.btn_left);
        btn_left_ziling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String word=et_left_ziling.getText().toString();
                Message ziling_word=new Message(0,word);
                msgList.add(ziling_word);
                mAdapter.notifyDataSetChanged();
                lv_chat.setAdapter(mAdapter);
                lv_chat.setSelection(mAdapter.getCount()-1);
                et_left_ziling.setText("");
            }
        });
        btn_right_jiaxuan=(Button)findViewById(R.id.btn_right);
        btn_right_jiaxuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String word=et_right_jiaxuan.getText().toString();
                Message jiaxuan_word=new Message(1,word);
                msgList.add(jiaxuan_word);
                mAdapter.notifyDataSetChanged();
                lv_chat.setAdapter(mAdapter);
                lv_chat.setSelection(mAdapter.getCount()-1);
                et_right_jiaxuan.setText("");
            }
        });

        initMessage();
        mAdapter=new MessageAdapter(msgList,MainActivity.this);
        lv_chat=(ListView)findViewById(R.id.lv_chat);
        lv_chat.setAdapter(mAdapter);
        lv_chat.setSelection(mAdapter.getCount()-1);



    }

    private void initMessage(){
        Message message1=new Message(0,"Hi,嘉轩");
        msgList.add(message1);
        Message message2=new Message(1,"Hi,子霖");
        msgList.add(message2);
        Message message3=new Message(0,"你狗日的就知道倔");
        msgList.add(message3);
        Message message4=new Message(1,"…………");
        msgList.add(message4);
        Message message5=new Message(0,"自己的儿子也不管管");
        msgList.add(message5);
        Message message6=new Message(1,"…………");
        msgList.add(message6);
        Message message7=new Message(0,"你看我干啥");
        msgList.add(message7);
        Message message8=new Message(1,"那你家兆鹏，你管？");
        msgList.add(message8);
        Message message9=new Message(0,"…………狗日的");
        msgList.add(message9);









    }





}
