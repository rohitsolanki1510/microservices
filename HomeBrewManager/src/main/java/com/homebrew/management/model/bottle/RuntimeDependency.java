package com.homebrew.management.model.bottle;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RuntimeDependency {
	private String full_name;
	private String version;
	private Boolean declared_directly;
}
