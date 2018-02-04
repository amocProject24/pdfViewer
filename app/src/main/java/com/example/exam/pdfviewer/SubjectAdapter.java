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
                if(textView.equals("Data Structures and Algorithms")) {
                    Intent webIntent = new Intent(getContext(), DataStructure.class);
                    getContext().startActivity(webIntent);
                }
                if(textView.equals("Computer Organization")) {
                    Intent webIntent = new Intent(getContext(), ComputerOrganization.class);
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
