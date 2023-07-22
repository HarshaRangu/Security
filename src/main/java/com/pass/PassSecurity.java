package com.pass;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PassSecurity {

	public String Encode(String text) {
		Encoder encoder = Base64.getEncoder();
		String encodeToString = encoder.encodeToString(text.getBytes());
		return encodeToString;
	}

}
