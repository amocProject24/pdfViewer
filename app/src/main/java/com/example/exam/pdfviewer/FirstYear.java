package com.example.exam.pdfviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class FirstYear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view);

        ArrayList<String> subjectList = new ArrayList<String>();

        subjectList.add("Engineering Mathematics-I");
        subjectList.add("Basic Civil and Environmental Engineering");
        subjectList.add("Engineering Mechanics");
        subjectList.add("Engineering Physics");
        subjectList.add("Engineering Chemistry");
        subjectList.add("Engineering Drawing");
        subjectList.add("Engineering Mathematics-II");
        subjectList.add("Basic Electronics");
        subjectList.add("Electro Techniques");
        subjectList.add("English and Communication Skills");
        subjectList.add("Basic Mechanical Systems");
        subjectList.add("Fundamentals of Computer Programming");

        GridView gridView = (GridView) findViewById(R.id.grid);
        SubjectAdapter adapter = new SubjectAdapter(this,R.color.firstYear,subjectList);
        gridView.setAdapter(adapter);

    }
}
