package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import kodlamaio.northwind.entities.abstracts.User;

@Entity
@Table(name = "employer")
public class Employer extends User {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "company_name")
	private String company_name;
	
	@Column(name = "website")
	private String website;
	
	@Column(name = "phone_number")
	private int phone_number;

}
