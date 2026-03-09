package jp.ruly.training.ooka.calculation_quiz.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

import jp.ruly.training.ooka.calculation_quiz.constant.CalcMode;
import jp.ruly.training.ooka.calculation_quiz.dto.QuizDTO;

@Service
public class QuizServiceImpl implements QuizService {

	@Override
	public List<QuizDTO> generateQuiz(CalcMode mode, int count) {
		return IntStream.range(0, count).mapToObj(i -> mode.generateQuiz()).collect(Collectors.toList());
	}
}
