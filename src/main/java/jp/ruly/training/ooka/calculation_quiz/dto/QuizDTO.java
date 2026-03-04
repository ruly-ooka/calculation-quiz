package jp.ruly.training.ooka.calculation_quiz.dto;

import jp.ruly.training.ooka.calculation_quiz.constant.CalcMode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuizDTO {
	
	/** 計算の種類 */
	private CalcMode calcMode;
	
	/** 数字１ */
	private int num1;

	/** 数字２ */
	private int num2;
}
