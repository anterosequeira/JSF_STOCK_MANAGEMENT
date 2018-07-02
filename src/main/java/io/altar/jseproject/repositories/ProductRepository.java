package io.altar.jseproject.repositories;

import io.altar.jseproject.model.Entity;

public class ProductRepository extends EntityRepository<Entity> {
	
	private ProductRepository() {
		
		// TODO Auto-generated constructor stub
	}

	
	private static final ProductRepository INSTANCE = new ProductRepository() ;
	
	
	public static ProductRepository getInstance(){

		return INSTANCE;
	}	
}
