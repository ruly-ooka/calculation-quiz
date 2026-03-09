package jp.ruly.training.ooka.calculation_quiz.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class QuizDTO {

	/** 数字１ */
	@lombok.NonNull
	private Integer num1;

	/** 数字２ */
	@lombok.NonNull
	private Integer num2;

	/** ユーザーの回答 */
	private Integer userAnswer;
}
