package jp.ruly.training.ooka.calculation_quiz.service;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

import jp.ruly.training.ooka.calculation_quiz.constant.CalcMode;
import jp.ruly.training.ooka.calculation_quiz.dto.QuizDTO;

@Service
public class AddQuizService implements QuizService {

	@Override
	public CalcMode getMode() {
		return CalcMode.ADD;
	}

	@Override
	public List<QuizDTO> generateQuiz(int count) {
		if (count <= 0) {
			return Collections.emptyList();
		}

		return IntStream.range(0, count).mapToObj(x -> generateQuiz()).collect(Collectors.toList());
	}

	private QuizDTO generateQuiz() {
		Random r = new Random();
		return new QuizDTO(this.getMode(), r.nextInt(10), r.nextInt(10));
	}

}
