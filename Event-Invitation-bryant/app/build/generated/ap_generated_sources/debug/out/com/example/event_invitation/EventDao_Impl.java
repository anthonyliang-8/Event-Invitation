package com.example.event_invitation;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class EventDao_Impl implements EventDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Event> __insertionAdapterOfEvent;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public EventDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfEvent = new EntityInsertionAdapter<Event>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `event_table` (`eventID`,`eventName`,`eventAddress`,`eventDescr`,`eventYear`,`eventMonth`,`eventDay`,`eventStart`,`eventEnd`,`eventLayout`,`eventPicture`,`inviteSong`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Event value) {
        stmt.bindLong(1, value.mEventID);
        if (value.getEventName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getEventName());
        }
        if (value.getEventAddr() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getEventAddr());
        }
        if (value.getEventDescript() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEventDescript());
        }
        if (value.getYear() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getYear());
        }
        if (value.getMonth() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getMonth());
        }
        if (value.getDay() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getDay());
        }
        if (value.getStart() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getStart());
        }
        if (value.getEnd() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getEnd());
        }
        stmt.bindLong(10, value.getInviteLayout());
        stmt.bindLong(11, value.getInvitePicture());
        stmt.bindLong(12, value.getInviteSong());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM event_table";
        return _query;
      }
    };
  }

  @Override
  public void insert(final Event event) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfEvent.insert(event);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public LiveData<List<Event>> getEvents() {
    final String _sql = "SELECT * FROM event_table ORDER BY eventName ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"event_table"}, false, new Callable<List<Event>>() {
      @Override
      public List<Event> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfMEventID = CursorUtil.getColumnIndexOrThrow(_cursor, "eventID");
          final int _cursorIndexOfMEventName = CursorUtil.getColumnIndexOrThrow(_cursor, "eventName");
          final int _cursorIndexOfMEventAddr = CursorUtil.getColumnIndexOrThrow(_cursor, "eventAddress");
          final int _cursorIndexOfMEventDescript = CursorUtil.getColumnIndexOrThrow(_cursor, "eventDescr");
          final int _cursorIndexOfMYear = CursorUtil.getColumnIndexOrThrow(_cursor, "eventYear");
          final int _cursorIndexOfMMonth = CursorUtil.getColumnIndexOrThrow(_cursor, "eventMonth");
          final int _cursorIndexOfMDay = CursorUtil.getColumnIndexOrThrow(_cursor, "eventDay");
          final int _cursorIndexOfMStart = CursorUtil.getColumnIndexOrThrow(_cursor, "eventStart");
          final int _cursorIndexOfMEnd = CursorUtil.getColumnIndexOrThrow(_cursor, "eventEnd");
          final int _cursorIndexOfInviteLayout = CursorUtil.getColumnIndexOrThrow(_cursor, "eventLayout");
          final int _cursorIndexOfInvitePicture = CursorUtil.getColumnIndexOrThrow(_cursor, "eventPicture");
          final int _cursorIndexOfInviteSong = CursorUtil.getColumnIndexOrThrow(_cursor, "inviteSong");
          final List<Event> _result = new ArrayList<Event>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Event _item;
            _item = new Event();
            _item.mEventID = _cursor.getInt(_cursorIndexOfMEventID);
            if (_cursor.isNull(_cursorIndexOfMEventName)) {
              _item.mEventName = null;
            } else {
              _item.mEventName = _cursor.getString(_cursorIndexOfMEventName);
            }
            if (_cursor.isNull(_cursorIndexOfMEventAddr)) {
              _item.mEventAddr = null;
            } else {
              _item.mEventAddr = _cursor.getString(_cursorIndexOfMEventAddr);
            }
            if (_cursor.isNull(_cursorIndexOfMEventDescript)) {
              _item.mEventDescript = null;
            } else {
              _item.mEventDescript = _cursor.getString(_cursorIndexOfMEventDescript);
            }
            if (_cursor.isNull(_cursorIndexOfMYear)) {
              _item.mYear = null;
            } else {
              _item.mYear = _cursor.getString(_cursorIndexOfMYear);
            }
            if (_cursor.isNull(_cursorIndexOfMMonth)) {
              _item.mMonth = null;
            } else {
              _item.mMonth = _cursor.getString(_cursorIndexOfMMonth);
            }
            if (_cursor.isNull(_cursorIndexOfMDay)) {
              _item.mDay = null;
            } else {
              _item.mDay = _cursor.getString(_cursorIndexOfMDay);
            }
            if (_cursor.isNull(_cursorIndexOfMStart)) {
              _item.mStart = null;
            } else {
              _item.mStart = _cursor.getString(_cursorIndexOfMStart);
            }
            if (_cursor.isNull(_cursorIndexOfMEnd)) {
              _item.mEnd = null;
            } else {
              _item.mEnd = _cursor.getString(_cursorIndexOfMEnd);
            }
            _item.inviteLayout = _cursor.getInt(_cursorIndexOfInviteLayout);
            _item.invitePicture = _cursor.getInt(_cursorIndexOfInvitePicture);
            _item.inviteSong = _cursor.getInt(_cursorIndexOfInviteSong);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<String>> getEventNames() {
    final String _sql = "SELECT eventName FROM event_table ORDER BY eventName ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"event_table"}, false, new Callable<List<String>>() {
      @Override
      public List<String> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final List<String> _result = new ArrayList<String>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final String _item;
            if (_cursor.isNull(0)) {
              _item = null;
            } else {
              _item = _cursor.getString(0);
            }
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
