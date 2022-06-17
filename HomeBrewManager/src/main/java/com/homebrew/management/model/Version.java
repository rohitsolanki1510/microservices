package com.homebrew.management.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Version {

	private String stable;
	private String head;
	private String bottle;

}
