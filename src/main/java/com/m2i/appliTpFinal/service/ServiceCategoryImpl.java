package com.m2i.appliTpFinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.m2i.appliTpFinal.dao.DaoCategory;
import com.m2i.appliTpFinal.entity.Category;

@Service
@Transactional
public class ServiceCategoryImpl implements ServiceCategory {

	@Autowired
	private DaoCategory daoCategory;

	/*
	 * getter setter pas la peine quand le autowired est sur l'attribut public
	 * DaoCategory getDaoCategory() { return daoCategory; }
	 * 
	 * public void setDaoCategory(DaoCategory daoCategory) { this.daoCategory =
	 * daoCategory; }
	 */
	@Override
	public void saveOrUpdateCategory(Category cat) {
		daoCategory.save(cat);
	}

	@Override
	public void removeCategory(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Category ajouterCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * @Override public List<Spectacle> ajouterSpectacle(Spectacle spe, Category
	 * cat) { return null; }
	 */

}
