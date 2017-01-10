/**
 * @author ������
 *
 */
package com.liyuhao.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.liyuhao.dao.adminDao;
import com.liyuhao.entity.Admin;

@Repository("adminDao")
public class adminDaoImpl extends HibernateDaoSupport implements adminDao {

	@Resource(name = "sessionFactory")
	public void setSessionFacotry(SessionFactory sessionFacotry) {
		super.setSessionFactory(sessionFacotry);
	}

	public Admin save(Admin admin) {
		getHibernateTemplate().save(admin);
		return admin;
	}

	public void delete(Admin admin) {
		getHibernateTemplate().delete(admin);
	}

	public Admin findById(Integer id) {
		return (Admin) getHibernateTemplate().get("bean.Admin", id);
	}

	public List findByName(String name) {
		String queryString = "from Admin as model where model.name = ?";
		return getHibernateTemplate().find(queryString, name);
	}

	public List findAll() {
		String queryString = "from Admin";
		return getHibernateTemplate().find(queryString);
	}

	public Admin merge(Admin detachedInstance) {
		return (Admin) getHibernateTemplate().merge(detachedInstance);
	}

}