import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Integer> ls = Arrays.asList(10,30,30,20,50,70,50);

     List<Integer> sortedList=  ls.stream().sorted().collect(Collectors.toList());
       System.out.println(sortedList);

       Set<Integer> set=new HashSet<>();
       List<Integer> duplicateList=ls.stream().filter(n->!set.add(n)).collect(Collectors.toList());

System.out.println("duplicateList=="+duplicateList);

    }
}