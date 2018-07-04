package io.altar.jseproject.beans;



import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import io.altar.jseproject.control.controlProduct;
import io.altar.jseproject.model.Product;

@Named("productBean")
@RequestScoped

public class ProductBean   {
	
	@Inject
	private controlProduct cp;
	
	private Product p= new Product();
	
	public controlProduct getCp() {
		return cp;
	}

	public void setCp(controlProduct cp) {
		this.cp = cp;
	}


	public Product getP() {
		return p;
	}

	public void setP(Product p) {
		this.p = p;
	}
	
	
	public String createProduct(Product p){

		controlProduct.createProduct(p);
		return "index";
	}
	
	public Collection<Product> getProducts(){
		
		return controlProduct.getProducts();
	
	}
	
	public String editProduct(Product p){
		
		controlProduct.editProduct(p);
		
		return "index";
		
	}
	
	public void removeProduct(Product p){

		controlProduct.removeProduct(p);
	
	}
	
	

}
