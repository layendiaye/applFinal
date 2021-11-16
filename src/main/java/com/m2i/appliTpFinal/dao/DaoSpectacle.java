package com.m2i.appliTpFinal.dao;

import org.springframework.data.repository.CrudRepository;

import com.m2i.appliTpFinal.entity.Spectacle;

public interface DaoSpectacle extends CrudRepository<Spectacle, Long> {

	// avec la methode prédefine(CrudRepository) findById() , findAll() , save() ,
	// deleteById() , ...sont deja prédefinie
	// comme méthode prédéfinie héritées et on a plus besoin de creer un class impl
	// pour implementer le dao
	// les nvlles implementation sont fait par nameQuery dans la class Category.

	// public List<Spectacle> findSpectacleByCategory(Category categoryId); à
	// activer si besoin

	// public List<Spectacle> findSpectacleByCriteria(Date date, Long id);à activer
	// si besoin

}
