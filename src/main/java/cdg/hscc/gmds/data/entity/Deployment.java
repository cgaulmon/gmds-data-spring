package cdg.hscc.gmds.data.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Table(name="deployments")
@Entity
@Data
public class Deployment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "user_id")
	private Integer userId;
	@Column(name = "country_id")
	private Integer countryId;
	@Column(name = "unit_id")
	private Integer unitId;
	@Column(name = "unit_qty")
	private int unitQty;
	@Column(name = "load_date")
	@Temporal(TemporalType.DATE)
	private Date loadDate;
	@Column(name = "load_dtm")
	@Temporal(TemporalType.TIMESTAMP)
	private Date loadDtm;
}
