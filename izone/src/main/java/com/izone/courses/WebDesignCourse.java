package com.izone.courses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by aayushraj
 */

public class WebDesignCourse extends Course{


    public List<String> getListDataHeader(){
        List<String> listDataHeader = new ArrayList<String>();
        listDataHeader.add("Introduction of world wide web");
        listDataHeader.add("How website works");
        listDataHeader.add("What is the need of web application");
        listDataHeader.add("What is http and https protocols");
        listDataHeader.add("Difference between static and dynamic web page");
        listDataHeader.add("Life cycle of a web page");
        listDataHeader.add("Introduction of web servers and how they work");
        listDataHeader.add("Basic html");
        listDataHeader.add("Other html elements");
        listDataHeader.add("HTML form and their basic elements");
        listDataHeader.add("Request methods GET and POST");
        listDataHeader.add("Java Script");
        listDataHeader.add("DHTML (Dynamic HTML)");
        listDataHeader.add("Virtual directories");
        listDataHeader.add("Creating sample html page");
        listDataHeader.add("Hosting a web page");
        listDataHeader.add("PhotoShop");
        listDataHeader.add("Advanced HTML");

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

    @Override
    public List<List<String>> getChildData() {

        List<String> photoshopList = new ArrayList<String>();
        photoshopList.add("Introduction of Photoshop");
        photoshopList.add("Layout and drawing");
        photoshopList.add("Various selections and editing style");
        photoshopList.add("Typography in Photoshop");
        photoshopList.add("Brushes");
        photoshopList.add("Layers");
        photoshopList.add("Positioning, ordering, scaling, rotation and adjustment");
        photoshopList.add("Masking, gradient effect");
        photoshopList.add("Image slicing");
        photoshopList.add("Giving special effect to image");
        photoshopList.add("Generating jpeg and other type of images");
        photoshopList.add("Generating web compressed image");


        List<String> advanceHtmlList = new ArrayList<String>();
        advanceHtmlList.add("HTML head element");
        advanceHtmlList.add("Text oriented elements (including font, para, new line, background etc.)");
        advanceHtmlList.add("Hyper link and URLs");
        advanceHtmlList.add("Image tag");
        advanceHtmlList.add("HTML Tables");
        advanceHtmlList.add("CSS");
        advanceHtmlList.add("Java Script");
        advanceHtmlList.add("Java Script alert and other basic functions");
        advanceHtmlList.add("Custom functions and validation in Java Script");
        advanceHtmlList.add("Posting a web form with simple java script validation");
        advanceHtmlList.add("DHTML");
        advanceHtmlList.add("HTML5 Basics");

        List<String> dummyList = new ArrayList<String>();
        List<List<String>> childData= new ArrayList<>();
        childData.add(dummyList); // Header, Child data
        childData.add(dummyList);
        childData.add(dummyList);
        childData.add(dummyList);
        childData.add(dummyList);
        childData.add(dummyList);
        childData.add(dummyList);
        childData.add(dummyList);
        childData.add(dummyList);
        childData.add(dummyList);
        childData.add(dummyList);
        childData.add(dummyList);
        childData.add(dummyList);
        childData.add(dummyList);
        childData.add(photoshopList);
        childData.add(advanceHtmlList);


        return super.getChildData();
    }
}
