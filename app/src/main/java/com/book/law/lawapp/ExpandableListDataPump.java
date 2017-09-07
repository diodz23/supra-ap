package com.book.law.lawapp;


import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static LinkedHashMap<String, List<String>> getData() {
        LinkedHashMap<String, List<String>> expandableListDetail = new LinkedHashMap<String, List<String>>();

        List<String> cricket = new ArrayList<String>();
        cricket.add("People of the philippines vs. Joseph Young");
        cricket.add("Defendant  - Joseph Young");
        cricket.add("Compliant - People of the philippines");
        cricket.add("Reinstated");

        List<String> football = new ArrayList<String>();
            football.add("G.R No. 124866");
        football.add("261SCRA 128");

        List<String> date = new ArrayList<String>();
        date.add("January 1, 2017 - December 25, 2017");


        List<String> Topic = new ArrayList<String>();
        Topic.add("Rape");

        List<String> Syllables = new ArrayList<String>();
        Syllables.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed varius scelerisque ligula a mollis.");

        List<String> Body = new ArrayList<String>();
        Body.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed varius scelerisque ligula a mollis. Aliquam pellentesque viverra ultricies. Vivamus pulvinar est eget velit tempor porta. Aenean placerat accumsan volutpat. Praesent laoreet euismod dui vitae tincidunt. Suspendisse tincidunt hendrerit orci, at luctus lacus ornare vitae. Sed quis volutpat elit, quis pellentesque velit. Pellentesque tempus cursus ex at euismod. Suspendisse potenti. Praesent scelerisque mattis facilisis. Duis iaculis a neque eu semper. Etiam nec tempus erat. Aenean cursus posuere ex, in molestie ex commodo ut. Quisque tempus est leo, non elementum leo tristique at. Morbi ac dolor libero.");


        List<String> Full = new ArrayList<String>();
        Full.add("http://www.lipsum.com/feed/html");

        expandableListDetail.put("Title", cricket);
        expandableListDetail.put("Reference No.", football);
        expandableListDetail.put("Date", date);
        expandableListDetail.put("Topic", Topic);
        expandableListDetail.put("Syllables", Syllables);
        expandableListDetail.put("Body", Body);
        expandableListDetail.put("Full text", Full);

        return expandableListDetail;
    }
    public static LinkedHashMap<String, List<String>> getDataCase2() {
        LinkedHashMap<String, List<String>> expandableListDetail = new LinkedHashMap<String, List<String>>();

        List<String> cricket = new ArrayList<String>();
        cricket.add("Rei Mark vs. Diodel Gerona");
        cricket.add("Defendant  - Rei Mark");
        cricket.add("Compliant - Diodel Gerona");
        cricket.add("Not Controlling");
        List<String> football = new ArrayList<String>();
        football.add("G.R No. 11111");
        football.add("251SCRA 12345");

        List<String> date = new ArrayList<String>();
        date.add("February 20, 2016 - January 3, 2017");


        List<String> Topic = new ArrayList<String>();
        Topic.add("Murder");

        List<String> Syllables = new ArrayList<String>();
        Syllables.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed varius scelerisque ligula a mollis.");

        List<String> Body = new ArrayList<String>();
        Body.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed varius scelerisque ligula a mollis. Aliquam pellentesque viverra ultricies. Vivamus pulvinar est eget velit tempor porta. Aenean placerat accumsan volutpat. Praesent laoreet euismod dui vitae tincidunt. Suspendisse tincidunt hendrerit orci, at luctus lacus ornare vitae. Sed quis volutpat elit, quis pellentesque velit. Pellentesque tempus cursus ex at euismod. Suspendisse potenti. Praesent scelerisque mattis facilisis. Duis iaculis a neque eu semper. Etiam nec tempus erat. Aenean cursus posuere ex, in molestie ex commodo ut. Quisque tempus est leo, non elementum leo tristique at. Morbi ac dolor libero.");


        List<String> Full = new ArrayList<String>();
        Full.add("http://www.lipsum.com/feed/html");

        expandableListDetail.put("Title", cricket);
        expandableListDetail.put("Reference No.", football);
        expandableListDetail.put("Date", date);
        expandableListDetail.put("Topic", Topic);
        expandableListDetail.put("Syllables", Syllables);
        expandableListDetail.put("Body", Body);
        expandableListDetail.put("Full text", Full);

        return expandableListDetail;
    }
    public static LinkedHashMap<String, List<String>> getDataCase3() {
        LinkedHashMap<String, List<String>> expandableListDetail = new LinkedHashMap<String, List<String>>();

        List<String> cricket = new ArrayList<String>();
        cricket.add("Jude Kevin vs. Thomas");
        cricket.add("Defendant  - Joseph Young");
        cricket.add("Compliant - People of the philippines");
        cricket.add("Controlling");

        List<String> football = new ArrayList<String>();
        football.add("G.R No. 222222");
        football.add("211SCRA 12223");

        List<String> date = new ArrayList<String>();
        date.add("August 3, 2017 - August 26, 2017");


        List<String> Topic = new ArrayList<String>();
        Topic.add("Rape");

        List<String> Syllables = new ArrayList<String>();
        Syllables.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed varius scelerisque ligula a mollis.");

        List<String> Body = new ArrayList<String>();
        Body.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed varius scelerisque ligula a mollis. Aliquam pellentesque viverra ultricies. Vivamus pulvinar est eget velit tempor porta. Aenean placerat accumsan volutpat. Praesent laoreet euismod dui vitae tincidunt. Suspendisse tincidunt hendrerit orci, at luctus lacus ornare vitae. Sed quis volutpat elit, quis pellentesque velit. Pellentesque tempus cursus ex at euismod. Suspendisse potenti. Praesent scelerisque mattis facilisis. Duis iaculis a neque eu semper. Etiam nec tempus erat. Aenean cursus posuere ex, in molestie ex commodo ut. Quisque tempus est leo, non elementum leo tristique at. Morbi ac dolor libero.");


        List<String> Full = new ArrayList<String>();
        Full.add("http://www.lipsum.com/feed/html");

        expandableListDetail.put("Title", cricket);
        expandableListDetail.put("Reference No.", football);
        expandableListDetail.put("Date", date);
        expandableListDetail.put("Topic", Topic);
        expandableListDetail.put("Syllables", Syllables);
        expandableListDetail.put("Body", Body);
        expandableListDetail.put("Full text", Full);

        return expandableListDetail;
    }
}
