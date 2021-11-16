package com.m2i.appliTpFinal.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.m2i.appliTpFinal.dao.DaoCategory;
import com.m2i.appliTpFinal.dao.DaoSpectacle;
import com.m2i.appliTpFinal.entity.Category;
import com.m2i.appliTpFinal.entity.Spectacle;

@Service // héritant de @Component
@Transactional
public class ServiceSpectacleImpl implements ServiceSpectacle {

	@Autowired
	private DaoSpectacle daoSpectacle;
	@Autowired
	private DaoCategory daoCategory;

	@Override
	public void saveOrUpdateSpectacle(Spectacle sple) {
		daoSpectacle.save(sple);

	}

	@Override
	public List<Spectacle> findSpectacleByCategory(Category categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Spectacle> findSpectacleByCriteria(Date date, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeSpectacle(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Spectacle findSpectacleById(Long id) {

		return daoSpectacle.findById(id).get();
	}

	@Override
	public List<Spectacle> rechercherTousLesSpectacles() {

		return (List<Spectacle>) daoSpectacle.findAll();
	}

	@Override
	public Spectacle addSpectacleCat(Spectacle sple, Long idCat) {
		Category cat = daoCategory.findById(idCat).get();
		sple.setCategory(cat);
		daoSpectacle.save(sple);
		return sple;
	}

	public void RemoveSpectacle(Spectacle sple) {
		daoSpectacle.delete(sple);
	}

	@Override
	public List<Category> allCategory() {
		return (List<Category>) daoCategory.findAll();
	}

}
