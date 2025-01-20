package ptf.rs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        System.out.println(Utility.djeljiviSaTri(IntStream.of(3, 6, 9, 10).boxed().toList()));

    }
}