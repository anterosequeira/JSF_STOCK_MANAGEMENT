package io.altar.jseproject.model;



public class Shelf extends Entity{
	
	private int capacity;
	private Product productAlb;
	private float PPD;
	
	
	
	public void setCapacity(int capacity){
		this.capacity = capacity;
	}	
	public int getCapacity(){
		return capacity;
	}	
	public void setProductAlb(Product productAlb){
		this.productAlb = productAlb;
	}	
	public Product getProductAlb(){
		return productAlb;
	}	
	public void setPPD(float PPD){
		this.PPD = PPD;
	}	
	public float getPPD(){
		return PPD;
	}	
	
	
//	public String toString(){
//		if (this.productAlb!= null){
//			return "ID:" + this.getID() + ", "+ "Capacidade: " +
//				this.capacity + ", " + "Produto que alberga: " + this.productAlb.getID() + ", " +
//				"Preco de aluguer de localizacao (diario): " + this.PPD;
//		}
//		else{
//			
//			return "ID:" + this.getID() + ", "+ "Capacidade: " +
//					this.capacity + ", " + "Nao alberga nenhum produto: "+ ", " +
//					"Preco de aluguer de localizacao (diario): " + this.PPD;
//		}		
//	}
}
