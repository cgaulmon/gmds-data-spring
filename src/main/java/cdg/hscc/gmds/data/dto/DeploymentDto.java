package cdg.hscc.gmds.data.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class DeploymentDto {

	private Long id;
	private Integer countryId;
	private Integer unitId;
	private int unitQty;
}
