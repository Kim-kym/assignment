package himedia.assignment.questions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
 * Caution!: 이 파일은 변경하지 마십시오
 */
@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "home";
	}

}
