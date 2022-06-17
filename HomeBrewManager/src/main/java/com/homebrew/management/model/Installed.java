package com.homebrew.management.model;

import java.util.ArrayList;
import java.util.List;

import com.homebrew.management.model.bottle.RuntimeDependency;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Installed {
	private String version;
	private List<Object> used_options = new ArrayList<Object>();
	private boolean built_as_bottle;
	private boolean poured_from_bottle;
	private List<RuntimeDependency> runtime_dependencies = new ArrayList<RuntimeDependency>();
	private boolean installed_as_dependency;
	private boolean installed_on_request;
}
