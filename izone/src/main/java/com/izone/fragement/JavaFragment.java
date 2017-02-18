package com.izone.fragement;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.izone.courses.AndroidCourse;
import com.izone.courses.Course;
import com.izone.courses.JavaCourse;
import com.izone.util.ExpandableListAdapter;
import com.izone.app.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class JavaFragment extends CourseFragment {

    public JavaFragment() {
    }

    @Override
    public View inflate(LayoutInflater inflater, ViewGroup container) {
        return inflater.inflate(R.layout.fragment_java, container, false);
    }

    @Override
    public Course getCourse() {
        return new JavaCourse();
    }

    @Override
    public ExpandableListView getExpandableListView(View rootView) {
        return (ExpandableListView) rootView.findViewById(R.id.lvJavaExp);
    }

    @Override
    public String getTitle() {
        return "Java";
    }

    /*@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_java, container, false);


        //prepareListData();
        Course course = new JavaCourse();
        listAdapter = course.getExpandableListAdapter(getActivity());
        //listAdapter = new ExpandableListAdapter(getActivity(), listDataHeader, listDataChild);
        expListView = (ExpandableListView) rootView.findViewById(R.id.lvJavaExp);
        // setting list adapter
        expListView.setAdapter(listAdapter);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Java");
    }*/


}
