package com.example.exam.pdfviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class FinalYear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view);

        ArrayList<String> subjectList = new ArrayList<String>();

        subjectList.add("Software Engineering");
        subjectList.add("Cryptography and Network Security");
        subjectList.add("Principles of Programming Language");
        subjectList.add("Elective - I");
        subjectList.add("Distributed Algorithms");
        subjectList.add("Economics and Business Management");
        subjectList.add("EIS - I");
        subjectList.add("EIS - II");

        GridView gridView = (GridView) findViewById(R.id.grid);
        SubjectAdapter adapter = new SubjectAdapter(this, R.color.finalYear,subjectList);
        gridView.setAdapter(adapter);
    }
}
