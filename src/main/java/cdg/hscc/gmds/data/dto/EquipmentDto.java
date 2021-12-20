package cdg.hscc.gmds.data.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class EquipmentDto extends UnitDto {
	
	private Long id;
	private String name;
	private int qty;
	private String status;
	private String type;
	private long unitId;
}
