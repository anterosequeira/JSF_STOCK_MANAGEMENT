package io.altar.jseproject.beans;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.jseproject.control.controlProduct;
import io.altar.jseproject.control.controlShelf;
import io.altar.jseproject.model.Product;
import io.altar.jseproject.model.Shelf;

@Named("shelfBean")
@RequestScoped
public class ShelfBean 
{
	@Inject
	private controlShelf cs;
	public controlShelf getCs() {
		return cs;
	}

	public void setCs(controlShelf cs) {
		this.cs = cs;
	}

	private Shelf s = new Shelf();
	
	
	public Shelf getS() {
		return s;
	}

	public void setS(Shelf s) {
		this.s = s;
	}
	
	public String createShelf(Shelf s){

		controlShelf.createShelf(s);
		return "index";
	}
	
public Collection<Shelf> getShelfs(){
		
		return controlShelf.getShelfs();
}
	
	
		
	
	public void removeShelf(Shelf s){

		controlShelf.removeShelf(s);
	
	}

	
	
	

}
