package com.homebrew.management.model;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Install {
	@JsonProperty("30d")
	Map<String, String> _30d;
	@JsonProperty("90d")
	Map<String, String> _60d;
	@JsonProperty("365d")
	Map<String, String> _365d;

}
