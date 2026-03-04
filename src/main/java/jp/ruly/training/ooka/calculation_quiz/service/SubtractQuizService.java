package jp.ruly.training.ooka.calculation_quiz.service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

import jp.ruly.training.ooka.calculation_quiz.dto.QuizDTO;

@Service
public class SubtractQuizService implements QuizService {

	@Override
	public int getMode() {
		return QuizService.CalcMode.SUBTRACT.value();
	}

	@Override
	public List<QuizDTO> generateQuiz(int count) {
		return IntStream.range(0, count).mapToObj(x -> generateQuiz()).collect(Collectors.toList());
	}

	private QuizDTO generateQuiz() {
		Random r = new Random();
		return new QuizDTO(r.nextInt(10), r.nextInt(10));
	}
}
