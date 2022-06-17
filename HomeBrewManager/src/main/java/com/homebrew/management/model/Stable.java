package com.homebrew.management.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Stable {
	private String url;
	private String tag;
	private String revision;
}
