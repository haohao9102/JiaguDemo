package com.example.conponent_1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.library.AutoFlowLayout;
import com.example.library.FlowAdapter;

import java.util.ArrayList;
import java.util.List;

public class TestActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        final List<String> list = new ArrayList<>();
        list.add("第1");
        list.add("第2");
        list.add("第3");
        list.add("第4");
        list.add("第5");
        list.add("第6");
        list.add("第7");
        list.add("第8");
        list.add("第9");
        list.add("第10");
        list.add("第11");
        list.add("第12");
        list.add("第13");

        AutoFlowLayout layout = findViewById(R.id.at_layout);

        layout.setAdapter(new FlowAdapter(list) {
            @Override
            public View getView(int position) {
                View view = LayoutInflater.from(getApplicationContext()).inflate(R.layout.item_layout, null);
                TextView name = view.findViewById(R.id.tv_name);
                name.setText(list.get(position));
                return view;
            }
        });
        layout.setOnItemClickListener(new AutoFlowLayout.OnItemClickListener() {
            @Override
            public void onItemClick(int i, View view) {
                Toast.makeText(TestActivity.this, "点击了第 " + (i+1) + " 数据", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
