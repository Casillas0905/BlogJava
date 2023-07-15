package com.ServerSep3.Server.Repository;

import com.ServerSep3.Server.Model.CategoryModel;
import com.ServerSep3.Server.Model.UserModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryModel,Long> {
    CategoryModel findById(int id);
}
