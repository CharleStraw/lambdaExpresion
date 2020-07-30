package functionlInterfaces;

import java.sql.SQLOutput;
import java.util.function.BiFunction;
import java.util.function.Function;

public class _functional {


    public static void main(String[] args) {

        int a = 0;
        System.out.println(increment(a));


        System.out.println(incrementByOneFunction.andThen(multiplyByOneFunction).apply(1));
        System.out.println(incrementAndMultiply.apply(10,15));

    }

    static  Function<Integer,Integer> incrementByOneFunction = number -> number+1;
    static  Function<Integer,Integer> multiplyByOneFunction = number -> number*10;
    static BiFunction<Integer,Integer,Integer> incrementAndMultiply = (numberOne,numberTwo ) -> (numberOne+1) +(numberTwo *10);
    static int increment(int a){
        return a+1;
    }


}
