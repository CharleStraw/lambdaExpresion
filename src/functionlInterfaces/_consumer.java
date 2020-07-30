package functionlInterfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _consumer {

    public static void main(String[] args) {

        Person person = new Person("Karol", "793234443",true);
        getCostumerAndPhone(person);

        getPersonAndPhone.accept(person,person.showPhone);


//        getCustomer1("Karol");
//   getConsumer.accept("Karol w funkcji lambda");


    }


    static void getCostumerAndPhone(Person person){

        System.out.println("my name is " + person.name + "phone numer " + (person.showPhone ? person.phone : "**********" )) ;

    }


   static BiConsumer<Person,Boolean> getPersonAndPhone= ( person, showPhone) ->
           System.out.println("my name is " + person.name + "phone numer " + (showPhone ? person.phone : "**********" )) ;

//    static Consumer<String> getConsumer= consumer -> System.out.println("then you for calling " + consumer);
//
//
//    static void getCustomer1(String str){
//
//         System.out.println("then you for calling " + str);
//     }









     static class Person{

        static String name;
        static String phone;
        static Boolean showPhone;


         public Person(String name,String phone,Boolean showPhone) {
             this.name =name;
             this.phone =phone;
             this.showPhone=showPhone;
         }
     }


}
