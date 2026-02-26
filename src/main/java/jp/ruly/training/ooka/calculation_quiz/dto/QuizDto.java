package jp.ruly.training.ooka.calculation_quiz.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuizDto {
	
	/** 問題 */
	private String quiz;
	
	/** 正答 */
	private String answer;
}
