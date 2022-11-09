package cdg.hscc.gmds.data.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cdg.hscc.gmds.data.dto.DeploymentDto;
import cdg.hscc.gmds.data.service.DeploymentService;

@RestController
@RequestMapping("/api/deployments")
public class DeploymentController {

	private DeploymentService deploymentService;

	public DeploymentController(DeploymentService deploymentService) {
		super();
		this.deploymentService = deploymentService;
	}
	
	@PostMapping
	public ResponseEntity<?> deploy(@RequestBody DeploymentDto deployment) {
		deploymentService.deploy(deployment);
		return new ResponseEntity<>(deployment, HttpStatus.CREATED);
	}
	
}
