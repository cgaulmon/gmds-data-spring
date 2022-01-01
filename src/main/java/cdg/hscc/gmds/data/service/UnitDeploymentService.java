package cdg.hscc.gmds.data.service;

public interface UnitDeploymentService {

	public void deploy(int unitId, int countryId, int qty);
	void transfer(int unitId, int fromCountryId, int toCountryId, int qty);
	void returnToReserve(int unitId, int countryId, int qty);
}
