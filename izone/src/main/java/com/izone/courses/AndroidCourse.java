package com.izone.courses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by aayushraj on 11-02-2017.
 */

public class AndroidCourse extends Course{

    public List<String> getListDataHeader(){
        List<String> listDataHeader = new ArrayList<String>();
        listDataHeader.add("Overview");
        listDataHeader.add("Environment Setup");
        listDataHeader.add("Architecture");
        listDataHeader.add("Application Components");
        listDataHeader.add("Resources");
        listDataHeader.add("Activities");
        listDataHeader.add("Fragments");
        listDataHeader.add("Intents/Filters");
        listDataHeader.add("UI Layouts");
        listDataHeader.add("UI Controls");
        listDataHeader.add("Event Handling");
        listDataHeader.add("Styles and Themes");
        listDataHeader.add("Custom Components");
        listDataHeader.add("SQLLite");
        listDataHeader.add("Services");
        listDataHeader.add("Broadcast Receivers");
        listDataHeader.add("Content Providers");
        listDataHeader.add("Drag and Drop");
        listDataHeader.add("Notifications");
        listDataHeader.add("Location Based Services");
        listDataHeader.add("Sending Email");
        listDataHeader.add("Sending SMS");
        listDataHeader.add("Phone Calls");
        listDataHeader.add("Publishing Android Application");
        return listDataHeader;
    }
    /*
        * Preparing the list data
        */
    public HashMap<String, List<String>>  getListDataChild() {
        HashMap<String, List<String>> listDataChild = new HashMap<String, List<String>>();
        List<String> listDataHeader = getListDataHeader();
        List<List<String>> childData = getChildData();
        int i =0;
        for (String hdeader:listDataHeader) {
            if(childData == null || childData.size()==1) {
                listDataChild.put(hdeader, childData.get(0));
            }else{
                listDataChild.put(hdeader, childData.get(i++));
            }
        }
        return listDataChild;
    }

    public List<List<String>> getChildData(){
        List<List<String>> chlidData = new ArrayList<List<String>>();
        List<String> dummyList = new ArrayList<String>();
        chlidData.add(dummyList);
        return  chlidData;
    }
}
