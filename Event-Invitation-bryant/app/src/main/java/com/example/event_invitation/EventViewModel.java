package com.example.event_invitation;
import android.util.Log;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Date;

public class EventViewModel extends ViewModel{
    public final MutableLiveData<String> eventName = new MutableLiveData<>("");
    public final MutableLiveData<String> descriptionName = new MutableLiveData<>("");
    public final MutableLiveData<String> addressName = new MutableLiveData<>("");
    public final MutableLiveData<Date> eventStart = new MutableLiveData<>();
    public final MutableLiveData<Date> eventEnd = new MutableLiveData<>();
    public final MutableLiveData<String> year = new MutableLiveData<>("");
    public final MutableLiveData<String> month = new MutableLiveData<>("");
    public final MutableLiveData<String> day = new MutableLiveData<>("");
    public final MutableLiveData<String> startHour = new MutableLiveData<>("");
    public final MutableLiveData<String> endHour = new MutableLiveData<>("");


}
