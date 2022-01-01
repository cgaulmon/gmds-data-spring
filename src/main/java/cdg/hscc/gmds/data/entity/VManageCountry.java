package cdg.hscc.gmds.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "V_MANAGE_COUNTRIES")
@Data
public class VManageCountry {

	@Id
	private Long id;
	@Column(name = "country_id")
	private int countryId;
	@Column(name = "map_link")
	private String mapLink;
	private String name;
	private String status;
	@Column(name = "deploy_count")
	private Long deployCount;

}
