package com.example.event_invitation;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class WelcomeFragmentDirections {
  private WelcomeFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionWelcomeFragmentToInviteFragment() {
    return new ActionOnlyNavDirections(R.id.action_welcomeFragment_to_inviteFragment);
  }
}
