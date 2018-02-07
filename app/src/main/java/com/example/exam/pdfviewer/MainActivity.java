package com.example.exam.pdfviewer;

import android.content.Intent;
import android.net.Uri;
import android.os.TestLooperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.time.Year;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView firstYear = (TextView) findViewById(R.id.first_year);
        TextView secondYear = (TextView) findViewById(R.id.second_year);
        TextView thirdYear = (TextView) findViewById(R.id.third_year);
        TextView finalYear = (TextView) findViewById(R.id.final_year);

        firstYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent firstYearIntent = new Intent(MainActivity.this,FirstYear.class);
                startActivity(firstYearIntent);*/
                Intent browserIntent = new Intent(MainActivity.this,FirstYear.class);
                startActivity(browserIntent);
            }
        });

        secondYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secondYearIntent = new Intent(MainActivity.this,SecondYear.class);
                startActivity(secondYearIntent);
            }
        });

        thirdYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thirdYearIntent = new Intent(MainActivity.this,ThirdYear.class);
                startActivity(thirdYearIntent);
            }
        });

        finalYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent finalYearIntent = new Intent(MainActivity.this,FinalYear.class);
                startActivity(finalYearIntent);
            }
        });
    }
}
