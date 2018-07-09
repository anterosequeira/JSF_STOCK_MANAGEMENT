package io.altar.jseproject.control;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;

import io.altar.jseproject.model.Shelf;
import io.altar.jseproject.repositories.EntityRepository;
import io.altar.jseproject.repositories.ShelfRepository;

@RequestScoped
public class controlShelf {

	 EntityRepository<Shelf> DbShelf = ShelfRepository.getInstance();

	public  void createShelf(Shelf s){


		DbShelf.addEntity(s);		
	}

	public  Collection<Shelf> getShelfs(){

		return DbShelf.getEntity();
	}

	public  void removeShelf(Shelf s){

		DbShelf.removeEntity(s);
	}
}
