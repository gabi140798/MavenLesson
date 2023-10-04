package pl.kurs.serrvice;

import pl.kurs.exceptions.NoOldestPersonException;
import pl.kurs.model.Person;

import java.util.*;

public class PersonService {


    public Person findOldestPerson(List<Person> people) {
        return Optional.ofNullable(people)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .max(Comparator.comparing(Person::getAge))
                .orElseThrow(NoOldestPersonException::new);
    }

}
