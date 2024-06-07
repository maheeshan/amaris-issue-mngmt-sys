package com.amaris.gaimes.amaris_issue_mngmt_sys.dtos;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@AllArgsConstructor
@JsonSerialize
@Data
public class RestResponseDto<T> {
	private final T data;
	private final RestErrorDto error;
}
