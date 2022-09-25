package study.java8.functionalInterfaces;

import com.github.javafaker.Faker;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfacesUtil {

    public static Supplier<String> supplyName(){
        return () -> Faker.instance().name().fullName();
    }

    public static Consumer<Integer> printSquare(){
       return number -> System.out.println(number * number);
    }

    public static Function<Integer,Integer> findSquare(){
        return (number) -> number *number;
    }

    public static Predicate<String> nameLengthMoreThan5(){
        return (name) -> name.length() > 5;
    }
}
