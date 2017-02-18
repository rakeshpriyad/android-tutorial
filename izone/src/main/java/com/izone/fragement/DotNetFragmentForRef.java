package com.izone.fragement;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.izone.app.R;
import com.izone.courses.Course;
import com.izone.courses.DotNetCourse;
import com.izone.util.ExpandableListAdapter;

/**
 * A placeholder fragment containing a simple view.
 */
public class DotNetFragmentForRef extends Fragment {
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    public DotNetFragmentForRef() {
    }

    @Override
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

   /* *//*
    * Preparing the list data
    *//*
    private void prepareListData() {




        listDataChild.put(listDataHeader.get(0), dotNetIntroduction); // Header, Child data
        listDataChild.put(listDataHeader.get(1), dotNetCSharp);
        listDataChild.put(listDataHeader.get(2), dotNetOOPsConcept);
        listDataChild.put(listDataHeader.get(3), adoDotNet);
        listDataChild.put(listDataHeader.get(4), adoDotNet);
        listDataChild.put(listDataHeader.get(5), aspDotNet);
    }*/
}
