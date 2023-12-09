package com.example.event_invitation;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.media.MediaPlayer;

import com.example.event_invitation.databinding.FragmentInviteBinding;
import com.example.event_invitation.databinding.FragmentLayoutBinding;

import org.w3c.dom.Text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LayoutFragment extends Fragment {
    private FragmentLayoutBinding binding;
    private EventViewModel eventViewModel;
    Date mStartTime = new Date();
    Date mEndTime = new Date();
    MediaPlayer music;
    @SuppressLint("SimpleDateFormat")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        eventViewModel = new ViewModelProvider(this).get(EventViewModel.class);
        // Inflate the layout for this fragment
        binding = FragmentLayoutBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        TextView eventNameView = binding.eventNameView;
        TextView descriptView = binding.descriptView;
        TextView addressView = binding.addressView;
        TextView timeView = binding.timeView;
        Button calButton = binding.calButton;
    //    Log.d("Debug", "even name:"+eventViewModel.eventName.getValue());
        String eventName = LayoutFragmentArgs.fromBundle(requireArguments()).getEventName();
        String descript = LayoutFragmentArgs.fromBundle(requireArguments()).getDescript();
        String address = LayoutFragmentArgs.fromBundle(requireArguments()).getAddress();
        String year = LayoutFragmentArgs.fromBundle(requireArguments()).getYear();
        String month = LayoutFragmentArgs.fromBundle(requireArguments()).getMonth();
        String day = LayoutFragmentArgs.fromBundle(requireArguments()).getDay();
        String start = LayoutFragmentArgs.fromBundle(requireArguments()).getStart();
        String end = LayoutFragmentArgs.fromBundle(requireArguments()).getEnd();
        int id = layoutOp1Args.fromBundle(requireArguments()).getId();
        int pic = layoutOp1Args.fromBundle(requireArguments()).getPicture();
        int song = layoutOp1Args.fromBundle(requireArguments()).getSong();

        eventNameView.setText(eventName);
        descriptView.setText(descript);
        addressView.setText(address);
        timeView.setText(year+"-"+month+"-"+ day+" "+start+":00-"+ end+":00");

        if(pic == 1){
            binding.imageView.setImageDrawable(getResources().getDrawable(R.drawable.summer));
        } else if (pic == 2) {
            binding.imageView.setImageDrawable(getResources().getDrawable(R.drawable.ghost));
        } else if (pic == 3) {
            binding.imageView.setImageDrawable(getResources().getDrawable(R.drawable.snowy));
        }
        else{
            binding.imageView.setImageDrawable(getResources().getDrawable(R.drawable.cake));
        }

        if(song == 1){
           music = MediaPlayer.create(getActivity(), R.raw.birthday);
            music.start();
            } else if (song == 2) {
             music = MediaPlayer.create(getActivity(), R.raw.christmas);
            music.start();
        } else{
           music = MediaPlayer.create(getActivity(), R.raw.spooky);
            music.start();
        }


        calButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String startTime = year+"-"+getMonthInt(month)+"-"+day+"T"+start+":00:00";
                String endTime = year+"-"+getMonthInt(month)+"-"+day+"T"+end+":00:00";
                // Parsing the date and time
                SimpleDateFormat mSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
                try {
                    mStartTime = mSimpleDateFormat.parse(startTime);
                    mEndTime = mSimpleDateFormat.parse(endTime);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                Intent mIntent = new Intent(Intent.ACTION_EDIT);
                mIntent.setType("vnd.android.cursor.item/event");
                mIntent.putExtra("beginTime", mStartTime.getTime());
                mIntent.putExtra("time", true);
                mIntent.putExtra("rule", "FREQ=YEARLY");
                mIntent.putExtra("endTime", mEndTime.getTime());
                mIntent.putExtra("title", eventName);
                startActivity(mIntent);

            }});
        return view;
    }
    @Override
    public void onPause() {
        super.onPause();
        music.pause();
    }
    public String getMonthInt(String month){
        switch (month){
            case "Jan":
                return "01";
            case "Feb":
                return "02";
            case "Mar":
                return "03";
            case "Apr":
                return "04";
            case "May":
                return "05";
            case "Jun":
                return "06";
            case "Jul":
                return "07";
            case "Aug":
                return "08";
            case "Sep":
                return "09";
            case "Oct":
                return "10";
            case "Nov":
                return "11";
            case "Dec":
                return "12";
            default:
                return "01";
        }
    }
}