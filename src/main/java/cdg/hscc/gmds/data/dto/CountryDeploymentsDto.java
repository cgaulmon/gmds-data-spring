package cdg.hscc.gmds.data.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CountryDeploymentsDto {

	private int countryId;
	private String name;
	private String mapLink;
	private long numOfDeployments;
	private long totalQty;
	
	
}
