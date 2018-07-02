package io.altar.jseproject.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import io.altar.jseproject.model.Shelf;

@Named("Shelf")
@RequestScoped
public class ShelfBean 
{
	private Shelf s;
	
	public Shelf getS() {
		return s;
	}

	public void setS(Shelf s) {
		this.s = s;
	}

	
	
	

}
