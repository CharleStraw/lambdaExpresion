package streamsApp;

import streams._stream;

import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<person> people = getList();

        //Filter
        List<person> filter = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMAL))
                .collect(Collectors.toList());


//        filter.forEach(System.out::println);


        //Sort
        List<person> sorted = people.stream()
                .sorted(Comparator.comparing(person::getGender).thenComparing(person::getAge))
                .collect(Collectors.toList());

//        sorted.forEach(System.out::println);

        //allMatch
        boolean allMatch = people.stream().allMatch(person -> person.getAge() > 5);

        System.out.println(allMatch);

        //anyMatch
        boolean anyMatch= people.stream().anyMatch(person ->person.getAge()>44);
        System.out.println(anyMatch);


        //noneMatch
        boolean noneMatch=people.stream().noneMatch(person->person.getName().equals("Karol"));
        System.out.println(noneMatch);


        //max
        people.stream().max(Comparator.comparing(person::getAge))
                .ifPresent(System.out::println);

        //min
        people.stream().min(Comparator.comparing(person::getAge))
                .ifPresent(System.out::println);

        //group


        Map<Gender, List<person>> collect = people.stream().collect(Collectors.groupingBy(person::getGender));

        collect.forEach((gender, people1)
                ->{ System.out.println(gender);
                people1.forEach(System.out::println);

        });

    }







    static List<person> getList() {

        return List.of(
                new person("Karol", 14, Gender.MALE),
                new person("Sonia", 16, Gender.FEMAL),
                new person("Grażyna", 14, Gender.FEMAL),
                new person("Łukasz", 34, Gender.MALE),
                new person("Krzysiek", 14, Gender.MALE),
                new person("Rober", 44, Gender.MALE),
                new person("Marta", 14, Gender.FEMAL),
                new person("Karolina", 14, Gender.FEMAL)
        );


    }

}
