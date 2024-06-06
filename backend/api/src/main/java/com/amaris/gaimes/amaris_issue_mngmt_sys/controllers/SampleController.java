package com.amaris.gaimes.amaris_issue_mngmt_sys.controllers;

import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.amaris.gaimes.amaris_issue_mngmt_sys.dtos.RestResponseDto;

import jakarta.ws.rs.Produces;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/sample")
@RequiredArgsConstructor
@ResponseBody
public class SampleController {

	@GetMapping("/string")
	@Produces(APPLICATION_JSON)
	RestResponseDto<String> getString() {
		return RestResponseDto.<String>builder().data("String from the backend").build();
	}

}
