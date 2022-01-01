package cdg.hscc.gmds.data.dto;

import lombok.Data;

@Data
public class ListReserveUnitsDto {

	private Long id;
	private String name;
	private String status;
	private String type;
	private Integer qty;
	private String iconLink;
	
	public ListReserveUnitsDto() {
		
	}
	
	public ListReserveUnitsDto(UnitDto unit) {
		this.id = unit.getId();
		this.name = unit.getName();
		this.status = unit.getStatus();
		this.type = unit.getUnitType();
		this.qty = unit.getQty();
		this.iconLink = unit.getIconLink();
	}
}
