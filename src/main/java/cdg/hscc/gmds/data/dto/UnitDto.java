package cdg.hscc.gmds.data.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class UnitDto {

	private Long id;
	private String name;
	private Integer qty;
	private String status;
	private String unitType;
	private Integer unitId;
	private String iconLink;
	
}
