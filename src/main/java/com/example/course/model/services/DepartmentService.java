package com.example.course.model.services;

import java.util.List;

import com.example.course.model.dao.DaoFactory;
import com.example.course.model.dao.DepartmentDao;
import com.example.course.model.entities.Department;

public class DepartmentService {

    private DepartmentDao dao = DaoFactory.createDepartmentDao();

    public List<Department> findAll() {
        return dao.findAll();
    }
}
