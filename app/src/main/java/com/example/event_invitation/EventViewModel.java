package com.example.event_invitation;
import android.util.Log;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;


public class EventViewModel extends AndroidViewModel {
    /*
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
    */

    private EventRepository mRepository;
    // Using LiveData and caching what getEvents returns has several benefits:
    // - We can put an observer on the data (instead of polling for changes) and only update the
    //   the UI when the data actually changes.
    // - Repository is completely separated from the UI through the ViewModel.
    private final LiveData<List<Event>> mAllEvents;
    private final LiveData<List<String>> mAllEventNames;

    public EventViewModel(Application application) {
        super(application);
        mRepository = new EventRepository(application);
        mAllEvents = mRepository.getAllEvents();
        mAllEventNames = mRepository.getAllEventNames();
      //  mRepository.deleteAll();
    }


    LiveData<List<Event>> getAllEvents() {
        return mAllEvents;
    }
    LiveData<List<String>> getAllEventNames() {
        return mAllEventNames;
    }
    void insert(Event event) {
        mRepository.insert(event);
    }
    void deleteAll() {mRepository.deleteAll();}

}
