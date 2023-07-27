package com.ServerSep3.Server.Service.Impl;

import com.ServerSep3.Server.Model.CategoryModel;
import com.ServerSep3.Server.Model.PostModel;
import com.ServerSep3.Server.Repository.CategoryRepository;
import com.ServerSep3.Server.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository repository;

    @Override
    public CategoryModel findById(int id) {
        return repository.findById(id);
    }

    @Override
    public List<CategoryModel> findAll() {
        return repository.findAll();
    }
}
