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

	public static double multiply(double x, double y) throws Exception {
    double result = x * y;
    if (result > 100) {
        throw new Exception("Proizvod je prevelik!");
    }
    return result;
}

}