package com.homebrew.management.dto;

import com.homebrew.management.model.Dependency;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetFormulaDetailsResponse {

	private String desc;
	private String versions;
	private String generated_date;
	private Dependency dependencies;
}
