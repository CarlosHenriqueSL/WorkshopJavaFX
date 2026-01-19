package com.example.course.model.dao;

import com.example.course.db.DB;
import com.example.course.model.dao.impl.DepartmentDaoJDBC;
import com.example.course.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDaoJDBC createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}