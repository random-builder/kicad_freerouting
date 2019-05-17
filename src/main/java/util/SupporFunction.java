package util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public interface SupporFunction {

	static Reader readerFrom(InputStream input) {
		try {
			return new BufferedReader(new InputStreamReader(input, "UTF-8"));
		} catch (Exception e) {
			throw new Error(e);
		}
	}

}
