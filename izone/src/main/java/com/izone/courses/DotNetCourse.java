package com.izone.courses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by aayushraj
 */

public class DotNetCourse extends Course{


    public List<String> getListDataHeader(){
        List<String> listDataHeader = new ArrayList<String>();
        listDataHeader.add("Introduction");
        listDataHeader.add("C# the language");
        listDataHeader.add("OOPS Concepts");
        listDataHeader.add("ADO .Net");
        listDataHeader.add("ASP .NET");
        listDataHeader.add("Packaging Deployment of websites");
        listDataHeader.add("Globalization and localization");
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
        List<List<String>> childData = new ArrayList<>();

        // Adding child data
        List<String> dotNetIntroduction = new ArrayList<String>();
        dotNetIntroduction.add("Common Language Runtime (CLR)");

        List<String> dotNetCSharp = new ArrayList<String>();
        dotNetCSharp.add("Syntax and datatypes in C#");
        dotNetCSharp.add("Conditional operators and looping");
        dotNetCSharp.add("Array");
        dotNetCSharp.add("Structure");


        List<String> dotNetOOPsConcept = new ArrayList<String>();

        dotNetOOPsConcept.add("Classes");
        dotNetOOPsConcept.add("Properties and methods");
        dotNetOOPsConcept.add("Class access modifiers");
        dotNetOOPsConcept.add("Defining Constructor");
        dotNetOOPsConcept.add("Method overloading, overriding and hiding");
        dotNetOOPsConcept.add("Overloading of constructor");
        dotNetOOPsConcept.add("Inheritance");
        dotNetOOPsConcept.add("Interface polymorphism");
        dotNetOOPsConcept.add("Working with namespaces");
        dotNetOOPsConcept.add("Partial classes");
        dotNetOOPsConcept.add("Collections");
        dotNetOOPsConcept.add("Array list");
        dotNetOOPsConcept.add("Stack");
        dotNetOOPsConcept.add("Queue");
        dotNetOOPsConcept.add("Hash table");
        dotNetOOPsConcept.add("Generics Collection");
        dotNetOOPsConcept.add("List");
        dotNetOOPsConcept.add("Dictionary");
        dotNetOOPsConcept.add("Exception handling");
        dotNetOOPsConcept.add("Definition of errors, bugs and exceptions");
        dotNetOOPsConcept.add("Try and catch");
        dotNetOOPsConcept.add("Finally block");
        dotNetOOPsConcept.add("Throwing exceptions");
        dotNetOOPsConcept.add("Handling multiple exceptions");
        dotNetOOPsConcept.add("Basics of windows application development");
        dotNetOOPsConcept.add("Forms and controls");
        dotNetOOPsConcept.add("Introduction");

        List<String> adoDotNet = new ArrayList<String>();
        adoDotNet.add("Working with dataset");
        adoDotNet.add("Working with command and connections");
        adoDotNet.add("Working with data reader");
        adoDotNet.add("Working with data view");

        List<String> aspDotNet = new ArrayList<String>();
        aspDotNet.add("Introduction of ASP.NET");
        aspDotNet.add("Web page life cycle");
        aspDotNet.add("Introduction of IIS");
        aspDotNet.add("Request object");
        aspDotNet.add("Response object");
        aspDotNet.add("Server object");
        aspDotNet.add("State management");
        aspDotNet.add("Http Cookies");
        aspDotNet.add("Session object");
        aspDotNet.add("Application object");
        aspDotNet.add("Query string");
        aspDotNet.add("View state");
        aspDotNet.add("Standard html controls");
        aspDotNet.add("Validation controls");
        aspDotNet.add("Data bind controls");
        aspDotNet.add("Repeater control");
        aspDotNet.add("Data list control");
        aspDotNet.add("Grid View control");
        aspDotNet.add("Form View control");
        aspDotNet.add("Data View control");
        aspDotNet.add("Navigation controls");
        aspDotNet.add("Caching");
        aspDotNet.add("Master pages");
        aspDotNet.add("Asp.net security");
        childData.add(dotNetIntroduction);
        childData.add(dotNetCSharp);
        childData.add(dotNetOOPsConcept);
        childData.add(adoDotNet);
        childData.add(aspDotNet);
        List<String> dummyList = new ArrayList<>();
        childData.add(dummyList);
        childData.add(dummyList);
        return childData;
    }
}
