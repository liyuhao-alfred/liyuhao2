package com.liyuhao.service;

import java.util.List;

import com.liyuhao.entity.Admin;

public interface adminService {

	Admin login(String name, String password);

	Admin save_update(Admin admin);

	void delete(Admin admin);

	List<Admin> findAll();

}
