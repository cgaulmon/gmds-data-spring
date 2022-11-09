package cdg.hscc.gmds.data.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CountryDeploymentsDto {

	private Long id;
	private Long countryId;
	private String name;
	private String mapLink;
	private Long numOfDeployments;
	private Long totalQty;
	
	
}
