package functionlInterfaces;

import java.util.function.Predicate;

public class _predicate {


    public static void main(String[] args) {


        System.out.println(phoneValidation("07000000001"));
        System.out.println(phoneValidation("09000000001"));
        System.out.println(phoneValidationPredicate.test("07000000001"));
        System.out.println(phoneValidationPredicate.test("09000000001"));


    }


     static  Predicate<String> phoneValidationPredicate = str ->
            str.startsWith("07") && str.length() == 11;


    static Boolean phoneValidation(String str){


        return str.startsWith("07") && str.length() == 11;

    }




}
