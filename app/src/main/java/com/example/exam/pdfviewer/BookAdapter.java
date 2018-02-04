package com.example.exam.pdfviewer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Admin1 on 2/4/2018.
 */

public class BookAdapter extends ArrayAdapter<String>{
    int colorResourceId;

    public BookAdapter(Activity context, int resource, ArrayList<String> subjectList){
        super(context,0,subjectList);
        colorResourceId=resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_book_list,parent,false);
        }

        final String textView = getItem(position);
        TextView defaultWordView = (TextView) listItemView.findViewById(R.id.book_name);
        defaultWordView.setText(textView);

        defaultWordView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent webIntent = new Intent(getContext(),WebViewActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("bookName",textView);

                webIntent.putExtras(bundle);
                getContext().startActivity(webIntent);
            }
        });

        View textContainer = (View) listItemView.findViewById(R.id.book_name);
        int color = ContextCompat.getColor(getContext(),colorResourceId);
        textContainer.setBackgroundColor(color);


        return listItemView;

    }

}
