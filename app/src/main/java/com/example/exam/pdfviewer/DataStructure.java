package com.example.exam.pdfviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class DataStructure extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view);

        ArrayList<String> bookList = new ArrayList<String>();

        bookList.add("Introduction to Algorithms by T. H. Cormen, C. E. Leiserson, R. L. Rivest");
        bookList.add("Algorithms by S. Dasgupta, C. H. Papadimitriou, and U. V. Vazirani");
        bookList.add("Computer Algorithms by Horowitz and Sahani");
        bookList.add("Data Structures and Program Design in C++ by Robert L. Kruse and Alexander J. Ryba");

        GridView gridView = (GridView) findViewById(R.id.grid);
        BookAdapter adapter = new BookAdapter(this,R.color.secondYear,bookList);
        gridView.setAdapter(adapter);
    }
}
