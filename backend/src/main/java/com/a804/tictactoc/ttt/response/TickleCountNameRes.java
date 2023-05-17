package com.a804.tictactoc.ttt.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.util.List;

/**
 * 유저 모델 정의.
 */
@Schema(name="TickleCountNameRes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TickleCountNameRes {
	@Schema(description = "카테고리 번호", example = "1", defaultValue = "1")
	int categoryId;

	@Schema(description = "카테고리 이름", example = "운동", defaultValue = "운동")
	String categoryName;

	@Schema(description = "티끌 수", example = "10", defaultValue = "10")
	int count;
}
