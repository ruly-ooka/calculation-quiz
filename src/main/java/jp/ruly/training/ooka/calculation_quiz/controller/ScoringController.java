package jp.ruly.training.ooka.calculation_quiz.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import jp.ruly.training.ooka.calculation_quiz.dto.QuizDTO;

@Controller
public class ScoringController {
	@PostMapping("/scoring")
	public String scoring(Model model, List<QuizDTO> quizzes) {
		return null;
	}

}
