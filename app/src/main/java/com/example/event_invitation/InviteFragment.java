package com.example.event_invitation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.event_invitation.databinding.FragmentInviteBinding;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class InviteFragment extends Fragment {
    private FragmentInviteBinding binding;
    private EventViewModel eventViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        eventViewModel = new ViewModelProvider(this).get(EventViewModel.class);
        // Inflate the layout for this fragment
        binding = FragmentInviteBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        EditText nameView = binding.eventNameEditText;
        EditText addressView = binding.eventAddEditText;
        EditText descriptionView = binding.eventDescEditText;
        Button okButton = binding.okButton;
        Spinner yearSpinner = binding.yearSpinner;
        Spinner monthSpinner = binding.monthSpinner;
        Spinner daySpinner = binding.daySpinner;
        Spinner startSpinner = binding.starttimeSpinner;
        Spinner endSpinner = binding.endtimeSpinner;
        // Get a new or existing ViewModel from the ViewModelProvider.
        eventViewModel = new ViewModelProvider(this).get(EventViewModel.class);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String eventName = nameView.getText().toString();
                String addressName = addressView.getText().toString();
                String descriptName = descriptionView.getText().toString();
                String year = yearSpinner.getSelectedItem().toString();
                String month = monthSpinner.getSelectedItem().toString();
                String day = daySpinner.getSelectedItem().toString();
                String startHour = startSpinner.getSelectedItem().toString();
                String endHour = endSpinner.getSelectedItem().toString();

                InviteFragmentDirections.ActionInviteFragmentToSelectorFragment action =
                        InviteFragmentDirections.actionInviteFragmentToSelectorFragment(eventName,descriptName,addressName,year,month,day,startHour,endHour, 1, 1, 1);
                Navigation.findNavController(view).navigate(action);

            }
        });
     //   return inflater.inflate(R.layout.fragment_invite, container, false);
        return view;
    }


}