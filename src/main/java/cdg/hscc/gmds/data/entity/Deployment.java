package cdg.hscc.gmds.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name="deployments")
@Entity
@Data
public class Deployment {

	@Id
	private Long id;
	@Column(name = "country_id")
	private Integer countryId;
	@Column(name = "unit_id")
	private Integer unitId;
	@Column(name = "unit_qty")
	private int unitQty;
}
