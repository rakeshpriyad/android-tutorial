package com.izone.courses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by aayushraj
 */

public class JavaCourse extends Course{

    public List<String> getListDataHeader(){
        List<String> listDataHeader = new ArrayList<String>();
        listDataHeader = new ArrayList<String>();
        listDataHeader.add("Core & Advance Java");
        listDataHeader.add("Web Development with Java");
        listDataHeader.add("Spring Framework");
        listDataHeader.add("Hibernate");
        listDataHeader.add("Stand-alone Project with Java");
        listDataHeader.add("Web Project with Java");
        listDataHeader.add("Web Project with JSF Framework");
        listDataHeader.add("Web Project with Spring MVC Framework");
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
        List<String> coreJavaAndAdvanceJava = new ArrayList<String>();
        coreJavaAndAdvanceJava.add("Introduction to Computers, Programs");
        coreJavaAndAdvanceJava.add("Introduction to java virtual machine");
        coreJavaAndAdvanceJava.add("An overview of elementary programming");
        coreJavaAndAdvanceJava.add("OOPS implementation");
        coreJavaAndAdvanceJava.add("Packages and interfaces");
        coreJavaAndAdvanceJava.add("Exception handing");
        coreJavaAndAdvanceJava.add("String handing");
        coreJavaAndAdvanceJava.add("Creating Immutable Classs");
        coreJavaAndAdvanceJava.add("New in jdk");
        coreJavaAndAdvanceJava.add("Multi-threaded programming");
        coreJavaAndAdvanceJava.add("Collection framework and Generics");
        coreJavaAndAdvanceJava.add("Introduction to IO Streams");
        coreJavaAndAdvanceJava.add("Introduction to Reflection API");
        coreJavaAndAdvanceJava.add("Introduction to Swing and AWT.");

        List<String> springCourse = new ArrayList<String>();
        springCourse.add("Spring Core");
        springCourse.add("Spring AOP");
        springCourse.add("Spring JDBC");
        springCourse.add("Spring ORM");
        springCourse.add("Spring Email");
        springCourse.add("Spring MVC");
        springCourse.add("Spring integrates with other web frameworks");

        List<String> hibernateCourse = new ArrayList<String>();
        hibernateCourse.add("Introduction to Hibernate");
        hibernateCourse.add("Hibernate Association (Table Relationship)");
        hibernateCourse.add("Hibernate Cascade");
        hibernateCourse.add("Hibernate Query Language (HQL)");
        hibernateCourse.add("Hibernate Criteria");
        hibernateCourse.add("Inheritance in Hibernate");
        hibernateCourse.add("Hibernate Performance");
        hibernateCourse.add("Hibernate : fetching strategies");

        List<String> standAloneProjJava = new ArrayList<String>();
        standAloneProjJava.add("Introduction to java");
        standAloneProjJava.add("An overview of elementary programming");
        standAloneProjJava.add("OOPS implementation");
        standAloneProjJava.add("Packages and interfaces");
        standAloneProjJava.add("Exception handing");
        standAloneProjJava.add("String handing");
        standAloneProjJava.add("Collection framework");
        standAloneProjJava.add("Basics of Swing");

        List<String> webProjJava = new ArrayList<String>();
        webProjJava.add("Introduction to java");
        webProjJava.add("Introduction to java");
        webProjJava.add("An overview of elementary programming");
        webProjJava.add("OOPS implementation");
        webProjJava.add("Packages and interfaces");
        webProjJava.add("Exception handing");
        webProjJava.add("String handing");
        webProjJava.add("Collection framework");
        webProjJava.add("DATABASE PROGRAMMING USING JDBC (4.1)");
        webProjJava.add("SERVLET");
        webProjJava.add("JAVA SERVER PAGES (JSP) And JSTL");

        List<String> webProjJavaJSF = new ArrayList<String>();
        webProjJavaJSF.add("Introduction to java");
        webProjJavaJSF.add("Introduction to java");
        webProjJavaJSF.add("An overview of elementary programming");
        webProjJavaJSF.add("OOPS implementation");
        webProjJavaJSF.add("Packages and interfaces");
        webProjJavaJSF.add("Exception handing");
        webProjJavaJSF.add("String handing");
        webProjJavaJSF.add("Collection framework");
        webProjJavaJSF.add("DATABASE PROGRAMMING USING JDBC(4.1)");
        webProjJavaJSF.add("Introduction to SERVLET");
        webProjJavaJSF.add("Introduction to JAVA SERVER PAGES (JSP)");
        webProjJavaJSF.add("Framework JSF");

        childData.add(coreJavaAndAdvanceJava);
        childData.add(coreJavaAndAdvanceJava);
        childData.add(springCourse);
        childData.add(hibernateCourse);
        childData.add(standAloneProjJava);
        childData.add(webProjJava);
        childData.add(webProjJavaJSF);

        List<String> webProjSpring = new ArrayList<>();
        webProjSpring.addAll(coreJavaAndAdvanceJava);
        webProjSpring.addAll(springCourse);

        childData.add(webProjSpring);

        return childData;
    }
}
