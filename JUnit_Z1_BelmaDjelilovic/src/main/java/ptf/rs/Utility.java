package ptf.rs;

import java.util.ArrayList;
import java.util.List;

public class Utility {

    public Utility() {

    }

    public static boolean djeljiviSaTri(List<Integer> brojevi) {
        return brojevi.stream().filter(br -> br%3 != 0).count() == 0;
    }

}
