package cdg.hscc.gmds.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "countries")
@Entity
@Data
public class Country {

	@Id
	private Long id;
	@Column(name="country_id")
	private Integer countryId;
	private String name;
	@Column(name = "map_link")
	private String mapLink;
	private String status;
}
