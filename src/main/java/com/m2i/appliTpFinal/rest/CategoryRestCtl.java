/*package com.m2i.appliTpFinal.rest;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.m2i.appliTpFinal.entity.Category;
import com.m2i.appliTpFinal.entity.Spectacle;
import com.m2i.appliTpFinal.service.ServiceCategory;
import com.m2i.appliTpFinal.service.ServiceSpectacle;

public class CategoryRestCtl {
	@Autowired
	private ServiceCategory serviceCategory;
	@Autowired
	private ServiceSpectacle serviceSpectacle;
	
	//@Autowired
	private Spectacle sple;
	
	//@Autowired
	private Category cat;
	
	
	
	public void testAjoutSpectacleCategory() {
	 sple = new  Spectacle(null,"spectacle spécial ","le grand bal", 4, 150.0, 50);
	cat=new Category(5L, "Thêatre");
	Long idCat=cat.getId();
	serviceSpectacle.addSpectacle(sple, idCat);
	System.out.println("le Spectacle "+sple.getTitle()+" a été ajouté a la category "+cat.getTitle());
		}

}*/
