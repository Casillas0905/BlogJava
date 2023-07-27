package com.ServerSep3.Server.Repository;

import com.ServerSep3.Server.Model.CommentModel;
import com.ServerSep3.Server.Model.LocationModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<LocationModel,Long> {
    LocationModel findById(int id);
}
