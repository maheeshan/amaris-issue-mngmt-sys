package com.amaris.gaimes.amaris_issue_mngmt_sys.dtos;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@AllArgsConstructor
@JsonSerialize
@Data
public class RestErrorDto {
	private final String message;
}
