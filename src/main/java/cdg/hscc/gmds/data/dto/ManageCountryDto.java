package cdg.hscc.gmds.data.dto;

import cdg.hscc.gmds.data.entity.VManageCountry;
import lombok.Data;

@Data
public class ManageCountryDto {

	private Long id;
	private Integer countryId;
	private String name;
	private String mapLink;
	private String status;
	private boolean hasDeployedUnits;

	public ManageCountryDto(VManageCountry vm) {
		this.id = vm.getId();
		this.countryId = vm.getCountryId();
		this.name = vm.getMapLink();
		this.status = vm.getStatus();
		this.mapLink = vm.getMapLink();
		this.hasDeployedUnits = (vm.getDeployCount() > 0);
	}
}
