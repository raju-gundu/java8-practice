import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This code differentiates between Imperative and declarative way of coding
 * Remove duplicates from the list
 */
public class ImperativeVsDeclarativeEx2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,3,4,5,5,6,7,6);

        /**
         * Imperative
         */
        List<Integer> uniqueList = new ArrayList<>();
        for(Integer i : list){
            if(!uniqueList.contains(i)){
                uniqueList.add(i);
            }
        }
        System.out.println(uniqueList);

        /**
         * Declarative
         */
        List<Integer> uniqueList1 = list.stream()
                .distinct()
                .toList();
        System.out.println(uniqueList1);
    }


}
