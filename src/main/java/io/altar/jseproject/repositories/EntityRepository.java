package io.altar.jseproject.repositories;

import java.util.HashMap;

import io.altar.jseproject.model.Entity;



public abstract class EntityRepository <T extends Entity> {

	
	HashMap<Long,T > map = new HashMap<>();
	
	private long maiorID = 1;


	public Long addEntity(T Entity) {
		try{
			map.put(maiorID, Entity);
			Entity.setID(maiorID);
			return maiorID++;
		}
		catch(IllegalArgumentException e){
			System.out.println("ID is null");
			return null;
		}
	}

	
	public void getEntity() {
		for( T Entity : map.values()) {
			System.out.println(Entity);
		}
	}

	public T getEntity(long ID) {
		try{
			T Entity = map.get(Long.valueOf(ID));
			return Entity;
		}
		catch(IllegalArgumentException e){
			System.out.println("ID is null");
			return null;
		}
	}

	
	public void editEntity(T Entity) {
		try{
			map.put(Entity.getID(), Entity);
		}
		catch(IllegalArgumentException e){
			System.out.println("ID is null");
		}
	}

	
	public void removeEntity(long ID) {
		map.remove(ID);
	}

}
