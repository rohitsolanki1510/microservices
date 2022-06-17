package com.homebrew.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homebrew.management.Exception.BadRequestException;
import com.homebrew.management.client.HomeBrewClient;
import com.homebrew.management.dto.GetFormulaDetailsResponse;
import com.homebrew.management.model.Dependency;
import com.homebrew.management.model.FormulaDetailsHomebrewResp;

@Service
public class FormulaServiceImpl implements FormulaService {
	@Autowired
	HomeBrewClient homeBrewClient;

	@Override
	public GetFormulaDetailsResponse getFormulaDetails(String formulaName) {
		
		if ("".equals(formulaName.trim()))
			throw new BadRequestException(null);

		FormulaDetailsHomebrewResp formulaDetailsHomebrewResp = null;
		formulaDetailsHomebrewResp = homeBrewClient.getFormulaDetails(formulaName);
		GetFormulaDetailsResponse getFormulaDtlsResp = new GetFormulaDetailsResponse();

		getFormulaDtlsResp.setVersions(
				formulaDetailsHomebrewResp != null ? formulaDetailsHomebrewResp.getVersions().getStable() : "N/A");
		getFormulaDtlsResp.setDesc(formulaDetailsHomebrewResp != null ? formulaDetailsHomebrewResp.getDesc() : "N/A");
		getFormulaDtlsResp.setGenerated_date(
				formulaDetailsHomebrewResp != null ? formulaDetailsHomebrewResp.getGenerated_date() : "N/A");
		getFormulaDtlsResp
				.setDependencies(
						formulaDetailsHomebrewResp != null
								? Dependency.builder()
										.build_dependencies(formulaDetailsHomebrewResp.getBuild_dependencies())
										.dependencies(formulaDetailsHomebrewResp.getDependencies())
										.recommended_dependencies(
												formulaDetailsHomebrewResp.getRecommended_dependencies())
										.optional_dependencies(formulaDetailsHomebrewResp.getOptional_dependencies())
										.build()
								: null);
		return getFormulaDtlsResp;
	}

}
