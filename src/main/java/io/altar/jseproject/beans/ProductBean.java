package io.altar.jseproject.beans;



import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import io.altar.jseproject.model.Product;

@Named("Product")
@RequestScoped

public class ProductBean   {
	

	
	private Product p;

	public Product getP() {
		return p;
	}

	public void setP(Product p) {
		this.p = p;
	}

}
