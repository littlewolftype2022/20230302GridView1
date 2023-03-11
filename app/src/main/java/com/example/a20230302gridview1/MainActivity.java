package com.example.a20230302gridview1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    private GridView mGridView;
    private String[] mStrArrays = {
            String.valueOf('A'), String.valueOf('B'),
            String.valueOf('C'), String.valueOf('D'),
            String.valueOf('E'), String.valueOf('F'),
            String.valueOf('G'), String.valueOf('H'),
            String.valueOf('I'), String.valueOf('J'),
            String.valueOf('K'), String.valueOf('L')
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGridView = (GridView) findViewById(R.id.gridView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_gallery_item,mStrArrays);
        mGridView.setAdapter(arrayAdapter);
    }
}