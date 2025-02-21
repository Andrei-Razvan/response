package uk.lset.connResponse.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseController {

	@GetMapping("/response")
	public String response() {
		return "Connection ok";
	}
}
