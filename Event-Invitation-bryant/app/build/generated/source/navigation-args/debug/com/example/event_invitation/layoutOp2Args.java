package com.example.event_invitation;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class layoutOp2Args implements NavArgs {
  private final HashMap arguments = new HashMap();

  private layoutOp2Args() {
  }

  @SuppressWarnings("unchecked")
  private layoutOp2Args(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static layoutOp2Args fromBundle(@NonNull Bundle bundle) {
    layoutOp2Args __result = new layoutOp2Args();
    bundle.setClassLoader(layoutOp2Args.class.getClassLoader());
    if (bundle.containsKey("event_name")) {
      String eventName;
      eventName = bundle.getString("event_name");
      if (eventName == null) {
        throw new IllegalArgumentException("Argument \"event_name\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("event_name", eventName);
    } else {
      throw new IllegalArgumentException("Required argument \"event_name\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("descript")) {
      String descript;
      descript = bundle.getString("descript");
      if (descript == null) {
        throw new IllegalArgumentException("Argument \"descript\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("descript", descript);
    } else {
      throw new IllegalArgumentException("Required argument \"descript\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("address")) {
      String address;
      address = bundle.getString("address");
      if (address == null) {
        throw new IllegalArgumentException("Argument \"address\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("address", address);
    } else {
      throw new IllegalArgumentException("Required argument \"address\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("year")) {
      String year;
      year = bundle.getString("year");
      if (year == null) {
        throw new IllegalArgumentException("Argument \"year\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("year", year);
    } else {
      throw new IllegalArgumentException("Required argument \"year\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("month")) {
      String month;
      month = bundle.getString("month");
      if (month == null) {
        throw new IllegalArgumentException("Argument \"month\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("month", month);
    } else {
      throw new IllegalArgumentException("Required argument \"month\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("day")) {
      String day;
      day = bundle.getString("day");
      if (day == null) {
        throw new IllegalArgumentException("Argument \"day\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("day", day);
    } else {
      throw new IllegalArgumentException("Required argument \"day\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("start")) {
      String start;
      start = bundle.getString("start");
      if (start == null) {
        throw new IllegalArgumentException("Argument \"start\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("start", start);
    } else {
      throw new IllegalArgumentException("Required argument \"start\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("end")) {
      String end;
      end = bundle.getString("end");
      if (end == null) {
        throw new IllegalArgumentException("Argument \"end\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("end", end);
    } else {
      throw new IllegalArgumentException("Required argument \"end\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("picture")) {
      int picture;
      picture = bundle.getInt("picture");
      __result.arguments.put("picture", picture);
    } else {
      throw new IllegalArgumentException("Required argument \"picture\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("song")) {
      int song;
      song = bundle.getInt("song");
      __result.arguments.put("song", song);
    } else {
      throw new IllegalArgumentException("Required argument \"song\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("id")) {
      int id;
      id = bundle.getInt("id");
      __result.arguments.put("id", id);
    } else {
      throw new IllegalArgumentException("Required argument \"id\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static layoutOp2Args fromSavedStateHandle(@NonNull SavedStateHandle savedStateHandle) {
    layoutOp2Args __result = new layoutOp2Args();
    if (savedStateHandle.contains("event_name")) {
      String eventName;
      eventName = savedStateHandle.get("event_name");
      if (eventName == null) {
        throw new IllegalArgumentException("Argument \"event_name\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("event_name", eventName);
    } else {
      throw new IllegalArgumentException("Required argument \"event_name\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("descript")) {
      String descript;
      descript = savedStateHandle.get("descript");
      if (descript == null) {
        throw new IllegalArgumentException("Argument \"descript\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("descript", descript);
    } else {
      throw new IllegalArgumentException("Required argument \"descript\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("address")) {
      String address;
      address = savedStateHandle.get("address");
      if (address == null) {
        throw new IllegalArgumentException("Argument \"address\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("address", address);
    } else {
      throw new IllegalArgumentException("Required argument \"address\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("year")) {
      String year;
      year = savedStateHandle.get("year");
      if (year == null) {
        throw new IllegalArgumentException("Argument \"year\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("year", year);
    } else {
      throw new IllegalArgumentException("Required argument \"year\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("month")) {
      String month;
      month = savedStateHandle.get("month");
      if (month == null) {
        throw new IllegalArgumentException("Argument \"month\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("month", month);
    } else {
      throw new IllegalArgumentException("Required argument \"month\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("day")) {
      String day;
      day = savedStateHandle.get("day");
      if (day == null) {
        throw new IllegalArgumentException("Argument \"day\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("day", day);
    } else {
      throw new IllegalArgumentException("Required argument \"day\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("start")) {
      String start;
      start = savedStateHandle.get("start");
      if (start == null) {
        throw new IllegalArgumentException("Argument \"start\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("start", start);
    } else {
      throw new IllegalArgumentException("Required argument \"start\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("end")) {
      String end;
      end = savedStateHandle.get("end");
      if (end == null) {
        throw new IllegalArgumentException("Argument \"end\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("end", end);
    } else {
      throw new IllegalArgumentException("Required argument \"end\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("picture")) {
      int picture;
      picture = savedStateHandle.get("picture");
      __result.arguments.put("picture", picture);
    } else {
      throw new IllegalArgumentException("Required argument \"picture\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("song")) {
      int song;
      song = savedStateHandle.get("song");
      __result.arguments.put("song", song);
    } else {
      throw new IllegalArgumentException("Required argument \"song\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("id")) {
      int id;
      id = savedStateHandle.get("id");
      __result.arguments.put("id", id);
    } else {
      throw new IllegalArgumentException("Required argument \"id\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getEventName() {
    return (String) arguments.get("event_name");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getDescript() {
    return (String) arguments.get("descript");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getAddress() {
    return (String) arguments.get("address");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getYear() {
    return (String) arguments.get("year");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getMonth() {
    return (String) arguments.get("month");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getDay() {
    return (String) arguments.get("day");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getStart() {
    return (String) arguments.get("start");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getEnd() {
    return (String) arguments.get("end");
  }

  @SuppressWarnings("unchecked")
  public int getPicture() {
    return (int) arguments.get("picture");
  }

  @SuppressWarnings("unchecked")
  public int getSong() {
    return (int) arguments.get("song");
  }

  @SuppressWarnings("unchecked")
  public int getId() {
    return (int) arguments.get("id");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("event_name")) {
      String eventName = (String) arguments.get("event_name");
      __result.putString("event_name", eventName);
    }
    if (arguments.containsKey("descript")) {
      String descript = (String) arguments.get("descript");
      __result.putString("descript", descript);
    }
    if (arguments.containsKey("address")) {
      String address = (String) arguments.get("address");
      __result.putString("address", address);
    }
    if (arguments.containsKey("year")) {
      String year = (String) arguments.get("year");
      __result.putString("year", year);
    }
    if (arguments.containsKey("month")) {
      String month = (String) arguments.get("month");
      __result.putString("month", month);
    }
    if (arguments.containsKey("day")) {
      String day = (String) arguments.get("day");
      __result.putString("day", day);
    }
    if (arguments.containsKey("start")) {
      String start = (String) arguments.get("start");
      __result.putString("start", start);
    }
    if (arguments.containsKey("end")) {
      String end = (String) arguments.get("end");
      __result.putString("end", end);
    }
    if (arguments.containsKey("picture")) {
      int picture = (int) arguments.get("picture");
      __result.putInt("picture", picture);
    }
    if (arguments.containsKey("song")) {
      int song = (int) arguments.get("song");
      __result.putInt("song", song);
    }
    if (arguments.containsKey("id")) {
      int id = (int) arguments.get("id");
      __result.putInt("id", id);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("event_name")) {
      String eventName = (String) arguments.get("event_name");
      __result.set("event_name", eventName);
    }
    if (arguments.containsKey("descript")) {
      String descript = (String) arguments.get("descript");
      __result.set("descript", descript);
    }
    if (arguments.containsKey("address")) {
      String address = (String) arguments.get("address");
      __result.set("address", address);
    }
    if (arguments.containsKey("year")) {
      String year = (String) arguments.get("year");
      __result.set("year", year);
    }
    if (arguments.containsKey("month")) {
      String month = (String) arguments.get("month");
      __result.set("month", month);
    }
    if (arguments.containsKey("day")) {
      String day = (String) arguments.get("day");
      __result.set("day", day);
    }
    if (arguments.containsKey("start")) {
      String start = (String) arguments.get("start");
      __result.set("start", start);
    }
    if (arguments.containsKey("end")) {
      String end = (String) arguments.get("end");
      __result.set("end", end);
    }
    if (arguments.containsKey("picture")) {
      int picture = (int) arguments.get("picture");
      __result.set("picture", picture);
    }
    if (arguments.containsKey("song")) {
      int song = (int) arguments.get("song");
      __result.set("song", song);
    }
    if (arguments.containsKey("id")) {
      int id = (int) arguments.get("id");
      __result.set("id", id);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    layoutOp2Args that = (layoutOp2Args) object;
    if (arguments.containsKey("event_name") != that.arguments.containsKey("event_name")) {
      return false;
    }
    if (getEventName() != null ? !getEventName().equals(that.getEventName()) : that.getEventName() != null) {
      return false;
    }
    if (arguments.containsKey("descript") != that.arguments.containsKey("descript")) {
      return false;
    }
    if (getDescript() != null ? !getDescript().equals(that.getDescript()) : that.getDescript() != null) {
      return false;
    }
    if (arguments.containsKey("address") != that.arguments.containsKey("address")) {
      return false;
    }
    if (getAddress() != null ? !getAddress().equals(that.getAddress()) : that.getAddress() != null) {
      return false;
    }
    if (arguments.containsKey("year") != that.arguments.containsKey("year")) {
      return false;
    }
    if (getYear() != null ? !getYear().equals(that.getYear()) : that.getYear() != null) {
      return false;
    }
    if (arguments.containsKey("month") != that.arguments.containsKey("month")) {
      return false;
    }
    if (getMonth() != null ? !getMonth().equals(that.getMonth()) : that.getMonth() != null) {
      return false;
    }
    if (arguments.containsKey("day") != that.arguments.containsKey("day")) {
      return false;
    }
    if (getDay() != null ? !getDay().equals(that.getDay()) : that.getDay() != null) {
      return false;
    }
    if (arguments.containsKey("start") != that.arguments.containsKey("start")) {
      return false;
    }
    if (getStart() != null ? !getStart().equals(that.getStart()) : that.getStart() != null) {
      return false;
    }
    if (arguments.containsKey("end") != that.arguments.containsKey("end")) {
      return false;
    }
    if (getEnd() != null ? !getEnd().equals(that.getEnd()) : that.getEnd() != null) {
      return false;
    }
    if (arguments.containsKey("picture") != that.arguments.containsKey("picture")) {
      return false;
    }
    if (getPicture() != that.getPicture()) {
      return false;
    }
    if (arguments.containsKey("song") != that.arguments.containsKey("song")) {
      return false;
    }
    if (getSong() != that.getSong()) {
      return false;
    }
    if (arguments.containsKey("id") != that.arguments.containsKey("id")) {
      return false;
    }
    if (getId() != that.getId()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getEventName() != null ? getEventName().hashCode() : 0);
    result = 31 * result + (getDescript() != null ? getDescript().hashCode() : 0);
    result = 31 * result + (getAddress() != null ? getAddress().hashCode() : 0);
    result = 31 * result + (getYear() != null ? getYear().hashCode() : 0);
    result = 31 * result + (getMonth() != null ? getMonth().hashCode() : 0);
    result = 31 * result + (getDay() != null ? getDay().hashCode() : 0);
    result = 31 * result + (getStart() != null ? getStart().hashCode() : 0);
    result = 31 * result + (getEnd() != null ? getEnd().hashCode() : 0);
    result = 31 * result + getPicture();
    result = 31 * result + getSong();
    result = 31 * result + getId();
    return result;
  }

  @Override
  public String toString() {
    return "layoutOp2Args{"
        + "eventName=" + getEventName()
        + ", descript=" + getDescript()
        + ", address=" + getAddress()
        + ", year=" + getYear()
        + ", month=" + getMonth()
        + ", day=" + getDay()
        + ", start=" + getStart()
        + ", end=" + getEnd()
        + ", picture=" + getPicture()
        + ", song=" + getSong()
        + ", id=" + getId()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull layoutOp2Args original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull String eventName, @NonNull String descript, @NonNull String address,
        @NonNull String year, @NonNull String month, @NonNull String day, @NonNull String start,
        @NonNull String end, int picture, int song, int id) {
      if (eventName == null) {
        throw new IllegalArgumentException("Argument \"event_name\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("event_name", eventName);
      if (descript == null) {
        throw new IllegalArgumentException("Argument \"descript\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("descript", descript);
      if (address == null) {
        throw new IllegalArgumentException("Argument \"address\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("address", address);
      if (year == null) {
        throw new IllegalArgumentException("Argument \"year\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("year", year);
      if (month == null) {
        throw new IllegalArgumentException("Argument \"month\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("month", month);
      if (day == null) {
        throw new IllegalArgumentException("Argument \"day\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("day", day);
      if (start == null) {
        throw new IllegalArgumentException("Argument \"start\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("start", start);
      if (end == null) {
        throw new IllegalArgumentException("Argument \"end\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("end", end);
      this.arguments.put("picture", picture);
      this.arguments.put("song", song);
      this.arguments.put("id", id);
    }

    @NonNull
    public layoutOp2Args build() {
      layoutOp2Args result = new layoutOp2Args(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setEventName(@NonNull String eventName) {
      if (eventName == null) {
        throw new IllegalArgumentException("Argument \"event_name\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("event_name", eventName);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setDescript(@NonNull String descript) {
      if (descript == null) {
        throw new IllegalArgumentException("Argument \"descript\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("descript", descript);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setAddress(@NonNull String address) {
      if (address == null) {
        throw new IllegalArgumentException("Argument \"address\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("address", address);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setYear(@NonNull String year) {
      if (year == null) {
        throw new IllegalArgumentException("Argument \"year\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("year", year);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setMonth(@NonNull String month) {
      if (month == null) {
        throw new IllegalArgumentException("Argument \"month\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("month", month);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setDay(@NonNull String day) {
      if (day == null) {
        throw new IllegalArgumentException("Argument \"day\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("day", day);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setStart(@NonNull String start) {
      if (start == null) {
        throw new IllegalArgumentException("Argument \"start\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("start", start);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setEnd(@NonNull String end) {
      if (end == null) {
        throw new IllegalArgumentException("Argument \"end\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("end", end);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setPicture(int picture) {
      this.arguments.put("picture", picture);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setSong(int song) {
      this.arguments.put("song", song);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setId(int id) {
      this.arguments.put("id", id);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getEventName() {
      return (String) arguments.get("event_name");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getDescript() {
      return (String) arguments.get("descript");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getAddress() {
      return (String) arguments.get("address");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getYear() {
      return (String) arguments.get("year");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getMonth() {
      return (String) arguments.get("month");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getDay() {
      return (String) arguments.get("day");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getStart() {
      return (String) arguments.get("start");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getEnd() {
      return (String) arguments.get("end");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    public int getPicture() {
      return (int) arguments.get("picture");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    public int getSong() {
      return (int) arguments.get("song");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    public int getId() {
      return (int) arguments.get("id");
    }
  }
}
