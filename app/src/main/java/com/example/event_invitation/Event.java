package com.example.event_invitation;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.annotation.NonNull;
import androidx.room.PrimaryKey;


import java.util.Date;
@Entity(tableName = "event_table")
public class Event {

    @PrimaryKey
    @ColumnInfo(name = "eventID")
    protected  int mEventID;

    @NonNull
    @ColumnInfo(name = "eventName")
    protected  String mEventName;
    @ColumnInfo(name = "eventAddress")
    protected String mEventAddr;
    @ColumnInfo(name = "eventDescr")
    protected String mEventDescript;

    @ColumnInfo(name = "eventYear")
    protected String mYear;
    @ColumnInfo(name = "eventMonth")
    protected String mMonth;
    @ColumnInfo(name = "eventDay")
    protected String mDay;

    @ColumnInfo(name = "eventStart")
    protected String mStart;
    @ColumnInfo(name = "eventEnd")
    protected String mEnd;

    @ColumnInfo(name = "eventLayout")
    protected int inviteLayout;
    @ColumnInfo(name = "eventPicture")
    protected int invitePicture;
    @ColumnInfo(name = "inviteSong")
    protected int inviteSong;

    public Event() {}

    public Event( int id, @NonNull String name, String address, String description, String year, String month, String day,  String start, String end, int inviteLayout, int invitePicture, int inviteSong){
        this.mEventID = id;
        this.mEventName=name;
        this.mEventAddr=address;
        this.mEventDescript=description;
        this.mYear = year;
        this.mMonth = month;
        this.mDay = day;
        this.mStart=start;
        this.mEnd=end;
        this.inviteLayout = inviteLayout;
        this.invitePicture = invitePicture;
        this.inviteSong = inviteSong;
    }


    public int getEventId(){return mEventID;}

    public String getEventName(){return mEventName;}
    public String getEventAddr(){return mEventAddr;}
    public String getEventDescript (){return mEventDescript;}
    public String getYear(){return mYear;}
    public String getMonth(){return mMonth;}
    public String getDay(){return mDay;}
    public String getStart(){return mStart;}
    public String getEnd(){return mEnd;}
    public int getInviteLayout(){return inviteLayout;}
    public int getInvitePicture(){return invitePicture;}
    public int getInviteSong(){return inviteSong;}
}
