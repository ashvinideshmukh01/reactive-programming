package study.java8.functionalInterfaces;
import static study.java8.functionalInterfaces.FunctionalInterfacesUtil.*;
public class TestFunctionalInterfaces {

    public static void main(String[] args) {

        System.out.println(supplyName().get());

        printSquare().accept(5);
        printSquare().andThen((number) -> System.out.println(number *number)).accept(2);

        System.out.println(findSquare().apply(3));

        System.out.println(nameLengthMoreThan5().test("Rajveer"));


    }
}
