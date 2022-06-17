package com.homebrew.management.model.bottle;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Monterey {
	private String cellar;
	private String url;
	private String sha256;
}
