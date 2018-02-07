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
        //Digital Circuits
        else if(bookName.equals("Digital Logic and Computer Design by Morris Mano")){
            pdfURL="https://viden.io/knowledge/114/attachments/427?name=viden-K105-Digital+Logic+And+Computer+Design+By+M.+Morris+Mano+%282nd+Edition%29.pdf";
        }
        //Electrical Network
        else if(bookName.equals("Network Analysis")){
            pdfURL="http://www.csun.edu/~ih20409/SCHOOL1/BALABANIAN16.pdf";
        }
        //Discrete Mathematics
        else if(bookName.equals("Discrete Maths by Rosen K.H.")){
            pdfURL="http://www2.fiit.stuba.sk/~kvasnicka/Mathematics%20for%20Informatics/Rosen_Discrete_Mathematics_and_Its_Applications_7th_Edition.pdf";
        }
        //TCS
        else if(bookName.equals("Theoretical Computer science")){
            pdfURL="http://infocat.ucpel.tche.br/disc/lfa/docs/IAT.pdf";
        }
        //DBMS
        else if(bookName.equals("DataBase Management by Korth,Silbersachtz")){
            pdfURL="https://inspirit.net.in/books/database/Database%20System%20Concepts.pdf";
        }
        //Control Systems
        else if(bookName.equals("Automatic Control System")){
            pdfURL="http://mirror.thelifeofkenneth.com/lib/electronics_archive/Kuo-AutomaticControlSystems.pdf";
        }
        //Comm Systems
        else if(bookName.equals("Communication System")){
            pdfURL="http://bayanbox.ir/view/914409083519889086/Book-Modern-Digital-And-Analog-Communication-Systems-4th-edition-by-Lathi.pdf";
        }
        //Engineering Maths 3
        else if(bookName.equals("Engineering Mathematics by E.Kreysizg")){
            pdfURL="https://www-elec.inaoep.mx/~jmram/Kreyzig-ECS-DIF1.pdf";
        }
        //Engineering Physics
        else if(bookName.equals("Physics by R. Resnick and D. Halliday")){
            pdfURL="https://claudiacscif.files.wordpress.com/2015/05/fundamentals-of-physics-textbook.pdf";
        }
        //Engineering Chemistry
        else if(bookName.equals("Engineering Chemistry by Vogel A.I., and Mendham J")){
            pdfURL="http://www.ufpa.br/quimicanalitica/Vogel's%20-%20Textbook%20of%20quantitative%20chemical%20analysis%20(5th%20Edition;%20Longmann).pdf";
        }
        //mit
        else if(bookName.equals("Brey, The Intel Microprocessors")){
            pdfURL="https://userpages.umbc.edu/~squire/intel_book.pdf";
        }
        //daaa
        else if(bookName.equals("Introduction to Algorithms Cormen, Leiserson")){
            pdfURL="http://ressources.unisciel.fr/algoprog/s00aaroot/aa00module1/res/%5BCormen-AL2011%5DIntroduction_To_Algorithms-A3.pdf";
        }
        else if(bookName.equals("Knuth, Donald E. : The Art of Computer Programming Vol I")){
            pdfURL="http://broiler.astrometry.net/~kilian/The_Art_of_Computer_Programming%20-%20Vol%201.pdf";
        }
        else if(bookName.equals("Knuth, Donald E. :The Art of Computer Programming Vol 3")){
            pdfURL="https://vivekupadhyay125.files.wordpress.com/2013/08/donald-e-knuth-the-art-of-computer-programming-vol-3.pdf";
        }
        else if(bookName.equals("J. Kleinberg, E. Tardos: Algorithm Design")){
            pdfURL="http://www.icsd.aegean.gr/kaporisa/index_files/Algorithm_Design.pdf";
        }
        //artificial
        else if(bookName.equals("Elaine Rich, K. Knight Artificial Intelligence")){
            pdfURL="http://www.vumultan.com/Books/CS607-Artificial%20Intelligence%20by%20Rich%20and%20Knight.pdf";
        }
        else if(bookName.equals("S. Russell and P. Norvig,  Artificial Intelligence: A Modern Approach")){
            pdfURL="https://www.ics.uci.edu/~rickl/courses/cs-171/aima-resources/Artificial%20Intelligence%20A%20Modern%20Approach%20(3rd%20Edition).pdf";
        }
        else if(bookName.equals("I. Bratko, Prolog Programming for Artificial Intelligence")){
            pdfURL="https://cdn.preterhuman.net/texts/science_and_technology/artificial_intelligence/PROLOG%20PROGRAMMING%20FOR%20ARTIFICIAL%20INTELLIGENCE%20-%20lvan%20Bratko.pdf";
        }
        else if(bookName.equals("C. M. Bishop,  Pattern Recognition and Machine Learning")){
            pdfURL="http://users.isr.ist.utl.pt/~wurmd/Livros/school/Bishop%20-%20Pattern%20Recognition%20And%20Machine%20Learning%20-%20Springer%20%202006.pdf";
        }
        //compnetwork
        else if(bookName.equals("Tanenbaum, Computer Network")){
            pdfURL="https://theswissbay.ch/pdf/Gentoomen%20Library/Networking/Prentice%20Hall%20-%20Computer%20Networks%20Tanenbaum%204ed.pdf";
        }
        else if(bookName.equals("William Stalling: Data and Computer Communication")){
            pdfURL="https://pdfs.semanticscholar.org/5dc8/00b597039e0378230881c8af65849222589c.pdf";
        }
        else if(bookName.equals("Douglas E. Comer: Internetworking with TCP/IP Volume - I")){
            pdfURL="http://cpe.rmutt.ac.th/network/images/cn/[3]Comer_Douglas_Internetworking_with_TCP_IP_Vol.1.pdf";
        }
        else if(bookName.equals("B. Forouzan : Data Communication And Networking")){
            pdfURL="http://library.aceondo.net/ebooks/Computer_Science/Data_Communication_and_Networking_by_Behrouz.A.Forouzan_4th.edition.pdf";
        }
        //sw3
        else if(bookName.equals("Developing Java Servlets by James Goodwill")){
            pdfURL="http://box.cs.istu.ru/public/docs/other/_Unsorted/new/Java/Pure%20JSP%20(2000,%20Sams).pdf";
        }
        //os
        else if(bookName.equals("Silberschatz, Galvin and Gagne: Operating System Concepts")){
            pdfURL="http://www.uobabylon.edu.iq/download/M.S%202013-2014/Operating_System_Concepts,_8th_Edition%5BA4%5D.pdf";
        }
        else if(bookName.equals("W. Stallings: Operating Systems: Internals and Design Principles")){
            pdfURL="http://dinus.ac.id/repository/docs/ajar/Operating_System.pdf";
        }
        else if(bookName.equals("A Tanenbaum,A Woodhull: Operating Systems - Design and Implementation")){
            pdfURL="https://mcdtu.files.wordpress.com/2017/03/tanenbaum_woodhull_operating-systems-design-implementation-3rd-edition.pdf";
        }
        else if(bookName.equals("Kernighan & Pike: UNIX programming Environment")){
            pdfURL="http://scis.uohyd.ac.in/~apcs/itw/UNIXProgrammingEnvironment.pdf";
        }
        //sys soft
        else if(bookName.equals("A.V.Aho, R.Sethi & J D.Ullman Compilers-Principles, Techniques and Tools")){
            pdfURL="http://www.informatik.uni-bremen.de/agbkb/lehre/ccfl/Material/ALSUdragonbook.pdf";
        }
        else if(bookName.equals("Louden , Kenneth C : Compiler Construction-Principles and Practice")){
            pdfURL="https://csunplugged.files.wordpress.com/2012/12/compiler-construction-principles-and-practice-k-c-louden-pws-1997-cmp-2002-592s.pdf";
        }
        else if(bookName.equals("D. M. Dhamdhere : System Programming and Operating System")){
            pdfURL="http://civilcafe.weebly.com/uploads/2/8/9/8/28985467/6iplmsdd4swc.pdf";
        }
        //comp graphics
        else if(bookName.equals("Donald Hearn & M. Pauline Baker, Computer Graphics")){
            pdfURL="http://edu.uokufa.edu.iq/staff/dr.nidhal/compressed%20comp.book/Hearn,Baker%20-%20Computer%20Graphics%20-%20C%20Version%202nd%20Ed.pdf";
        }

        else if(bookName.equals("James D. Foley, Computer Graphics: Principles and Practice")){
            pdfURL="http://ptgmedia.pearsoncmg.com/images/9780321399526/samplepages/0321399528.pdf";
        }
        //ita
        else if(bookName.equals("Web Technologies: A Computer Science Perspective, Jeffrey C. Jackson")){
            pdfURL="https://passhojao.com/attachments/7c8727519c30b8baa05ee92432e1d9ecdb8075d7/store/9f2d8d06296185d04b4eb79f6536879639111d3feef8464d55747a803923/Web+Technologies+-+A+Computer+Science+Perspective+-+J.+Jackson+%28Pearson%2C+2007%29.pdf";
        }
        else if(bookName.equals("Web Engineering: A Practitioner’s Approach, Roger Pressman")){
            pdfURL="https://yslaiseblog.files.wordpress.com/2014/03/pressman-lowe-2009-web-engineering-a-practitioner_s-approach.pdf";
        }
        //sw4
        else if(bookName.equals("Rito Meier, Professional Android 2 Application Development")){
            pdfURL="http://www.esys.ir/Files/Ref_Books/Android/esys.ir_Professional%20Android%202%20Application%20Development.pdf";
        }
        else{
            pdfURL="https://theswissbay.ch/pdf/Gentoomen%20Library/Data%20Structures/Data%20Structures%20and%20Program%20Design%20in%20C%2B%2B%20-%20Robert%20L.%20Kruse.pdf";
        }


        return pdfURL;
    }
}

