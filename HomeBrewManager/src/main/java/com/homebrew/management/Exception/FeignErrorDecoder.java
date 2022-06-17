package com.homebrew.management.Exception;

import org.springframework.stereotype.Component;

import feign.Response;
import feign.codec.ErrorDecoder;

@Component
public class FeignErrorDecoder implements ErrorDecoder {

	@Override
	public Exception decode(String methodKey, Response response) {
		switch (response.status()) {

		case 404:
			if (methodKey.startsWith("HomeBrewClient"))
				throw new FormulaNotFoundException();
			break;

		default:
			return new Exception();
		}

		return null;
	}

}
