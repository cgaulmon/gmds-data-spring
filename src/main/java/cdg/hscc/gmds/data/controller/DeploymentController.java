package cdg.hscc.gmds.data.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cdg.hscc.gmds.data.service.DeploymentService;

@RestController
@RequestMapping("/deployments")
public class DeploymentController {

	private DeploymentService deploymentService;

	public DeploymentController(DeploymentService deploymentService) {
		super();
		this.deploymentService = deploymentService;
	}
	
	
}
