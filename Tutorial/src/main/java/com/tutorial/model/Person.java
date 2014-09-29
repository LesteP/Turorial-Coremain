package com.tutorial.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
/*Escribimos una anotacion @Entity para que la tabla se relacione con el objeto*/
public class Person extends BaseObject{
	private long id;
	private String firstName;
	private String lastName;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public long getId(){
		return this.id;
	}
	
	@Column(name="first_name", length=50)
	public String getFirstName(){
		return this.firstName;
	}
	
	@Column(name="last_name", length=50)
	public String getLastName(){
		return this.lastName;
	}
	/*Estos parametros se ha creado al añadir los metodos que esscribi mas arriba*/
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
