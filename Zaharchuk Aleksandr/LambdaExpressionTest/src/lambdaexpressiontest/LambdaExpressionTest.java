package lambdaexpressiontest;

import java.util.Arrays;
import java.util.List;

import java.util.function.*;

public class LambdaExpressionTest {
    public static void printItem(Integer a)
    {
        System.out.print(a);
    }
    public static boolean isEven(int a)
    {
        return a % 2 == 1;
    }
    public static boolean isOdd(int a)
    {
        return a % 2 == 0;
    }
    public static boolean isCheck(int a)
    {
        return a % 5 == 0;
    }
    public void printItems(int [] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (isCheck(i))
            {
                System.out.println(i);
            }
        }
    }
    public static void printItems( List<Integer> numbers, Predicate p)
    {
        for (Integer i : numbers)
        {
            if (p.test(i))
            {
                System.out.println(i);
            }
        }
    }
    //предикат = любая функция, которая прнимает один парамет и возвращает boolean
    public static void printIntegers(List<Integer> numbers, Predicate<Integer> fn) {
        for (int number : numbers) 
        {
            if (fn.test(number)) 
            {
                System.out.println(number);
            }
        }
    }
    public static void main(String[] args) 
    {
          //List<int> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //Пример 1 Обобщение вывода на экран
        for (int number : numbers) {
            System.out.println(number);
        }
        /*
        numbers.forEach( (Integer x)->{System.out.println(x);});
        numbers.forEach( (Integer x)->System.out.println(x));
        numbers.forEach( (x)->System.out.println(x));
        numbers.forEach(System.out::println);//только java 9+
        */
        System.out.println("printIntegers(numbers,isEven)");
        Predicate<Integer> isEven = num -> (num % 2) == 0;
        printIntegers(numbers, isEven);
        System.out.println("printIntegers(numbers,num -> (num % 2) != 0)");
        printIntegers(numbers, num -> (num % 2) != 0);
    }
}
