package com.liyuhao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liyuhao.entity.Admin;
import com.liyuhao.service.adminService;
import com.liyuhao.dao.*;

@Service("adminService")
public class adminServiceImpl implements adminService {

	@Autowired
	private adminDao adminDao;

	public Admin login(String name, String password) {
		List list = (List) adminDao.findByName(name);
		if (list.size() == 0) {
			return null;
		} else {
			Admin admin = (Admin) list.get(0);
			if (admin.getPassword().equals(password)) {
				return admin;
			} else {
				return null;
			}
		}
	}

	public Admin save_update(Admin admin) {
		if (admin.getId() == null) {
			Admin db_admin = adminDao.save(admin);
			return db_admin;
		} else if (admin.getId().intValue() > 0) {
			Admin db_admin = adminDao.merge(admin);
			return db_admin;
		} else {
			return null;
		}
	}

	public void delete(Admin admin) {
		adminDao.delete(admin);
	}

	public List<Admin> findAll() {
		return adminDao.findAll();
	}

}
