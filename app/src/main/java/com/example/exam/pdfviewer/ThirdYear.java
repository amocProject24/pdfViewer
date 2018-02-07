package com.example.exam.pdfviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class ThirdYear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view);

        ArrayList<String> subjectList = new ArrayList<String>();

        subjectList.add("Microprocessor and Interfacing Techniques");
        subjectList.add("Design and Analysis of Algorithms");
        subjectList.add("Artificial Intelligence and Machine Learning");
        subjectList.add("Computer Networks");
        subjectList.add("Software Tools 3");
        subjectList.add("EIS - I");
        subjectList.add("Operating Systems");
        subjectList.add("System Software");
        subjectList.add("Computer Graphics");
        subjectList.add("Internet Technology and Applications");
        subjectList.add("Software Tools 4");
        subjectList.add("EIS - II");

        GridView gridView = (GridView) findViewById(R.id.grid);
        SubjectAdapter adapter = new SubjectAdapter(this, R.color.thirdYear,subjectList);
        gridView.setAdapter(adapter);
    }
}
