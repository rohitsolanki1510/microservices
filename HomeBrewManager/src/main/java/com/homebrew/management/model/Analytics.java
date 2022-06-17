package com.homebrew.management.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Analytics {
	Install install;
	Install install_on_request;
	Install build_error;
}
