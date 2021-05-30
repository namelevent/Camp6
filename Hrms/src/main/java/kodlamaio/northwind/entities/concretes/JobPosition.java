package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "job_position")
public class JobPosition {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "position_name")
	private String position_name;

}
