package com.example.exam.pdfviewer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * Created by Admin1 on 2/6/2018.
 */

public class Physics extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view);

        ArrayList<String> bookList = new ArrayList<String>();

        bookList.add("Physics by R. Resnick and D. Halliday");

        GridView gridView = (GridView) findViewById(R.id.grid);
        BookAdapter adapter = new BookAdapter(this,R.color.firstYear,bookList);
        gridView.setAdapter(adapter);
    }
}
