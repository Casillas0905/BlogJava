package com.ServerSep3.Server.Repository;

import com.ServerSep3.Server.Model.UserModel;
import com.ServerSep3.Server.Model.UsersInEvents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersInEventRepository extends JpaRepository<UsersInEvents,Long> {
    UsersInEvents findById(int id);
    List<UserModel> findByEventId(int id);
}
