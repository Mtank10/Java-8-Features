import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Topic that covers
//Introduction to Stream Api
//Compare code with java simple code
// create the object of Stream and processing data.
//methods with exaples

class Streamapi{
    public static void main(String[] args) {
        //create a List and filter all even numbers from list

        List<Integer> list1=List.of(2,4,50,21,22,67);//unmutable
        // List<Integer> list3 = Arrays.asList(23,567,12,677,24);
        //Without Stream
        List<Integer> listEven =new ArrayList<>();
        for(Integer i:list1){
            if(i%2==0){
                listEven.add(i);
            }
        }
        // System.out.println(list1);
        // System.out.println(listEven);
         
        // Stream<Integer> stream=list1.stream();
        // List<Integer> newList=stream.filter(i->i%2==0).collect(Collectors.toList());
        // System.out.println(newList);
        // List<Integer> newList=list1.stream().filter(i->i%2==0).collect(Collectors.toList());
        // System.out.println(newList);
        


    }
}