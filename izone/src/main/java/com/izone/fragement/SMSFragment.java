package com.izone.fragement;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.telephony.SmsManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.izone.app.R;
import com.izone.util.ExpandableListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class SMSFragment extends Fragment {
    private EditText mobileNo,message;
    private Button buttonSMS;

    public SMSFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_sms, container, false);

       // mobileNo=(EditText)rootView.findViewById(R.id.editSMSMobileNo);
        message=(EditText)rootView.findViewById(R.id.editMessage);
        buttonSMS=(Button)rootView.findViewById(R.id.buttonSMS);

        //Performing action on button click
        buttonSMS.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
               // String no=mobileNo.getText().toString();
                String msg=message.getText().toString();

                //Getting intent and PendingIntent instance
                Intent intent=new Intent(getActivity(),SMSFragment.class);
                PendingIntent pi=PendingIntent.getActivity(getActivity(), 0, intent,0);

                //Get the SmsManager instance and call the sendTextMessage method to send message
                SmsManager sms=SmsManager.getDefault();
               // sms.sendTextMessage(no, null, msg, pi,null);
                //send message to Manish
                sms.sendTextMessage("07011793872", null, msg, pi,null);
                //send message to Rakesh
                sms.sendTextMessage("08368121255", null, msg, pi,null);



                Toast.makeText(getActivity(), "Message Sent successfully!",
                        Toast.LENGTH_LONG).show();
            }
        });
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Send SMS to Intellizone");
    }




}
