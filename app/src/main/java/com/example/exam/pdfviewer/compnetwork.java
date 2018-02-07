package com.example.exam.pdfviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class compnetwork extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view);

        ArrayList<String> bookList = new ArrayList<String>();


        bookList.add("Tanenbaum, Computer Network");
        bookList.add("William Stalling: Data and Computer Communication");
        bookList.add("Douglas E. Comer: Internetworking with TCP/IP Volume - I");
        bookList.add("B. Forouzan : Data Communication And Networking");


        GridView gridView = (GridView) findViewById(R.id.grid);
        BookAdapter adapter = new BookAdapter(this,R.color.thirdYear,bookList);
        gridView.setAdapter(adapter);
    }
}
