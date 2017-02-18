package com.izone.fragement;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.izone.app.R;
import com.izone.courses.AndroidCourse;
import com.izone.courses.Course;
import com.izone.util.ExpandableListAdapter;


/**
 * A placeholder fragment containing a simple view.
 */
public abstract class CourseFragment extends Fragment {
    protected ExpandableListAdapter listAdapter;
    protected ExpandableListView expListView;
    public CourseFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflate(inflater,container);
        Course course = getCourse();
        listAdapter = course.getExpandableListAdapter(getActivity());
        expListView = getExpandableListView(rootView);
        // setting list adapter
        expListView.setAdapter(listAdapter);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle(getTitle());
    }

    public abstract View inflate(LayoutInflater inflater, ViewGroup container);
    public abstract Course getCourse();
    public abstract ExpandableListView getExpandableListView(View rootView);
    public abstract String getTitle();
}
