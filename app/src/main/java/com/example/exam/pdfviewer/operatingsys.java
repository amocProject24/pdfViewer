package com.example.exam.pdfviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class operatingsys extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view);

        ArrayList<String> bookList = new ArrayList<String>();


        bookList.add("Silberschatz, Galvin and Gagne: Operating System Concepts");
        bookList.add("W. Stallings: Operating Systems: Internals and Design Principles");
        bookList.add("A Tanenbaum,A Woodhull: Operating Systems - Design and Implementation");
        bookList.add("Kernighan & Pike: UNIX programming Environment");

        GridView gridView = (GridView) findViewById(R.id.grid);
        BookAdapter adapter = new BookAdapter(this,R.color.thirdYear,bookList);
        gridView.setAdapter(adapter);
    }
}
