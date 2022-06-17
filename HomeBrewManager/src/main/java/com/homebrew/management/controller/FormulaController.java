package com.homebrew.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.homebrew.management.dto.GetFormulaDetailsResponse;
import com.homebrew.management.service.FormulaService;

@RequestMapping("/formula")
@RestController
public class FormulaController {

	@Autowired
	FormulaService formulaService;

	@GetMapping("")
	public ResponseEntity<GetFormulaDetailsResponse> getFormulaDetails(@RequestParam String name) {

		GetFormulaDetailsResponse formulaDetailsResp = formulaService.getFormulaDetails(name);
		return new ResponseEntity<GetFormulaDetailsResponse>(formulaDetailsResp, HttpStatus.OK);
	}

}
