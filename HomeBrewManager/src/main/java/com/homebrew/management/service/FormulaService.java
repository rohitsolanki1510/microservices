package com.homebrew.management.service;

import com.homebrew.management.dto.GetFormulaDetailsResponse;

public interface FormulaService {

	GetFormulaDetailsResponse getFormulaDetails(String formulaName);

}
