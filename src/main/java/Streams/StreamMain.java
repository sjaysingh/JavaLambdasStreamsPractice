package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {

        Integer[] intg = {34,52,21,53,565,11};

        List<String> llist = new ArrayList<>();

        llist.add("Ferrari");
        llist.add("Lamborghini");
        llist.add("Porsche");
        llist.add("Shelby");
        llist.add("Ford");

        //Stream streamA = Arrays.stream(intg);
        Stream<String> StreamL = llist.stream();

        Stream<String> LetterS = Stream.of("1","4","2","5","2","90");

        StreamL.sorted()
                .map(item -> item.toUpperCase())
                .filter(item -> item.startsWith("P"))
                .forEach(item -> System.out.println(item));

        System.out.println(llist);

        List<Integer> sortedNumStreamList = Arrays.stream(intg).sorted()
                .filter(item -> item<80)
                .map(item ->Math.addExact(item, 1))
                .collect(Collectors.toList());

        System.out.println(sortedNumStreamList);

    }
}
