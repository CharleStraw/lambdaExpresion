package functionlInterfaces;

import java.util.function.Function;

public class _functional {


    public static void main(String[] args) {

        int a = 0;
        System.out.println(increment(a));


        System.out.println(incrementByOneFunction.andThen(multiplyByOneFunction).apply(1));

    }

   static  Function<Integer,Integer> incrementByOneFunction = number -> number+1;
    static  Function<Integer,Integer> multiplyByOneFunction = number -> number*10;
    static int increment(int a){
        return a+1;
    }


}
