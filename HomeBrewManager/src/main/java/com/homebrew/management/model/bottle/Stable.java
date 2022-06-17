package com.homebrew.management.model.bottle;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Stable {
	private float rebuild;
	private String root_url;
	Files files;
}
