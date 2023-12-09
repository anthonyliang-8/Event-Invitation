// Generated by view binder compiler. Do not edit!
package com.example.event_invitation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.event_invitation.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentInviteBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Spinner daySpinner;

  @NonNull
  public final Spinner endtimeSpinner;

  @NonNull
  public final EditText eventAddEditText;

  @NonNull
  public final LinearLayout eventAddLayout;

  @NonNull
  public final TextView eventAddTextView;

  @NonNull
  public final LinearLayout eventDayLayout;

  @NonNull
  public final TextView eventDayTextView;

  @NonNull
  public final EditText eventDescEditText;

  @NonNull
  public final LinearLayout eventDescLayout;

  @NonNull
  public final TextView eventDescTextView;

  @NonNull
  public final EditText eventNameEditText;

  @NonNull
  public final LinearLayout eventNameLayout;

  @NonNull
  public final TextView eventNameTextView;

  @NonNull
  public final LinearLayout eventTimeLayout;

  @NonNull
  public final TextView eventTimeTextView;

  @NonNull
  public final TextView eventtoTimeTextView;

  @NonNull
  public final TextView invHeadTextView;

  @NonNull
  public final Spinner monthSpinner;

  @NonNull
  public final Button okButton;

  @NonNull
  public final Spinner starttimeSpinner;

  @NonNull
  public final Spinner yearSpinner;

  private FragmentInviteBinding(@NonNull ConstraintLayout rootView, @NonNull Spinner daySpinner,
      @NonNull Spinner endtimeSpinner, @NonNull EditText eventAddEditText,
      @NonNull LinearLayout eventAddLayout, @NonNull TextView eventAddTextView,
      @NonNull LinearLayout eventDayLayout, @NonNull TextView eventDayTextView,
      @NonNull EditText eventDescEditText, @NonNull LinearLayout eventDescLayout,
      @NonNull TextView eventDescTextView, @NonNull EditText eventNameEditText,
      @NonNull LinearLayout eventNameLayout, @NonNull TextView eventNameTextView,
      @NonNull LinearLayout eventTimeLayout, @NonNull TextView eventTimeTextView,
      @NonNull TextView eventtoTimeTextView, @NonNull TextView invHeadTextView,
      @NonNull Spinner monthSpinner, @NonNull Button okButton, @NonNull Spinner starttimeSpinner,
      @NonNull Spinner yearSpinner) {
    this.rootView = rootView;
    this.daySpinner = daySpinner;
    this.endtimeSpinner = endtimeSpinner;
    this.eventAddEditText = eventAddEditText;
    this.eventAddLayout = eventAddLayout;
    this.eventAddTextView = eventAddTextView;
    this.eventDayLayout = eventDayLayout;
    this.eventDayTextView = eventDayTextView;
    this.eventDescEditText = eventDescEditText;
    this.eventDescLayout = eventDescLayout;
    this.eventDescTextView = eventDescTextView;
    this.eventNameEditText = eventNameEditText;
    this.eventNameLayout = eventNameLayout;
    this.eventNameTextView = eventNameTextView;
    this.eventTimeLayout = eventTimeLayout;
    this.eventTimeTextView = eventTimeTextView;
    this.eventtoTimeTextView = eventtoTimeTextView;
    this.invHeadTextView = invHeadTextView;
    this.monthSpinner = monthSpinner;
    this.okButton = okButton;
    this.starttimeSpinner = starttimeSpinner;
    this.yearSpinner = yearSpinner;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentInviteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentInviteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_invite, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentInviteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.daySpinner;
      Spinner daySpinner = ViewBindings.findChildViewById(rootView, id);
      if (daySpinner == null) {
        break missingId;
      }

      id = R.id.endtimeSpinner;
      Spinner endtimeSpinner = ViewBindings.findChildViewById(rootView, id);
      if (endtimeSpinner == null) {
        break missingId;
      }

      id = R.id.eventAddEditText;
      EditText eventAddEditText = ViewBindings.findChildViewById(rootView, id);
      if (eventAddEditText == null) {
        break missingId;
      }

      id = R.id.eventAddLayout;
      LinearLayout eventAddLayout = ViewBindings.findChildViewById(rootView, id);
      if (eventAddLayout == null) {
        break missingId;
      }

      id = R.id.eventAddTextView;
      TextView eventAddTextView = ViewBindings.findChildViewById(rootView, id);
      if (eventAddTextView == null) {
        break missingId;
      }

      id = R.id.eventDayLayout;
      LinearLayout eventDayLayout = ViewBindings.findChildViewById(rootView, id);
      if (eventDayLayout == null) {
        break missingId;
      }

      id = R.id.eventDayTextView;
      TextView eventDayTextView = ViewBindings.findChildViewById(rootView, id);
      if (eventDayTextView == null) {
        break missingId;
      }

      id = R.id.eventDescEditText;
      EditText eventDescEditText = ViewBindings.findChildViewById(rootView, id);
      if (eventDescEditText == null) {
        break missingId;
      }

      id = R.id.eventDescLayout;
      LinearLayout eventDescLayout = ViewBindings.findChildViewById(rootView, id);
      if (eventDescLayout == null) {
        break missingId;
      }

      id = R.id.eventDescTextView;
      TextView eventDescTextView = ViewBindings.findChildViewById(rootView, id);
      if (eventDescTextView == null) {
        break missingId;
      }

      id = R.id.eventNameEditText;
      EditText eventNameEditText = ViewBindings.findChildViewById(rootView, id);
      if (eventNameEditText == null) {
        break missingId;
      }

      id = R.id.eventNameLayout;
      LinearLayout eventNameLayout = ViewBindings.findChildViewById(rootView, id);
      if (eventNameLayout == null) {
        break missingId;
      }

      id = R.id.eventNameTextView;
      TextView eventNameTextView = ViewBindings.findChildViewById(rootView, id);
      if (eventNameTextView == null) {
        break missingId;
      }

      id = R.id.eventTimeLayout;
      LinearLayout eventTimeLayout = ViewBindings.findChildViewById(rootView, id);
      if (eventTimeLayout == null) {
        break missingId;
      }

      id = R.id.eventTimeTextView;
      TextView eventTimeTextView = ViewBindings.findChildViewById(rootView, id);
      if (eventTimeTextView == null) {
        break missingId;
      }

      id = R.id.eventtoTimeTextView;
      TextView eventtoTimeTextView = ViewBindings.findChildViewById(rootView, id);
      if (eventtoTimeTextView == null) {
        break missingId;
      }

      id = R.id.invHeadTextView;
      TextView invHeadTextView = ViewBindings.findChildViewById(rootView, id);
      if (invHeadTextView == null) {
        break missingId;
      }

      id = R.id.monthSpinner;
      Spinner monthSpinner = ViewBindings.findChildViewById(rootView, id);
      if (monthSpinner == null) {
        break missingId;
      }

      id = R.id.okButton;
      Button okButton = ViewBindings.findChildViewById(rootView, id);
      if (okButton == null) {
        break missingId;
      }

      id = R.id.starttimeSpinner;
      Spinner starttimeSpinner = ViewBindings.findChildViewById(rootView, id);
      if (starttimeSpinner == null) {
        break missingId;
      }

      id = R.id.yearSpinner;
      Spinner yearSpinner = ViewBindings.findChildViewById(rootView, id);
      if (yearSpinner == null) {
        break missingId;
      }

      return new FragmentInviteBinding((ConstraintLayout) rootView, daySpinner, endtimeSpinner,
          eventAddEditText, eventAddLayout, eventAddTextView, eventDayLayout, eventDayTextView,
          eventDescEditText, eventDescLayout, eventDescTextView, eventNameEditText, eventNameLayout,
          eventNameTextView, eventTimeLayout, eventTimeTextView, eventtoTimeTextView,
          invHeadTextView, monthSpinner, okButton, starttimeSpinner, yearSpinner);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}