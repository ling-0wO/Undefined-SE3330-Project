package com.Repository;
import com.Entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;


public interface MessageRepository extends JpaRepository<Message, Integer>
{
    @Query(value = "from Message where user = :user and event = :event")
    List<Message> findByUserAndEvent(@Param("user") Integer user, @Param("event") Integer event);
}
