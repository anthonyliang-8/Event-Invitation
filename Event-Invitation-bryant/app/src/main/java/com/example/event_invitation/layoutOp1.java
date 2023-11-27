package com.example.event_invitation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.event_invitation.databinding.FragmentLayoutOp1Binding;

import java.util.Date;

public class layoutOp1 extends Fragment {

    private FragmentLayoutOp1Binding binding;
    private EventViewModel eventViewModel;
    Date mStartTime = new Date();
    Date mEndTime = new Date();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentLayoutOp1Binding.inflate(inflater, container, false);
        View view = binding.getRoot();

        TextView eventNameView = binding.eventNameViewop1;
        TextView descriptView = binding.descriptViewop1;
        TextView addressView = binding.addressViewop1;
        TextView timeView = binding.timeViewop1;
        Button calButton = binding.calbuttonop1;

        Log.d("Debug", "even name:"+eventViewModel.eventName.getValue());

        return view;
    }
}