import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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
        for (Integer i : a)
        {
            if (p.test(i))
            {
                System.out.println(i);
            }
        }
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
        //С лямда будет выглядит так:
        Collections.sort(names,(String a, String b) -> {return b.compareTo(a);});
        Collections.sort(names,(a,b) -> b.compareTo(a));
        //

        List<Employee> employees = new ArrayList<Employee>();
            employees.add(new Employee("Ivanov",1,1));
            employees.add(new Employee("Petrov",2,3));
            employees.add(new Employee("Sidirov",3,2));
            employees.forEach(System.out::println);
            employees.sort(employees);
    }

    public static double sumOfSomething(){



        return 0;
    }





}
