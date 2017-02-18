package com.izone.app;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.izone.fragement.JavaFragment;

/**
 * A placeholder fragment containing a simple view.
 */
public class JavaFragmentDepricated extends ListFragment implements OnItemClickListener{

    public JavaFragmentDepricated() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_java, container, false);

        String[] values = new String[] { "Introduction to Computers, Programs",
                "Introduction to java virtual machine",
                "An overview of elementary programming",
                "OOPS implementation",
                "Packages and interfaces",
                "Exception handing",
                "String handing",
                "Creating Immutable Classs",
                "New in jdk",
                "Multi-threaded programming",
                "Collection framework and Generics",
                "Introduction to IO Streams",
                "Introduction to Reflection API",
                "Introduction to Swing and AWT." };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Java");
        getListView().setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,long id) {
        String item= (String)parent.getItemAtPosition(position);
        Toast.makeText(getActivity(), "Java course: " + item, Toast.LENGTH_SHORT).show();

        switch (position) {
            case 0:
                JavaFragment fragment = new JavaFragment();
                android.support.v4.app.FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.content_frame,fragment);
                fragmentTransaction.commit();
                /*Toast.makeText(getActivity(), "Position Zero", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), IntroductionComputerProgramActivity.class);
                startActivity(intent);*/
                break;
            case 1:
                Intent intent1 = new Intent(getActivity(), IntroductionJVMActivity.class);
                startActivity(intent1);
                break;
            case 2:
    }
}}
