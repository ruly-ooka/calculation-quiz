package jp.ruly.training.ooka.calculation_quiz.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CalcMode {
	ADD(1, "たし算", "＋"), SUBTRACT(2, "ひき算", "－"), MULTIPLY(3, "かけ算", "×"), DIVISION(4, "わり算", "÷"),;

	private final int value;
	private final String name;
	private final String operator;

	public static CalcMode fromValue(int value) {
		for (CalcMode mode : CalcMode.values()) {
			if (mode.getValue() == value) {
				return mode;
			}
		}

		throw new IllegalArgumentException("不正な計算モードです： " + value);
	}
}