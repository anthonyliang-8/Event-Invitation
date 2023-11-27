package com.example.event_invitation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.event_invitation.databinding.FragmentLayoutOp1Binding;
import com.example.event_invitation.databinding.FragmentLayoutOp2Binding;

import java.util.Date;

public class layoutOp2 extends Fragment {
    private FragmentLayoutOp2Binding binding;
    private EventViewModel eventViewModel;
    Date mStartTime = new Date();
    Date mEndTime = new Date();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentLayoutOp2Binding.inflate(inflater, container, false);
        View view = binding.getRoot();

        TextView eventNameView = binding.eventNameViewop2;
        TextView descriptView = binding.descriptViewop2;
        TextView addressView = binding.addressViewop2;
        TextView timeView = binding.timeViewop2;
        Button calButton = binding.calbuttonop2;

        return view;
    }
}