package io.altar.jseproject.model;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


public class Product extends Entity {
	
	//private List<Shelf> list ;
	private int VUD;
	private int IVA;
	private float PVP;
	
	ArrayList<Shelf> list = new ArrayList<Shelf>();
	
//	public void setList(Shelf list){
//		this.list = list;
//	}	
//	public Shelf getList(){
//		return list;
//	}	
	public void setVUD(int VUD){
		this.VUD = VUD;
	}	

	public ArrayList<Shelf> getList() {
		return list;
	}
	public void setList(ArrayList<Shelf> list) {
		this.list = list;
	}

	
//	public void addList(Shelf s){
//		this.list.add(s);
//	}
	public int getVUD(){
		return VUD;
	}
	public void setIVA(int IVA){
		this.IVA = IVA;
	}
	public int getIVA(){
		return IVA;
	}
	public void setPVP(float PVP){
		this.PVP = PVP;
	}
	public float getPVP(){
		return PVP;
	}
	
	
	public String toString(){
		String tmp = "";
		for (Shelf s : this.list){
			tmp += s.getID().toString() + ";";
		}
		
		if(!this.list.isEmpty()){
			return "ID:" + this.getID() + ", "+ "Lista de prateleiras onde estao exposto: " +
				tmp + ", " + "Valor unitario de desconto: " + this.VUD + ", " +
				"IVA: " + this.IVA + ", "+ "PVP: " + this.PVP;
		}
		else{
			return "ID:" + this.getID() + ", "+ "Nao esta exposto em nenhuma parteleira " 
					 + ", " + "Valor unitario de desconto: " + this.VUD + ", " +
					"IVA: " + this.IVA + ", "+ "PVP: " + this.PVP;
		}		
	}
	
}
