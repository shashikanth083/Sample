package Java8;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner name = new StringJoiner(",", "[", "]");
        name.add("John");
        name.add("Smith");
        name.add("Peter");

        StringJoiner countries = new StringJoiner(":", "{", "}");
        countries.add("India");
        countries.add("USA");
        countries.add("UK");

//        StringJoiner nameMerge = name.merge(countries);
//        System.out.println(nameMerge);

        StringJoiner countriesMerge = countries.merge(name);
        System.out.println(countriesMerge);
    }
}
