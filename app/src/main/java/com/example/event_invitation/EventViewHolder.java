package com.example.event_invitation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

class EventViewHolder extends RecyclerView.ViewHolder {
    private final TextView eventItemView;
    private Event currentEvent;

    private EventViewHolder(View itemView) {
        super(itemView);
        eventItemView = itemView.findViewById(R.id.textView);
        eventItemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Handle item click here
                if (currentEvent != null) {
                    Log.d("Debug eventholder", "layout id: "+ String.valueOf(currentEvent.getInviteLayout()));
                    // Access currentEvent and perform actions
                    switch (currentEvent.getInviteLayout()) {
                        case 1:
                            WelcomeFragmentDirections.ActionWelcomeFragmentToLayoutFragment action4 =
                                    WelcomeFragmentDirections.actionWelcomeFragmentToLayoutFragment(currentEvent.getEventName(),
                                            currentEvent.getEventDescript(), currentEvent.getEventAddr(),
                                            currentEvent.getYear(), currentEvent.getMonth(), currentEvent.getDay(),
                                            currentEvent.getStart(), currentEvent.getEnd(),
                                            currentEvent.getInvitePicture(), currentEvent.getInviteSong(),
                                            currentEvent.getInviteLayout());
                            Navigation.findNavController(v).navigate(action4);

                            break;
                        case 2:
                            WelcomeFragmentDirections.ActionWelcomeFragmentToLayoutOp2 action2 =
                                    WelcomeFragmentDirections.actionWelcomeFragmentToLayoutOp2(currentEvent.getEventName(),
                                            currentEvent.getEventDescript(), currentEvent.getEventAddr(),
                                            currentEvent.getYear(), currentEvent.getMonth(), currentEvent.getDay(),
                                            currentEvent.getStart(), currentEvent.getEnd(),
                                            currentEvent.getInvitePicture(), currentEvent.getInviteSong(),
                                            currentEvent.getInviteLayout());
                            Navigation.findNavController(v).navigate(action2);
                            break;
                        case 3:
                            WelcomeFragmentDirections.ActionWelcomeFragmentToLayoutOp3 action3 =
                                    WelcomeFragmentDirections.actionWelcomeFragmentToLayoutOp3(currentEvent.getEventName(),
                                            currentEvent.getEventDescript(), currentEvent.getEventAddr(),
                                            currentEvent.getYear(), currentEvent.getMonth(), currentEvent.getDay(),
                                            currentEvent.getStart(), currentEvent.getEnd(),
                                            currentEvent.getInvitePicture(), currentEvent.getInviteSong(),
                                            currentEvent.getInviteLayout());
                            Navigation.findNavController(v).navigate(action3);
                            break;
                        case 4:
                            WelcomeFragmentDirections.ActionWelcomeFragmentToLayoutOp1 action1 =
                                    WelcomeFragmentDirections.actionWelcomeFragmentToLayoutOp1(currentEvent.getEventName(),
                                            currentEvent.getEventDescript(), currentEvent.getEventAddr(),
                                            currentEvent.getYear(), currentEvent.getMonth(), currentEvent.getDay(),
                                            currentEvent.getStart(), currentEvent.getEnd(),
                                            currentEvent.getInvitePicture(), currentEvent.getInviteSong(),
                                            currentEvent.getInviteLayout());
                            Navigation.findNavController(v).navigate(action1);
                            break;
                        default:
                            break;

                    }
                }

            }
        });
    }
    public void setEvent(Event e) { currentEvent= e;}

    public void bind(String text) {
        eventItemView.setText(text);
    }

    static EventViewHolder create(ViewGroup parent) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);


        return new EventViewHolder(view);
    }
}