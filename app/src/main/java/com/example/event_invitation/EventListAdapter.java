package com.example.event_invitation;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;


public class EventListAdapter extends ListAdapter<Event, EventViewHolder> {

    public EventListAdapter(@NonNull DiffUtil.ItemCallback<Event> diffCallback) {
        super(diffCallback);
    }

    @Override
    public EventViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return EventViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(EventViewHolder holder, int position) {
        Event current = getItem(position);
        holder.setEvent(current);
        String bindText = "Event name: " + current.getEventName() + "\n" + "Date: " + current.getYear() + "-"
                + current.getMonth()+"-" + current.getDay()+ "\n"
                + "Time: " + current.getStart()+"-" + current.getEnd() + "\n" + "Description: " + current.getEventDescript();
        holder.bind(bindText);
    }

    static class EventDiff extends DiffUtil.ItemCallback<Event> {

        @Override
        public boolean areItemsTheSame(@NonNull Event oldItem, @NonNull Event newItem) {
            return oldItem == newItem;
        }

        @Override
        public boolean areContentsTheSame(@NonNull Event oldItem, @NonNull Event newItem) {
            return oldItem.getEventId() == (newItem.getEventId());
        }
    }
}