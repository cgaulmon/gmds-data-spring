package cdg.hscc.gmds.data.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "units")
@Entity
public class Unit {

	@Id
	private Long id;
	private String name;
	private int qty;
	private String status;
	private String type;
	private long unitId;
	
}
