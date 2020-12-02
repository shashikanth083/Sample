package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIDemo {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        personList.add(new Person(1, "John"));
        personList.add(new Person(2, "Smith"));
        personList.add(new Person(3, "Peter"));

        // foreach loop
        List<Person> personListCopy = new ArrayList<>();
        for (Person person: personList) {
            if (person.getId() > 1)
                personListCopy.add(person);
        }
        System.out.println(personListCopy.size());

        // stream api filter
        personListCopy = personList.stream().filter(person -> person.getId() > 2).collect(Collectors.toList());
        System.out.println(personListCopy.size());

        // stream api filter
        List<Integer> idList = personList.stream().map(person -> person.getId()).collect(Collectors.toList());
        System.out.println(idList);
    }
}
