package com.a804.tictactoc.ttt.db.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import javax.persistence.*;

/**
 * 유저 모델 정의.
 */
@Entity
@Table(name="habit")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Habit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Schema(hidden = true)
    long id;

	@Schema(name = "어떤 유저의 습관인지", example = "1", defaultValue = "1")
	@Column(name="user_id")
	long userId;

	@Schema(name = "어떤 카테고리의 습관인지", example = "1", defaultValue = "1")
	@Column(name="category_id")
	long categoryId;

	@Schema(name = "습관의 이름", example = "물마시기", defaultValue = "물마시기")
	@Column(name="name")
	String name;

	@Schema(name = "습관을 대표하는 이모지 이름", example="happy", defaultValue = "happy")
	@Column(name="emoji")
    String emoji;

	@Schema(name = "알람 시작 시간 HHmm", example = "0930", defaultValue = "0930")
	@Column(name="start_time")
	String startTime;

	@Schema(name = "알람 종료 시간 HHmm", example = "1930", defaultValue = "1930")
	@Column(name="end_time")
	String endTime;


	@Schema(name = "알람이 울리는 주기 HHmm", example = "0030", defaultValue = "0030")
	@Column(name="term")
	String term;

	@Schema(name = "알람이 울리는 요일 7비트", example = "1011011", defaultValue = "1011011")
	@Column(name="repeat_day")
	String repeatDay;

	@Schema(hidden = true)
	@Column(name="delete_yn")
	int deleteYn;

	@Schema(hidden = true)
	@Column(name="created_date")
	String createdDate;

	@Schema(hidden = true)
	@Column(name="modified_date")
	String modifiedDate;
}
