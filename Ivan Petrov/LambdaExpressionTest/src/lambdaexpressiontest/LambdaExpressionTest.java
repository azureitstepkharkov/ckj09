package lambdaexpressiontest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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
    
    public static int calcSum(List<Integer> numbers,
             Predicate<Integer> funct) 
     {
        int sum = 0;
         for (int number : numbers) 
         {
            if (funct.test(number)) 
            {
               sum += number;
            }
        }
         return sum;
    }
   //
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
        //
        int sum1 = calcSum(numbers, n -> n % 2 == 0);//сумма только четных
        int sum2 = calcSum(numbers, n -> n > 3);//сумма всех, кто больше трех
        int sum = calcSum(numbers, n -> true);//"выключил" предикат - всегда - возвращаем true
        //сокращение синтаксиса анонимных классов (обработчиков Click в Java Android)
        //Пример 4 обощение анонимных классов
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        System.out.println("before sorting on salary: " + names);
        //вариант 1 анонимный класс - сортировка
        Collections.sort(names, new Comparator<String>() {
        @Override
                  public int compare(String a, String b) {
                  return b.compareTo(a);
                  }
        });
        //вариант 2 замена анонимного класса лямбда выражением
        Collections.sort(names,(String a, String b) ->{return b.compareTo(a);}  );
        Collections.sort(names,(String a, String b) ->b.compareTo(a)  );
        Collections.sort(names,(a,b) ->b.compareTo(a)  );
        //
        List<Employee> employees = new ArrayList<>();
        employees.add( new Employee("ivanov", 1, 1) );
        employees.add( new Employee("petrov", 2, 1) );
        employees.add( new Employee("sidorov", 3, 1) );
        employees.forEach(System.out::println);//toString
        Collections.sort(employees);//сортировку поумолчанию
        //сохранение в xml на основании проекта XMLCreater
        
    }   //
}
