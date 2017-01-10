/**
 * 
 */
/**
 * @author ������
 *
 */
package com.liyuhao.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.liyuhao.entity.Admin;
import com.liyuhao.service.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class addAdmin {

	@Autowired
	private adminService adminService;

	@Test
	public void addAdmin() {
		Admin admin = new Admin();
		admin.setName("18814120000743");
		admin.setPassword("18810000...0003");

		admin = adminService.save_update(admin);
		if (admin == null) {
			System.out.println(admin);
		} else {
			System.out.println(admin);
		}
	}

}