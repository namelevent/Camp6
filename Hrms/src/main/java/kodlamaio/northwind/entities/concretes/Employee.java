package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import kodlamaio.northwind.entities.abstracts.User;

@Entity
@Table(name = "employee")
public class Employee extends User {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "first_name")
	private String first_name;
	
	@Column(name = "last_name")
	private String last_name;
	
	@Column(name = "identity_number")
	private int identity_number;
	
	@Column(name = "year_of_birth")
	private int year_of_birth;

}
