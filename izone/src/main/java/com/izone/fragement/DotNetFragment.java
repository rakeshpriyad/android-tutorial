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
import com.izone.courses.DotNetCourse;
import com.izone.courses.JavaCourse;
import com.izone.util.ExpandableListAdapter;
import com.izone.app.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class DotNetFragment extends CourseFragment {
    public DotNetFragment() {
    }

    @Override
    public View inflate(LayoutInflater inflater, ViewGroup container) {
        return inflater.inflate(R.layout.fragment_dot_net, container, false);
    }

    @Override
    public Course getCourse() {
        return new DotNetCourse();
    }

    @Override
    public ExpandableListView getExpandableListView(View rootView) {
        return (ExpandableListView) rootView.findViewById(R.id.lvDotNetExp);
    }

    @Override
    public String getTitle() {
        return ".Net";
    }
    /*@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_dot_net, container, false);
       // prepareListData();

        Course course = new DotNetCourse();
        listAdapter = course.getExpandableListAdapter(getActivity());
        //listAdapter = new ExpandableListAdapter(getActivity(), listDataHeader, listDataChild);
        expListView = (ExpandableListView) rootView.findViewById(R.id.lvDotNetExp);
        // setting list adapter
        expListView.setAdapter(listAdapter);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle(".Net");
        // getListView().setOnItemClickListener(this);
    }
*/
}
