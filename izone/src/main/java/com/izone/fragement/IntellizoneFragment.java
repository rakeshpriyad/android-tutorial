package com.izone.fragement;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;

import com.izone.util.ExpandableListAdapter;
import com.izone.app.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class IntellizoneFragment extends Fragment {
    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;
    private ArrayList<String> listWhy;

    public IntellizoneFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_intellizone, container, false);
        prepareListData();

        listAdapter = new ExpandableListAdapter(getActivity(), listDataHeader, listDataChild);
        expListView = (ExpandableListView) rootView.findViewById(R.id.lvIzoneExp);

        // setting list adapter
        expListView.setAdapter(listAdapter);
        prepareList();
        ListView listView = (ListView) rootView.findViewById(R.id.listView);
        listView.setAdapter(new ArrayAdapter<String>(getActivity(), R.layout.bullet_list_item, listWhy));

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Intellizone Learning");
    }

    /*
    * Preparing the list data
    */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();


        listDataHeader.add("Java,"+" .Net,"+" Web Designing,"+" Android,"+" PHP,"+" C/C++,"+" Computer Courses for X-XII");
        List<String> dummy=new ArrayList<String>();
        listDataChild.put(listDataHeader.get(0), dummy); // Header, Child data
    }

    private void prepareList() {
        listWhy = new ArrayList<String>();
        listWhy.add(" Highest quality trainings");
        listWhy.add(" Highly skilled, industry experienced trainers");
        listWhy.add("Timeliness in completion of training");
        listWhy.add("Facility of weekend classes");
        listWhy.add(" Suitable training location for students and professionals");
    }
}
