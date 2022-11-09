package cdg.hscc.gmds.data.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.Immutable;

import lombok.Data;

@Immutable
@Table(name = "V_COUNTRY_DEPLOYMENT_DETAILS")
@Data
@Entity
public class VCountryDeploymentDetail {

	@Id
	private Long id;
	private Long countryId;
	private String countryStatus;
	private String countryName;
	private String mapLink;
	private Long unitId;
	private String iconLink;
	private String unitName;
	private String unitType;
	private Integer unitQty;
	private String unitStatus;
	private Integer deployedQty;
	private Date deploymentDate;
	
	
}
