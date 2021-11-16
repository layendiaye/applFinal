package com.m2i.appliTpFinal.dao;

import org.springframework.data.repository.CrudRepository;

import com.m2i.appliTpFinal.entity.Category;

public interface DaoCategory extends CrudRepository<Category, Long> {
	
	
}
