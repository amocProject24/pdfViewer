package com.example.exam.pdfviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class SecondYear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view);

        ArrayList<String> subjectList = new ArrayList<String>();

        subjectList.add("Data Structures and Algorithms");
        subjectList.add("Computer Organization");
        subjectList.add("Digital Circuits");
        subjectList.add("Discrete Mathematics");
        subjectList.add("Electrical Networks");
        subjectList.add("Theoretical Computer Science");
        subjectList.add("Database Management Systems");
        subjectList.add("Engineering Mathematics III");
        subjectList.add("Communication Systems");
        subjectList.add("Control Systems");

        GridView gridView = (GridView) findViewById(R.id.grid);
        SubjectAdapter adapter = new SubjectAdapter(this, R.color.secondYear,subjectList);
        gridView.setAdapter(adapter);
    }
}
