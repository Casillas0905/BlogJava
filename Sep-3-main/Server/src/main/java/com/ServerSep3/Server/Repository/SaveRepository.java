package com.ServerSep3.Server.Repository;

import com.ServerSep3.Server.Model.SaveModel;
import com.ServerSep3.Server.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaveRepository extends JpaRepository<SaveModel,Long> {
    List<SaveModel> findByUserId(int id);
    void deleteById(int id);

}
