package cdg.hscc.gmds.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.Immutable;

import lombok.Data;

@Entity
@Immutable
@Table(name = "V_COUNTRY_DEPLOYMENTS")
@Data
public class VCountryDeployments {
	
	@Id
	private Long id;
	@Column(name = "country_id")
	private Long countryId;
	private String name;
	@Column(name = "map_link")
	private String mapLink;
	@Column(name = "num_of_deployments")
	private Long numOfDeployments;
	@Column(name = "total_qty")
	private Long totalQty;
	@Column(name = "status")
	private String status;

}
