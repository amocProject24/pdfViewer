package com.example.exam.pdfviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class TCS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view);

        ArrayList<String> bookList = new ArrayList<String>();

        bookList.add("Theoretical Computer science");

        GridView gridView = (GridView) findViewById(R.id.grid);
        BookAdapter adapter = new BookAdapter(this,R.color.secondYear,bookList);
        gridView.setAdapter(adapter);
    }
}