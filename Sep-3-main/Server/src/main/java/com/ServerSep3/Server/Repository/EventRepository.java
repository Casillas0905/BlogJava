package com.ServerSep3.Server.Repository;

import com.ServerSep3.Server.Model.EventModel;
import com.ServerSep3.Server.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<EventModel,Long> {
    EventModel findById(int id);
}
