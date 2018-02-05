package com.example.exam.pdfviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import javax.security.auth.callback.Callback;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        WebView webView;
        webView = (WebView) findViewById(R.id.web_view);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setPluginState(WebSettings.PluginState.ON);
        webView.setWebViewClient(new Callback());
        Bundle bundle = getIntent().getExtras();

        String bookName = bundle.getString("bookName");
        String pdfURL = getUrl(bookName);

        webView.loadUrl("http://docs.google.com/gview?embedded=true&url=" + pdfURL);
    }

    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(
                WebView view, String url) {
            return(false);
        }
    }

    private static String getUrl(String bookName) {

        String pdfURL;

        //Data Structures
        if(bookName.equals("Introduction to Algorithms by T. H. Cormen, C. E. Leiserson, R. L. Rivest")) {
            pdfURL = "http://ressources.unisciel.fr/algoprog/s00aaroot/aa00module1/res/%5BCormen-AL2011%5DIntroduction_To_Algorithms-A3.pdf";
        }
        else if(bookName.equals("Algorithms by S. Dasgupta, C. H. Papadimitriou, and U. V. Vazirani")){
            pdfURL="http://algorithmics.lsi.upc.edu/docs/Dasgupta-Papadimitriou-Vazirani.pdf";
        }
        else if(bookName.equals("Computer Algorithms by Horowitz and Sahani")){
            pdfURL="https://comsciers.files.wordpress.com/2015/12/horowitz-and-sahani-fundamentals-of-computer-algorithms-2nd-edition.pdf";
        }
        //Computer Organization
        else if(bookName.equals("Computer organization and Design by John L. Hannessy, David A. Patterson")){
            pdfURL="https://nsec.sjtu.edu.cn/data/MK.Computer.Organization.and.Design.4th.Edition.Oct.2011.pdf";
        }
        else if(bookName.equals("Structured Computer Organization by Tanenbaum")){
            pdfURL="https://eleccompengineering.files.wordpress.com/2014/07/structured_computer_organization_5th_edition_801_pages_2007_.pdf";
        }
        else if(bookName.equals("Computer Organization & Architecture : Designing For Performance by Stallings")){
            pdfURL="https://inspirit.net.in/books/academic/Computer%20Organisation%20and%20Architecture%208e%20by%20William%20Stallings.pdf";
        }
        else if(bookName.equals("Computer Organization by Hamacher")){
            pdfURL = "http://www.staroceans.org/kernel-and-driver/Computeranization%20And%20Embedded%20Systems,%20Hamacher,%20Vranesic,%20Zaky,%20Manjikian,%206Ed,%20Mgh,%202012.pdf";
        }
        else{
            pdfURL="https://theswissbay.ch/pdf/Gentoomen%20Library/Data%20Structures/Data%20Structures%20and%20Program%20Design%20in%20C%2B%2B%20-%20Robert%20L.%20Kruse.pdf";
        }

        return pdfURL;
    }
}

