package cdg.hscc.gmds.data.entity;

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
	private int countryId;
	private String name;
	private String mapLink;
	private String status;
}
