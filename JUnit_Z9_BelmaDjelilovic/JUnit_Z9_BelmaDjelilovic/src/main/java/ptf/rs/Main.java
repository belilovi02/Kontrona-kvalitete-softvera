package ptf.rs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello");

    }

	public static int brojSamoglasnika(String s) throws Exception {
	    if (s == null || s.isEmpty()) {
	        throw new Exception("String ne smije biti prazan");
	    }
	    int broj = 0;
	    for (int i = 0; i < s.length(); i++) {
	        char c = s.charAt(i);
	        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
	            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
	            broj++;
	        }
	    }
	    if (broj == 0) {
	        throw new Exception("String ne sadrzi samoglasnike");
	    }
	    return broj;
	}

}