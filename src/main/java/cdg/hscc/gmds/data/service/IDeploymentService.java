package cdg.hscc.gmds.data.service;

import java.util.List;

import cdg.hscc.gmds.data.dto.DeploymentDto;
import cdg.hscc.gmds.data.entity.Deployment;

public interface IDeploymentService {

	void deploy(DeploymentDto deployment);
	void transfer(int unitId, int fromCountryId, int toCountryId, int qty);
	void returnToReserve(int unitId,int countryId, int qty);
	List<DeploymentDto> findAllByUserId(int userId);
	DeploymentDto convertToDTO(Deployment deployment);
	Deployment convertToEntity(DeploymentDto deployment);
}
