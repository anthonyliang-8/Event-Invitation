package com.example.event_invitation;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class selectorFragmentDirections {
  private selectorFragmentDirections() {
  }

  @NonNull
  public static ActionSelectorFragmentToLayoutFragment actionSelectorFragmentToLayoutFragment(
      @NonNull String eventName, @NonNull String descript, @NonNull String address,
      @NonNull String year, @NonNull String month, @NonNull String day, @NonNull String start,
      @NonNull String end, int picture, int song, int id) {
    return new ActionSelectorFragmentToLayoutFragment(eventName, descript, address, year, month, day, start, end, picture, song, id);
  }

  @NonNull
  public static ActionSelectorFragmentToLayoutOp3 actionSelectorFragmentToLayoutOp3(
      @NonNull String eventName, @NonNull String descript, @NonNull String address,
      @NonNull String year, @NonNull String month, @NonNull String day, @NonNull String start,
      @NonNull String end, int picture, int song, int id) {
    return new ActionSelectorFragmentToLayoutOp3(eventName, descript, address, year, month, day, start, end, picture, song, id);
  }

  @NonNull
  public static ActionSelectorFragmentToLayoutOp2 actionSelectorFragmentToLayoutOp2(
      @NonNull String eventName, @NonNull String descript, @NonNull String address,
      @NonNull String year, @NonNull String month, @NonNull String day, @NonNull String start,
      @NonNull String end, int picture, int song, int id) {
    return new ActionSelectorFragmentToLayoutOp2(eventName, descript, address, year, month, day, start, end, picture, song, id);
  }

  @NonNull
  public static ActionSelectorFragmentToLayoutOp1 actionSelectorFragmentToLayoutOp1(
      @NonNull String eventName, @NonNull String descript, @NonNull String address,
      @NonNull String year, @NonNull String month, @NonNull String day, @NonNull String start,
      @NonNull String end, int picture, int song, int id) {
    return new ActionSelectorFragmentToLayoutOp1(eventName, descript, address, year, month, day, start, end, picture, song, id);
  }

  public static class ActionSelectorFragmentToLayoutFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionSelectorFragmentToLayoutFragment(@NonNull String eventName,
        @NonNull String descript, @NonNull String address, @NonNull String year,
        @NonNull String month, @NonNull String day, @NonNull String start, @NonNull String end,
        int picture, int song, int id) {
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
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutFragment setEventName(@NonNull String eventName) {
      if (eventName == null) {
        throw new IllegalArgumentException("Argument \"event_name\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("event_name", eventName);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutFragment setDescript(@NonNull String descript) {
      if (descript == null) {
        throw new IllegalArgumentException("Argument \"descript\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("descript", descript);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutFragment setAddress(@NonNull String address) {
      if (address == null) {
        throw new IllegalArgumentException("Argument \"address\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("address", address);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutFragment setYear(@NonNull String year) {
      if (year == null) {
        throw new IllegalArgumentException("Argument \"year\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("year", year);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutFragment setMonth(@NonNull String month) {
      if (month == null) {
        throw new IllegalArgumentException("Argument \"month\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("month", month);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutFragment setDay(@NonNull String day) {
      if (day == null) {
        throw new IllegalArgumentException("Argument \"day\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("day", day);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutFragment setStart(@NonNull String start) {
      if (start == null) {
        throw new IllegalArgumentException("Argument \"start\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("start", start);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutFragment setEnd(@NonNull String end) {
      if (end == null) {
        throw new IllegalArgumentException("Argument \"end\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("end", end);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutFragment setPicture(int picture) {
      this.arguments.put("picture", picture);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutFragment setSong(int song) {
      this.arguments.put("song", song);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutFragment setId(int id) {
      this.arguments.put("id", id);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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

    @Override
    public int getActionId() {
      return R.id.action_selectorFragment_to_layoutFragment;
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

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionSelectorFragmentToLayoutFragment that = (ActionSelectorFragmentToLayoutFragment) object;
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
      if (getActionId() != that.getActionId()) {
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
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionSelectorFragmentToLayoutFragment(actionId=" + getActionId() + "){"
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
  }

  public static class ActionSelectorFragmentToLayoutOp3 implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionSelectorFragmentToLayoutOp3(@NonNull String eventName, @NonNull String descript,
        @NonNull String address, @NonNull String year, @NonNull String month, @NonNull String day,
        @NonNull String start, @NonNull String end, int picture, int song, int id) {
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
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutOp3 setEventName(@NonNull String eventName) {
      if (eventName == null) {
        throw new IllegalArgumentException("Argument \"event_name\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("event_name", eventName);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutOp3 setDescript(@NonNull String descript) {
      if (descript == null) {
        throw new IllegalArgumentException("Argument \"descript\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("descript", descript);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutOp3 setAddress(@NonNull String address) {
      if (address == null) {
        throw new IllegalArgumentException("Argument \"address\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("address", address);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutOp3 setYear(@NonNull String year) {
      if (year == null) {
        throw new IllegalArgumentException("Argument \"year\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("year", year);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutOp3 setMonth(@NonNull String month) {
      if (month == null) {
        throw new IllegalArgumentException("Argument \"month\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("month", month);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutOp3 setDay(@NonNull String day) {
      if (day == null) {
        throw new IllegalArgumentException("Argument \"day\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("day", day);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutOp3 setStart(@NonNull String start) {
      if (start == null) {
        throw new IllegalArgumentException("Argument \"start\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("start", start);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutOp3 setEnd(@NonNull String end) {
      if (end == null) {
        throw new IllegalArgumentException("Argument \"end\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("end", end);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutOp3 setPicture(int picture) {
      this.arguments.put("picture", picture);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutOp3 setSong(int song) {
      this.arguments.put("song", song);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutOp3 setId(int id) {
      this.arguments.put("id", id);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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

    @Override
    public int getActionId() {
      return R.id.action_selectorFragment_to_layoutOp3;
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

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionSelectorFragmentToLayoutOp3 that = (ActionSelectorFragmentToLayoutOp3) object;
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
      if (getActionId() != that.getActionId()) {
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
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionSelectorFragmentToLayoutOp3(actionId=" + getActionId() + "){"
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
  }

  public static class ActionSelectorFragmentToLayoutOp2 implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionSelectorFragmentToLayoutOp2(@NonNull String eventName, @NonNull String descript,
        @NonNull String address, @NonNull String year, @NonNull String month, @NonNull String day,
        @NonNull String start, @NonNull String end, int picture, int song, int id) {
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
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutOp2 setEventName(@NonNull String eventName) {
      if (eventName == null) {
        throw new IllegalArgumentException("Argument \"event_name\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("event_name", eventName);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutOp2 setDescript(@NonNull String descript) {
      if (descript == null) {
        throw new IllegalArgumentException("Argument \"descript\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("descript", descript);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutOp2 setAddress(@NonNull String address) {
      if (address == null) {
        throw new IllegalArgumentException("Argument \"address\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("address", address);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutOp2 setYear(@NonNull String year) {
      if (year == null) {
        throw new IllegalArgumentException("Argument \"year\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("year", year);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutOp2 setMonth(@NonNull String month) {
      if (month == null) {
        throw new IllegalArgumentException("Argument \"month\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("month", month);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutOp2 setDay(@NonNull String day) {
      if (day == null) {
        throw new IllegalArgumentException("Argument \"day\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("day", day);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutOp2 setStart(@NonNull String start) {
      if (start == null) {
        throw new IllegalArgumentException("Argument \"start\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("start", start);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutOp2 setEnd(@NonNull String end) {
      if (end == null) {
        throw new IllegalArgumentException("Argument \"end\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("end", end);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutOp2 setPicture(int picture) {
      this.arguments.put("picture", picture);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutOp2 setSong(int song) {
      this.arguments.put("song", song);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutOp2 setId(int id) {
      this.arguments.put("id", id);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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

    @Override
    public int getActionId() {
      return R.id.action_selectorFragment_to_layoutOp2;
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

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionSelectorFragmentToLayoutOp2 that = (ActionSelectorFragmentToLayoutOp2) object;
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
      if (getActionId() != that.getActionId()) {
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
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionSelectorFragmentToLayoutOp2(actionId=" + getActionId() + "){"
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
  }

  public static class ActionSelectorFragmentToLayoutOp1 implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionSelectorFragmentToLayoutOp1(@NonNull String eventName, @NonNull String descript,
        @NonNull String address, @NonNull String year, @NonNull String month, @NonNull String day,
        @NonNull String start, @NonNull String end, int picture, int song, int id) {
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
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutOp1 setEventName(@NonNull String eventName) {
      if (eventName == null) {
        throw new IllegalArgumentException("Argument \"event_name\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("event_name", eventName);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutOp1 setDescript(@NonNull String descript) {
      if (descript == null) {
        throw new IllegalArgumentException("Argument \"descript\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("descript", descript);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutOp1 setAddress(@NonNull String address) {
      if (address == null) {
        throw new IllegalArgumentException("Argument \"address\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("address", address);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutOp1 setYear(@NonNull String year) {
      if (year == null) {
        throw new IllegalArgumentException("Argument \"year\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("year", year);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutOp1 setMonth(@NonNull String month) {
      if (month == null) {
        throw new IllegalArgumentException("Argument \"month\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("month", month);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutOp1 setDay(@NonNull String day) {
      if (day == null) {
        throw new IllegalArgumentException("Argument \"day\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("day", day);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutOp1 setStart(@NonNull String start) {
      if (start == null) {
        throw new IllegalArgumentException("Argument \"start\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("start", start);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutOp1 setEnd(@NonNull String end) {
      if (end == null) {
        throw new IllegalArgumentException("Argument \"end\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("end", end);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutOp1 setPicture(int picture) {
      this.arguments.put("picture", picture);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutOp1 setSong(int song) {
      this.arguments.put("song", song);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionSelectorFragmentToLayoutOp1 setId(int id) {
      this.arguments.put("id", id);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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

    @Override
    public int getActionId() {
      return R.id.action_selectorFragment_to_layoutOp1;
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

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionSelectorFragmentToLayoutOp1 that = (ActionSelectorFragmentToLayoutOp1) object;
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
      if (getActionId() != that.getActionId()) {
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
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionSelectorFragmentToLayoutOp1(actionId=" + getActionId() + "){"
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
  }
}
