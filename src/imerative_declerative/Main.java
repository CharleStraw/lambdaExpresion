package imerative_declerative;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {


        List<Person> people = List.of(


                new Person("Karol", Gender.MALE),
                new Person("Marta", Gender.FEMALE),
                new Person("Sylwia", Gender.FEMALE),
                new Person("Karol", Gender.MALE)

        );


        //imperitve approach
        System.out.println("imperitve approach");
        List<Person> female = new ArrayList<>();

        for (Person person : people) {

            if (Gender.FEMALE.equals(person.gender)) {
                female.add(person);
            }

        }

        for (Person person : female) {

            System.out.println(female);

        }

        //declerative approach
        System.out.println("declerative approach");

        people.stream().filter(person -> Gender.FEMALE.equals(person.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);




    }


    static class Person {

        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }

}







