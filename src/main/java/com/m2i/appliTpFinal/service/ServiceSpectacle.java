package com.m2i.appliTpFinal.service;

import java.util.Date;
import java.util.List;

import com.m2i.appliTpFinal.entity.Category;
import com.m2i.appliTpFinal.entity.Spectacle;

public interface ServiceSpectacle {
	public void saveOrUpdateSpectacle(Spectacle sple);
	public List<Spectacle> findSpectacleByCategory(Category categoryId);
	public List<Spectacle> findSpectacleByCriteria(Date date, Long id);
	public Spectacle findSpectacleById(Long id);
	
	public void removeSpectacle(Long id);
	public List<Spectacle> rechercherTousLesSpectacles();
	public Spectacle addSpectacleCat(Spectacle sple, Long idCat);	
	public List<Category> allCategory();
	
}
