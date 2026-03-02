package jp.ruly.training.ooka.calculation_quiz.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GenerateQuizController {
	@GetMapping("/init")
	public String init() {
		return "index.html";
	}

	@PostMapping("/generate-questions")
	public String generate(@RequestParam("operator") int operator, @RequestParam("count") int count) {
		return "index.html";
	}
}
