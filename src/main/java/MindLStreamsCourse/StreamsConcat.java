package MindLStreamsCourse;


import com.beust.ah.A;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsConcat {

    @Test(groups = "stream")
    public void concatStreams() {

        //Concat Streams
        Stream<Integer> a = Stream.of(1, 32, 4);
        Stream<Integer> b = Stream.of(4, 90, 900);

        Stream<Integer> c = Stream.concat(a, b);
        System.out.print("c: ");
        c.forEach(x -> System.out.print(x + " "));

    }

    @Test(groups = "stream")
    public void removeDuplicatesFromAStream() {
        //Remove duplicates from Stream
        Stream<Integer> d = Stream.of(1, 2, 3, 2, 3, 4, 2, 5, 6);
        d = d.distinct();


        System.out.print("\nd: ");
        d.forEach(x -> System.out.print(x + " "));

    /*
        OR
        System.out.print("\nd: ");
        d.distinct().forEach(x-> System.out.print(x+" "));
    */
    }

    @Test(groups = "stream")
    public void concatListsUsingStream() {
        //Concat Lists using streams

        List<String> la = new ArrayList<String>(Arrays.asList("1 2 3 4 5".split(" ")));
        System.out.println("la: " + la);

        List<String> lb = new ArrayList<String>(Arrays.asList("90 7 3 4 5".split(" ")));
        System.out.println("lb: " + lb);

        List<String> r = Stream.concat(la.stream(),lb.stream()).collect(Collectors.toList());
        System.out.println("r: "+r);
    }

    @Test(groups = "stream")
    public void removeDuplicateObjectsUsingStreams(){
        /*
        * https://www.mindluster.com/lesson/117934
        */

        List<Person> people = new ArrayList<Person>();

        people.add(new Person("Ajay",56));
        people.add(new Person("Ajay",19));
        people.add(new Person("Vijay",6));
        people.add(new Person("Cjay",9));
        people.add(new Person("Sujay",21));
        people.add(new Person("Sujay",19));

        System.out.println("\nPeople before: "+people);

        people = people.stream()
                //users Person.equals and Person.hashCode \
                .distinct()
                .collect(Collectors.toList());

        System.out.println("\nPeople after: "+people);
    }
}
