package com.homebrew.management.model;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class Dependency {
	private List<Object> build_dependencies;
	private List<Object> dependencies;
	private List<Object> recommended_dependencies;
	private List<Object> optional_dependencies;
}
