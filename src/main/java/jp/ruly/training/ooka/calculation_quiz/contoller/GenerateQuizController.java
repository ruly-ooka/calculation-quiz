package jp.ruly.training.ooka.calculation_quiz.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GenerateQuizController {
	
	@PostMapping("/generate-questions")
	public String generate(@RequestParam("operator") int operator, @RequestParam("count") int count) {
		return "index.html";
	}
}
