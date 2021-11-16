package com.m2i.appliTpFinal.service;

import com.m2i.appliTpFinal.entity.Category;

public interface ServiceCategory {
	public void saveOrUpdateCategory(Category cat);
	
	public void removeCategory(Long id);
	public Category ajouterCategory();
	//public List<Spectacle> ajouterSpectacle(Spectacle spe, Category cat);


}
