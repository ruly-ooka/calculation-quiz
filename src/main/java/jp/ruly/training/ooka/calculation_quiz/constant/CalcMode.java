package jp.ruly.training.ooka.calculation_quiz.constant;

import java.util.Random;

import jp.ruly.training.ooka.calculation_quiz.dto.QuizDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CalcMode {
	ADD(1, "たし算", "＋") {
		@Override
		public QuizDTO generateQuiz() {
			return new QuizDTO(r.nextInt(10), r.nextInt(10));
		}
	},
	SUBTRACT(2, "ひき算", "－") {
		@Override
		public QuizDTO generateQuiz() {
			int num1 = r.nextInt(10);
			return new QuizDTO(num1, r.nextInt(num1 + 1));
		}
	},
	MULTIPLY(3, "かけ算", "×") {
		@Override
		public QuizDTO generateQuiz() {
			// TODO 自動生成されたメソッド・スタブ
			return null;
		}
	},
	DIVISION(4, "わり算", "÷") {
		@Override
		public QuizDTO generateQuiz() {
			// TODO 自動生成されたメソッド・スタブ
			return null;
		}
	},;

	private static Random r = new Random();

	private final int value;
	private final String label;
	private final String operator;

	public static CalcMode fromValue(int value) {
		for (CalcMode mode : CalcMode.values()) {
			if (mode.getValue() == value) {
				return mode;
			}
		}

		throw new IllegalArgumentException("不正な計算モードです： " + value);
	}

	public abstract QuizDTO generateQuiz();
}