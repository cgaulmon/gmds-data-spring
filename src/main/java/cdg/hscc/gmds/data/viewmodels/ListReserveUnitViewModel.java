package cdg.hscc.gmds.data.viewmodels;

import cdg.hscc.gmds.data.dto.UnitDto;
import lombok.Data;

@Data
public class ListReserveUnitViewModel {

	private Long id;
	private String name;
	private String status;
	private String type;
	private Integer qty;
	private String graphic;
	
	public ListReserveUnitViewModel() {
		
	}
	
	public ListReserveUnitViewModel(UnitDto unit) {
		this.id = unit.getId();
		this.name = unit.getName();
		this.status = unit.getStatus();
		this.type = unit.getType();
		this.qty = unit.getQty();
		this.graphic = unit.getGraphic();
	}
}
