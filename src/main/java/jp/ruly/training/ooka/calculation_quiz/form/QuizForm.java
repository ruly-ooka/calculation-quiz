package jp.ruly.training.ooka.calculation_quiz.form;

import java.util.List;

import jp.ruly.training.ooka.calculation_quiz.constant.CalcMode;
import jp.ruly.training.ooka.calculation_quiz.dto.QuizDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuizForm {
	private CalcMode mode;
	private List<QuizDTO> quizzes;
}
