package com.example.student.loginmvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DashboardActivity extends AppCompatActivity {

    ListView listView;
    String[] items = {"Item 1","Item 2","Item 3","Item 4","Item 5","Item 6","Item 7"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        listView= (ListView) findViewById(R.id.listView1);
        ArrayAdapter adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,items);
        listView.setAdapter(adapter);
    }
}
