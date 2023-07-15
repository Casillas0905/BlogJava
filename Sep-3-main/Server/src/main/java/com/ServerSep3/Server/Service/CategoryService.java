package com.ServerSep3.Server.Service;

import com.ServerSep3.Server.Model.CategoryModel;
import com.ServerSep3.Server.Model.PostModel;

public interface CategoryService {
    CategoryModel findById(int id);
}
