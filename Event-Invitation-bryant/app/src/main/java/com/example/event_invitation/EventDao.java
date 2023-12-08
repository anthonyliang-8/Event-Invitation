package com.example.event_invitation;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public  interface EventDao {
    // allowing the insert of the same event multiple times by passing a
    // conflict resolution strategy
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Event event);

    @Query("DELETE FROM event_table")
    void deleteAll();

    @Query("SELECT * FROM event_table ORDER BY eventName ASC")
    LiveData<List<Event>> getEvents();

    @Query("SELECT eventName FROM event_table ORDER BY eventName ASC")
    LiveData<List<String>> getEventNames();
}
