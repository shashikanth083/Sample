package Java8;

import java.util.Optional;

public class OptinalDemo {
    public static void main(String[] args) {
        Integer[] integers = new Integer[5];
        integers[3] = 5;
        Optional<Integer> optional =  Optional.ofNullable(integers[3]);
        if (optional.isPresent()) {
            System.out.println(integers[3].toString());
        }
    }
}
