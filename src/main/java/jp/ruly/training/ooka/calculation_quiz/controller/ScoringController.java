package jp.ruly.training.ooka.calculation_quiz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import jp.ruly.training.ooka.calculation_quiz.form.QuizForm;

@Controller
public class ScoringController {
	@PostMapping("/scoring")
	public String scoring(Model model, QuizForm quizForm) {
		return null;
	}

}
