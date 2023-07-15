package com.ServerSep3.Server.Repository;

import com.ServerSep3.Server.Model.SaveModel;
import com.ServerSep3.Server.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaveRepository extends JpaRepository<SaveModel,Long> {
    SaveModel findById(int id);
    SaveModel findByUserId(int id);
}
