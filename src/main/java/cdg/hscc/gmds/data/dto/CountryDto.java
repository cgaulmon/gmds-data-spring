package cdg.hscc.gmds.data.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class CountryDto {

	private Long id;
	private Integer countryId;
	private String name;
	private String mapLink;
	private String status;
}
