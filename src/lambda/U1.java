package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class U1 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(Arrays.asList(14, 9, 13, 4, 9, 2, 4, 14, 15));
//        printLambda(l);
//        printEvenLambda(l);
//        printSquare(l);
//        printOddSquare(l);
//        printEvenSquare(l);
//        printSumCube(l);
//        printOrder(l);
        printReverseOrder(l);


    }

    private static void printReverseOrder(List<Integer> l) {
        l.stream().sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t+" "));
    }

    private static void printOrder(List<Integer> l) {
        l.stream().sorted().forEach(t-> System.out.print(t+" "));
    }

    private static void printSumCube(List<Integer> l) {
        int cube = l.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(u,t)->u*t);
        System.out.println(cube);
    }

    private static void printEvenSquare(List<Integer> l) {
        int sum = l.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (u, t) -> u + t);
        System.out.print(sum);
    }

    private static void printOddSquare(List<Integer> l) {
        l.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));
    }

    private static void printSquare(List<Integer> l) {
        l.stream().filter(t -> t % 2 == 1).map(t -> t * t).forEach(t -> System.out.print(t + " "));
    }

    private static void printEvenLambda(List<Integer> l) {
        l.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));
    }

    private static void printLambda(List<Integer> l) {
        l.stream().forEach(t -> System.out.print(t + " "));
    }

}
