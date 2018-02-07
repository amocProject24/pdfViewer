package com.example.exam.pdfviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class DAAA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view);

        ArrayList<String> bookList = new ArrayList<String>();

        bookList.add("Introduction to Algorithms Cormen, Leiserson");
        bookList.add("Knuth, Donald E. : The Art of Computer Programming Vol I");
        bookList.add("Knuth, Donald E. :The Art of Computer Programming Vol 3");
        bookList.add("J. Kleinberg, E. Tardos: Algorithm Design");


        GridView gridView = (GridView) findViewById(R.id.grid);
        BookAdapter adapter = new BookAdapter(this,R.color.thirdYear,bookList);
        gridView.setAdapter(adapter);
    }
}
