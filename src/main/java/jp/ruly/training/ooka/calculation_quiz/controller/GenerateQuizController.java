package jp.ruly.training.ooka.calculation_quiz.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jp.ruly.training.ooka.calculation_quiz.constant.CalcMode;
import jp.ruly.training.ooka.calculation_quiz.dto.QuizDTO;
import jp.ruly.training.ooka.calculation_quiz.form.QuizForm;
import jp.ruly.training.ooka.calculation_quiz.service.QuizService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class GenerateQuizController {
	private final QuizService quizService;

	@GetMapping("/init")
	public String init(Model model) {
		model.addAttribute("modes", CalcMode.values());
		return "index";
	}

	@PostMapping("/generate-questions")
	public String generate(Model model, @RequestParam CalcMode mode, @RequestParam int count) {
//		CalcMode calcMode = CalcMode.fromValue(mode);
		List<QuizDTO> quizzes = quizService.generateQuiz(mode, count);
		QuizForm quizForm = new QuizForm(mode, quizzes);

		model.addAttribute("mode", mode);
		model.addAttribute("quizForm", quizForm);

		return "quiz";
	}
}
