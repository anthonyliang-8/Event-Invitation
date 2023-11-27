package com.example.event_invitation;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.event_invitation.databinding.FragmentLayoutOp3Binding;

import java.util.Date;

public class layoutOp3 extends Fragment {

    private FragmentLayoutOp3Binding binding;
    private EventViewModel eventViewModel;
    Date mStartTime = new Date();
    Date mEndTime = new Date();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentLayoutOp3Binding.inflate(inflater, container, false);
        View view = binding.getRoot();

        TextView eventNameView = binding.eventNameViewop3;
        TextView descriptView = binding.descriptViewop3;
        TextView addressView = binding.addressViewop3;
        TextView timeView = binding.timeViewop3;
        Button calButton = binding.calbuttonop3;

        return view;
    }
}