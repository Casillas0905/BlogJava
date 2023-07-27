package com.ServerSep3.Server.Service;

import com.ServerSep3.Server.Model.CategoryModel;
import com.ServerSep3.Server.Model.PostModel;

import java.util.List;

public interface CategoryService {
    CategoryModel findById(int id);
    List<CategoryModel> findAll();
    void save(CategoryModel categoryModel);
}
