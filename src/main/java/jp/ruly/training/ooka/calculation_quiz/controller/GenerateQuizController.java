package jp.ruly.training.ooka.calculation_quiz.controller;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jp.ruly.training.ooka.calculation_quiz.constant.CalcMode;
import jp.ruly.training.ooka.calculation_quiz.dto.QuizDTO;
import jp.ruly.training.ooka.calculation_quiz.service.QuizService;

@Controller
public class GenerateQuizController {

	private final Map<CalcMode, QuizService> serviceMap;

	public GenerateQuizController(List<QuizService> services) {
		this.serviceMap = services.stream().collect(Collectors.toMap(QuizService::getMode, x -> x));
	}

	@GetMapping("/init")
	public String init() {
		return "index";
	}

	@PostMapping("/generate-questions")
	public String generate(Model model, @RequestParam int mode, @RequestParam int count) {
		CalcMode calcMode = CalcMode.fromValue(mode);
		QuizService service = serviceMap.get(calcMode);
		List<QuizDTO> quizzes = service.generateQuiz(count);

		model.addAttribute("mode", calcMode);
		model.addAttribute("quizzes", quizzes);

		return "quiz";
	}
}
