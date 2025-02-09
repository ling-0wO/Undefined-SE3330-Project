package com.Dao;

import com.Entity.Event;
import com.Entity.Message;

import java.util.List;

public interface MessageDao {

    public void AddMessage(Message message);

    public List<Message> GetMessages(Integer event);

    public void UpdateMessage(String mes, Integer id);

    public Message GetMessage(Integer id);

    public void DeleteMessage(Integer id);
}
