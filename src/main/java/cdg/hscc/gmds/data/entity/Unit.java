package cdg.hscc.gmds.data.entity;

import javax.persistence.Column;
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
	@Column(name = "icon_link")
	private String iconLink;
	private int qty;
	private String status;
	@Column(name="unit_type")
	private String unitType;
	@Column(name = "unit_id")
	private Integer unitId;
	
}
