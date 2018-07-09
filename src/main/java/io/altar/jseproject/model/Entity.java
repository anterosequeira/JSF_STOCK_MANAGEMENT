package io.altar.jseproject.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Entity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	protected Long ID;

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}
	
	@Override
    public boolean equals(Object other) {
        return (other instanceof Entity) && (ID != null)
            ? ID.equals(((Entity) other).ID)
            : (other == this);
    }

    @Override
    public int hashCode() {
        return (ID != null)
            ? (this.getClass().hashCode() + ID.hashCode())
            : super.hashCode();
    }

    @Override
    public String toString() {
        return String.format("ExampleEntity[%d]", ID);
    }
	
}
