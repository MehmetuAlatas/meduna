package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class U2 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(Arrays.asList(15, 14, 9, 13, 4, 9, 2, 4, 14, 6));
//        printElement(l);
//        printEvenElement(l);
//        printOddElement(l);
//        printOddCubeElement(l);
//        printEvenCubeElement(l);
//        printOddgreaterFive(l);
//        printMax(l);
        printMin(l);


    }

    private static void printMin(List<Integer> l) {
       int min = l.stream().reduce(Integer.MAX_VALUE,(Math::min));
        System.out.println(min);
    }

    private static void printMax(List<Integer> l) {
        System.out.println(l.stream().reduce(Integer.MIN_VALUE,(Math::max)));
    }

    //7)List teki farklı ve 5 ten büyük ve çift elemanlarının yarısını alıp ters sıralayarak list olarak yazdır.
    private static void printOddgreaterFive(List<Integer> l) {
        l.stream().distinct().filter(t->t>5 && t%2==0).map(t->t/2).
                sorted(Comparator.reverseOrder()).forEach(U::printWithSpace);
    }


    private static void printEvenCubeElement(List<Integer> l) {
        int sum = l.stream().distinct().filter(U::getEven).map(U::getSquare).
                reduce(0, (Math::addExact));
        System.out.println(sum);
    }

    private static void printOddCubeElement(List<Integer> l) {
        l.stream().distinct().
                filter(U::getOdd).
                map(U::getCube).
                forEach(U::printWithSpace);
    }

    private static void printOddElement(List<Integer> l) {
        l.stream().filter(U::getOdd).map(U::getSquare).forEach(U::printWithSpace);
    }

    private static void printEvenElement(List<Integer> l) {
        l.stream().filter(U::getEven).forEach(U::printWithSpace);
    }

    private static void printElement(List<Integer> l) {
        l.stream().forEach(U::printWithSpace);
    }
}
