package com.example.event_invitation;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class EventRoomDatabase_Impl extends EventRoomDatabase {
  private volatile EventDao _eventDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `event_table` (`eventID` INTEGER NOT NULL, `eventName` TEXT NOT NULL, `eventAddress` TEXT, `eventDescr` TEXT, `eventYear` TEXT, `eventMonth` TEXT, `eventDay` TEXT, `eventStart` TEXT, `eventEnd` TEXT, `eventLayout` INTEGER NOT NULL, `eventPicture` INTEGER NOT NULL, `inviteSong` INTEGER NOT NULL, PRIMARY KEY(`eventID`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '97e7fba055995882dbaff8777cbb1162')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `event_table`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsEventTable = new HashMap<String, TableInfo.Column>(12);
        _columnsEventTable.put("eventID", new TableInfo.Column("eventID", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEventTable.put("eventName", new TableInfo.Column("eventName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEventTable.put("eventAddress", new TableInfo.Column("eventAddress", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEventTable.put("eventDescr", new TableInfo.Column("eventDescr", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEventTable.put("eventYear", new TableInfo.Column("eventYear", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEventTable.put("eventMonth", new TableInfo.Column("eventMonth", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEventTable.put("eventDay", new TableInfo.Column("eventDay", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEventTable.put("eventStart", new TableInfo.Column("eventStart", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEventTable.put("eventEnd", new TableInfo.Column("eventEnd", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEventTable.put("eventLayout", new TableInfo.Column("eventLayout", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEventTable.put("eventPicture", new TableInfo.Column("eventPicture", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEventTable.put("inviteSong", new TableInfo.Column("inviteSong", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysEventTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesEventTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoEventTable = new TableInfo("event_table", _columnsEventTable, _foreignKeysEventTable, _indicesEventTable);
        final TableInfo _existingEventTable = TableInfo.read(_db, "event_table");
        if (! _infoEventTable.equals(_existingEventTable)) {
          return new RoomOpenHelper.ValidationResult(false, "event_table(com.example.event_invitation.Event).\n"
                  + " Expected:\n" + _infoEventTable + "\n"
                  + " Found:\n" + _existingEventTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "97e7fba055995882dbaff8777cbb1162", "0fdbb91bdc1e222c6f87036f05023e4a");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "event_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `event_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(EventDao.class, EventDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public EventDao eventDao() {
    if (_eventDao != null) {
      return _eventDao;
    } else {
      synchronized(this) {
        if(_eventDao == null) {
          _eventDao = new EventDao_Impl(this);
        }
        return _eventDao;
      }
    }
  }
}
