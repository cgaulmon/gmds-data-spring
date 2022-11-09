package cdg.hscc.gmds.data.controller;

import static org.springframework.http.ResponseEntity.ok;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cdg.hscc.gmds.data.dto.UserDto;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody UserDto user) {
		Map<String, String> authMap = new HashMap<>();
		authMap.put("username", user.getUserName());
		return ok(authMap);
	}
	
	@PostMapping("/logout")
	public String logout() {
		return "Logout successful!";
	}
}
