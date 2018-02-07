package com.example.exam.pdfviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class artificialintell extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view);

        ArrayList<String> bookList = new ArrayList<String>();


        bookList.add("Elaine Rich, K. Knight Artificial Intelligence");
        bookList.add("S. Russell and P. Norvig,  Artificial Intelligence: A Modern Approach");
        bookList.add("I. Bratko, Prolog Programming for Artificial Intelligence");
        bookList.add("C. M. Bishop,  Pattern Recognition and Machine Learning");

        GridView gridView = (GridView) findViewById(R.id.grid);
        BookAdapter adapter = new BookAdapter(this,R.color.thirdYear,bookList);
        gridView.setAdapter(adapter);
    }
}
