package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class U3 {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>(Arrays.asList(7,12,14,4,9,2,4,12,16));
//        printFirst4(l);
//        print4(l);
        print456(l);
    }

    private static void print456(List<Integer> l) {
        l.stream().sorted().limit(6).skip(3).forEach(U::printWithSpace);
    }

    private static void print4(List<Integer> l) {
        l.stream().skip(4).forEach(U::printWithSpace);
    }

    private static void printFirst4(List<Integer> l) {
        l.stream().limit(4).forEach(U::printWithSpace);
    }

}
