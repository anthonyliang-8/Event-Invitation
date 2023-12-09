package com.example.event_invitation;

import android.app.Application;
import androidx.lifecycle.LiveData;

import java.util.List;

/**
 * Abstracted Repository as promoted by the Architecture Guide.
 * https://developer.android.com/topic/libraries/architecture/guide.html
 */

class EventRepository {

    private EventDao mEventDao;
    private LiveData<List<Event>> mAllEvent;
    private LiveData<List<String>> mAllEventNames;

    // Note that in order to unit test the WordRepository, you have to remove the Application
    // dependency. This adds complexity and much more code, and this sample is not about testing.
    // See the BasicSample in the android-architecture-components repository at
    // https://github.com/googlesamples
    EventRepository(Application application) {
        EventRoomDatabase db = EventRoomDatabase.getDatabase(application);
        mEventDao = db.eventDao();
        mAllEvent = mEventDao.getEvents();
        mAllEventNames = mEventDao.getEventNames();
    }

    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has changed.
    LiveData<List<Event>> getAllEvents() {
        return mAllEvent;
    }
    LiveData<List<String>> getAllEventNames() {
        return mAllEventNames;
    }

    // You must call this on a non-UI thread or your app will throw an exception. Room ensures
    // that you're not doing any long running operations on the main thread, blocking the UI.
    void insert(Event event) {
        EventRoomDatabase.databaseWriteExecutor.execute(() -> {
            mEventDao.insert(event);
        });
    }

    void deleteAll() {
        EventRoomDatabase.databaseWriteExecutor.execute(() -> {
            mEventDao.deleteAll();
        });
    }
}
