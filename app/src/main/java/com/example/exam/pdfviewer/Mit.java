package com.example.exam.pdfviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class Mit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view);

        ArrayList<String> bookList = new ArrayList<String>();


        bookList.add("Brey, The Intel Microprocessors");

        GridView gridView = (GridView) findViewById(R.id.grid);
        BookAdapter adapter = new BookAdapter(this,R.color.thirdYear,bookList);
        gridView.setAdapter(adapter);
    }
}
