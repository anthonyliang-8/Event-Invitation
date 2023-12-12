package com.example.event_invitation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import com.example.event_invitation.databinding.FragmentLayoutOp1Binding;
import com.example.event_invitation.databinding.FragmentSelectorBinding;
import com.google.android.material.snackbar.Snackbar;

public class selectorFragment extends Fragment {

    private FragmentSelectorBinding binding;
    private EventViewModel eventViewModel;

    private int layout = 1;
    private int pic;
    private int song;
 //   private int id;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSelectorBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        eventViewModel = new ViewModelProvider(this).get(EventViewModel.class);

        String eventName = selectorFragmentArgs.fromBundle(requireArguments()).getEventName();
        String descript = selectorFragmentArgs.fromBundle(requireArguments()).getDescript();
        String address = selectorFragmentArgs.fromBundle(requireArguments()).getAddress();
        String year = selectorFragmentArgs.fromBundle(requireArguments()).getYear();
        String month = selectorFragmentArgs.fromBundle(requireArguments()).getMonth();
        String day = selectorFragmentArgs.fromBundle(requireArguments()).getDay();
        String start = selectorFragmentArgs.fromBundle(requireArguments()).getStart();
        String end = selectorFragmentArgs.fromBundle(requireArguments()).getEnd();
        pic = selectorFragmentArgs.fromBundle(requireArguments()).getPicture();
        song = selectorFragmentArgs.fromBundle(requireArguments()).getSong();
        layout = selectorFragmentArgs.fromBundle(requireArguments()).getId();

       binding.radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                if(i == binding.option1.getId()){
                    //Summer
                    layout = 1;
                }
                if(i == binding.option2.getId()){
                    //Spooky
                    layout = 2;
                }
                if(i == binding.option3.getId()){
                    //Snowy
                    layout = 3;
                }
                if(i == binding.option4.getId()){
                    //Celebratory
                    layout = 4;
                }
            }
        });

        binding.radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                if(i == binding.radioButton9.getId()){
                    //Summery
                    pic = 1;
                }
                if(i == binding.radioButton10.getId()){
                    //Spooky
                    pic = 2;
                }
                if(i == binding.radioButton11.getId()){
                    //Snowy
                    pic = 3;
                }
                if(i == binding.radioButton12.getId()){
                    //Party
                    pic = 4;
                }
            }
        });

        binding.radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                if(i == binding.radioButton15.getId()){
                    //Birthday
                    song = 1;
                }
                if(i == binding.radioButton14.getId()){
                    //Festive
                    song = 2;
                }
                if(i == binding.radioButton13.getId()){
                    //Spooky
                    song = 3;
                }
            }
        });

        //Button sends all relevant data to different fragment depending on which
        //layout was chosen.
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = (int) Math.ceil(Math.random() * 10000); //primary key is random generated int
                Event event = new Event(id, eventName, address, descript, year, month,day, start, end, layout, pic, song);
                eventViewModel.insert(event);
                if(layout == 1){
                    selectorFragmentDirections.ActionSelectorFragmentToLayoutFragment action =
                            selectorFragmentDirections.actionSelectorFragmentToLayoutFragment(eventName,descript,address,year,month,day,start,end, pic, song, id);
                    Navigation.findNavController(view).navigate(action);
                    Snackbar.make(v, "Finished creating layout!", Snackbar.LENGTH_SHORT).show();
                }
                if(layout == 2){
                    selectorFragmentDirections.ActionSelectorFragmentToLayoutOp2 action =
                            selectorFragmentDirections.actionSelectorFragmentToLayoutOp2(eventName,descript,address,year,month,day,start,end, pic, song, id);
                    Navigation.findNavController(view).navigate(action);
                    Snackbar.make(v, "Finished creating layout!", Snackbar.LENGTH_SHORT).show();
                }
                if(layout == 3){
                    selectorFragmentDirections.ActionSelectorFragmentToLayoutOp3 action =
                            selectorFragmentDirections.actionSelectorFragmentToLayoutOp3(eventName,descript,address,year,month,day,start,end, pic, song, id);
                    Navigation.findNavController(view).navigate(action);
                    Snackbar.make(v, "Finished creating layout!", Snackbar.LENGTH_SHORT).show();
                }
                if(layout == 4){
                    selectorFragmentDirections.ActionSelectorFragmentToLayoutOp1 action =
                            selectorFragmentDirections.actionSelectorFragmentToLayoutOp1(eventName,descript,address,year,month,day,start,end, pic, song, id);
                    Navigation.findNavController(view).navigate(action);
                    Snackbar.make(v, "Finished creating layout!", Snackbar.LENGTH_SHORT).show();
                }
            }
        });

        return view;
    }
}