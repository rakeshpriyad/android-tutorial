package com.izone.fragement;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.izone.courses.DotNetCourse;
import com.izone.util.ExpandableListAdapter;
import com.izone.app.R;
import com.izone.courses.Course;


/**
 * A placeholder fragment containing a simple view.
 */
public class AndroidFragment extends CourseFragment {
    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;
    public AndroidFragment() {
    }

    @Override
    public View inflate(LayoutInflater inflater, ViewGroup container) {
        return inflater.inflate(R.layout.fragment_android, container, false);
    }

    @Override
    public Course getCourse() {
        return new DotNetCourse();
    }

    @Override
    public ExpandableListView getExpandableListView(View rootView) {
        return (ExpandableListView) rootView.findViewById(R.id.lvAndroidExp);
    }

    @Override
    public String getTitle() {
        return "Android";
    }
   /* @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_android, container, false);
       // prepareListData();
        Course course = new AndroidCourse();
        listAdapter = course.getExpandableListAdapter(getActivity());//new ExpandableListAdapter(getActivity(), course.getListDataHeader(), course.getListDataChild());
        expListView = (ExpandableListView) rootView.findViewById(R.id.lvAndroidExp);
        // setting list adapter
        expListView.setAdapter(listAdapter);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Android");
    }*/
}
