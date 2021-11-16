package com.m2i.appliTpFinal.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.m2i.appliTpFinal.AppliTpFinal;
import com.m2i.appliTpFinal.entity.Category;
import com.m2i.appliTpFinal.entity.Spectacle;
import com.m2i.appliTpFinal.service.ServiceCategory;
import com.m2i.appliTpFinal.service.ServiceSpectacle;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { AppliTpFinal.class })

public class TestServiceSpectacle {

	@Autowired
	private ServiceSpectacle serviceSpectacle; // à tester
	@Autowired
	private ServiceCategory serviceCategory;

	@Test
	public void testAjoutSpectacle() {
		Spectacle sple = new Spectacle(null, "spectacle 1", "spectacle blabla", 250, 100.0, 25);
		this.serviceSpectacle.saveOrUpdateSpectacle(sple);
		Assert.assertTrue(sple.getTitle() != null);
		System.out.println("spectacle=" + sple.toString());

	}

	@Test
	public void testAjouterCatSpectacle() {

		Category cat = new Category(null, "Danse");
		serviceCategory.saveOrUpdateCategory(cat);

		Spectacle spe = new Spectacle(null, "spectacle bleu ", "zin zin 1", 90, 305.25, 2);
		serviceSpectacle.addSpectacleCat(spe, cat.getId());
		Assert.assertTrue(spe.getId() != null);

	}
}
