package com.Dao;

import com.Entity.Event;
import com.Entity.Message;
import com.Entity.Tempevent;

import java.util.List;

public interface EventDao {

    public void AddEvent(Event event);

    public List<Event> GetEvents(Integer user);

    public Event GetEvent(Integer event);

    public void PauseEvent(Tempevent tempevent);

    public Tempevent ContinueEvent(Integer user);

    List<Event> RandEvent();
}
