package com.m2i.appliTpFinal.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.m2i.appliTpFinal.AppliTpFinal;
import com.m2i.appliTpFinal.entity.Category;
import com.m2i.appliTpFinal.service.ServiceCategory;
@RunWith(SpringRunner.class)
@SpringBootTest(classes= {AppliTpFinal.class})
public class TestServiceCategory {
	@Autowired
	private ServiceCategory serviceCategory;
	
	@Test
	public void testAjoutCategory() {
		Category cat = new Category(null, "Thêatre");
		this.serviceCategory.saveOrUpdateCategory(cat);
		Assert.assertTrue(cat.getTitle()!=null);
		System.out.println("category="+cat.toString());
	
	}
	

}
