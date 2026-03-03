package jp.ruly.training.ooka.calculation_quiz.service;

import java.util.List;

import jp.ruly.training.ooka.calculation_quiz.dto.QuizDTO;

/**
 * 問題を生成するサービス.
 */
public interface QuizService {
	
	enum CalcMode {
		ADD(1, "たし算"), SUBTRACT(2, "ひき算"), MULTIPLY(3, "かけ算"), DEVISION(4, "わり算"),
		;
		
		private final int value;
		private final String name;
		
		private CalcMode(int value, String name) {
			this.value = value;
			this.name = name;
		}
		
		public int value() {
			return this.value;
		}
		
		public String getName() {
			return this.name;
		}
	}
	
	/**
	 * このサービスがどの計算に対応するかを返す.
	 * 
	 * 1. たし算
	 * 2. ひき算
	 * 3. かけ算
	 * 4. わり算
	 * 
	 * @return
	 */
	int getMode();
	
	/**
	 * 問題を生成.
	 * 
	 * @param count 生成する問題数
	 * @return 生成した問題のリスト
	 */
	List<QuizDTO> generateQuiz(int count);
}
