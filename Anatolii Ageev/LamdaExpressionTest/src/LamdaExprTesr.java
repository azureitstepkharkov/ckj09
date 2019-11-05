import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LamdaExprTesr {
    public static void printItem(Integer item){
        System.out.print(item);
    }

    public static boolean isEaven(int a){
        return a%2==1;
    }
    public static boolean isOdd(int a){
        return a%2==0;
    }
    public static boolean isChecs(int a){
        return a%5==0;
    }

    public void printItem(List<Integer> a, Predicate p){
        for ()
    }


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        for (int number:
             numbers) {
            printItem(number);

        }
        System.out.println("Lamda working:\n");
        numbers.forEach((Integer a)->{System.out.print(a);});
        numbers.forEach( a ->{System.out.print(a);});
        numbers.forEach( a->System.out.print(a));
    }
}
