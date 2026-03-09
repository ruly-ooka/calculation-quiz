package jp.ruly.training.ooka.calculation_quiz.service;

import java.util.List;

import jp.ruly.training.ooka.calculation_quiz.constant.CalcMode;
import jp.ruly.training.ooka.calculation_quiz.dto.QuizDTO;

/**
 * 問題を生成するサービス.
 */
public interface QuizService {

	/**
	 * 問題を生成.
	 * 
	 * @param mode  四則演算の種類
	 * @param count 生成する問題数
	 * @return 生成した問題のリスト. count が 0以下の場合は空のリスト.
	 */
	List<QuizDTO> generateQuiz(CalcMode mode, int count);
}
