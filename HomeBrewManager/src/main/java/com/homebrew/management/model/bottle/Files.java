package com.homebrew.management.model.bottle;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Files {
	Arm64_monterey arm64_monterey;
	Arm64_big_sur arm64_big_sur;
	Monterey monterey;
	Big_sur big_sur;
	Catalina catalina;
	X86_64_linux x86_64_linux;
}
