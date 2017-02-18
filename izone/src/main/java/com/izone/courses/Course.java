package com.izone.courses;

import android.support.v4.app.FragmentActivity;

import com.izone.util.ExpandableListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by aayushraj on 11-02-2017.
 */

public abstract class Course {
    public abstract List<String> getListDataHeader();
    public abstract HashMap<String, List<String>> getListDataChild();
    public ExpandableListAdapter getExpandableListAdapter(FragmentActivity activity){
        return new ExpandableListAdapter(activity, getListDataHeader(), getListDataChild());
    }

    public List<List<String>> getChildData(){
        List<List<String>> chlidData = new ArrayList<List<String>>();
        List<String> dummyList = new ArrayList<String>();
        chlidData.add(dummyList);
        return  chlidData;
    }

}
