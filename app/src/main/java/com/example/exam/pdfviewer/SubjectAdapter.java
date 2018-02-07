package com.example.exam.pdfviewer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Admin1 on 2/3/2018.
 */

public class SubjectAdapter extends ArrayAdapter<String> {

    int colorResourceId;

    public SubjectAdapter(Activity context, int resource, ArrayList<String> subjectList){
        super(context,0,subjectList);
        colorResourceId=resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.subject_list,parent,false);
        }

        final String textView = getItem(position);
        TextView defaultWordView = (TextView) listItemView.findViewById(R.id.subject_name);
        defaultWordView.setText(textView);

        defaultWordView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Sem 1
                if(textView.equals("Engineering Physics")) {
                    Intent webIntent = new Intent(getContext(), Physics.class);
                    getContext().startActivity(webIntent);
                }
                if(textView.equals("Engineering Chemistry")) {
                    Intent webIntent = new Intent(getContext(), Chemistry.class);
                    getContext().startActivity(webIntent);
                }
                // Sem 3
                if(textView.equals("Data Structures and Algorithms")) {
                    Intent webIntent = new Intent(getContext(), DataStructure.class);
                    getContext().startActivity(webIntent);
                }
                if(textView.equals("Computer Organization")) {
                    Intent webIntent = new Intent(getContext(), ComputerOrganization.class);
                    getContext().startActivity(webIntent);
                }
                if(textView.equals("Digital Circuits")) {
                    Intent webIntent = new Intent(getContext(), DigitalCircuits.class);
                    getContext().startActivity(webIntent);
                }
                if(textView.equals("Discrete Mathematics")) {
                    Intent webIntent = new Intent(getContext(), DiscreteMaths.class);
                    getContext().startActivity(webIntent);
                }
                if(textView.equals("Electrical Networks")) {
                    Intent webIntent = new Intent(getContext(), NetworkAnalysis.class);
                    getContext().startActivity(webIntent);
                }

                // Sem4
                if(textView.equals("Theoretical Computer Science")) {
                    Intent webIntent = new Intent(getContext(), TCS.class);
                    getContext().startActivity(webIntent);
                }
                if(textView.equals("Database Management Systems")) {
                    Intent webIntent = new Intent(getContext(), DBMS.class);
                    getContext().startActivity(webIntent);
                }
                if(textView.equals("Engineering Mathematics III")) {
                    Intent webIntent = new Intent(getContext(), EM3.class);
                    getContext().startActivity(webIntent);
                }
                if(textView.equals("Communication Systems")) {
                    Intent webIntent = new Intent(getContext(), CommunicationSystem.class);
                    getContext().startActivity(webIntent);
                }
                if(textView.equals("Control Systems")) {
                    Intent webIntent = new Intent(getContext(), ControlSystem.class);
                    getContext().startActivity(webIntent);
                }
                //sem 5
                if(textView.equals("Microprocessor and Interfacing Techniques")) {
                    Intent webIntent = new Intent(getContext(), Mit.class);
                    getContext().startActivity(webIntent);
                }
                if(textView.equals("Design and Analysis of Algorithms")) {
                    Intent webIntent = new Intent(getContext(), DAAA.class);
                    getContext().startActivity(webIntent);
                }
                if(textView.equals("Artificial Intelligence and Machine Learning")) {
                    Intent webIntent = new Intent(getContext(), artificialintell.class);
                    getContext().startActivity(webIntent);
                }
                if(textView.equals("Computer Networks")) {
                    Intent webIntent = new Intent(getContext(), compnetwork.class);
                    getContext().startActivity(webIntent);
                }
                if(textView.equals("Software Tools 3")) {
                    Intent webIntent = new Intent(getContext(), sw3.class);
                    getContext().startActivity(webIntent);
                }
                if(textView.equals("Operating Systems")) {
                    Intent webIntent = new Intent(getContext(), operatingsys.class);
                    getContext().startActivity(webIntent);
                }
                if(textView.equals("System Software")) {
                    Intent webIntent = new Intent(getContext(), syssoft.class);
                    getContext().startActivity(webIntent);
                }
                if(textView.equals("Computer Graphics")) {
                    Intent webIntent = new Intent(getContext(), compgra.class);
                    getContext().startActivity(webIntent);
                }
                if(textView.equals("Internet Technology and Applications")) {
                    Intent webIntent = new Intent(getContext(), ita.class);
                    getContext().startActivity(webIntent);
                }
                if(textView.equals("Software Tools 4")) {
                    Intent webIntent = new Intent(getContext(), sw4.class);
                    getContext().startActivity(webIntent);
                }

            }
        });

        View textContainer = (View) listItemView.findViewById(R.id.subject_name);
        int color = ContextCompat.getColor(getContext(),colorResourceId);
        textContainer.setBackgroundColor(color);


        return listItemView;

    }

}
