package com.izone.courses;

import android.support.v4.app.FragmentActivity;

import com.izone.util.ExpandableListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by aayushraj
 */

public class PHPCourse extends Course{


    public List<String> getListDataHeader(){
        List<String> listDataHeader = new ArrayList<String>();
        listDataHeader = new ArrayList<String>();
        listDataHeader.add("Introduction of PHP, Data Types, Operators");
        listDataHeader.add("Installing Local Server (XAMPP/WAMPP)");
        listDataHeader.add("Echo function, conditional tag (If Else)");
        listDataHeader.add("Loop (While loop, For Loop)");
        listDataHeader.add("Array (Numeric, Associative , Multi-Dimensional)");
        listDataHeader.add("For each loop in array");
        listDataHeader.add("Functions");
        listDataHeader.add("Switch Case");
        listDataHeader.add("OOPS");
        listDataHeader.add("Database , Mysql Data Types, Creating Tables");

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
}
