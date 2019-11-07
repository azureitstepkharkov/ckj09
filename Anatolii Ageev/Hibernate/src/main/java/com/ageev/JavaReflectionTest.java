package com.ageev;

//import java.lang.reflect.*//механимзы программного
//исследования кода
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaReflectionTest {


    public static void main(String[] args)
    {
        //пример 1 - вызов метода "из кода"
        MyUser aUser = new MyUser();
        aUser.setId(Long.MIN_VALUE);
        aUser.setEmail("tester@gmail.com");
        String userEmail = aUser.getEmail();
        //повторим при помощи механизмов
        //рефлексии
        System.out.printf("Пример #%d использования %s на примере класса %s \n", 1, "рефлексии", "User");
        Method method;
        try {
            // те же шаги
            method = aUser.getClass().getMethod("getEmail");
            userEmail = (String) method.invoke(aUser);
        } catch (NoSuchMethodException ex) {
            System.out.println("в классе нет метода с таким именем");;
        } catch (SecurityException ex) {
            System.out.printf("Нет прав администратора для приложения. %s !", ex.toString());
        } catch (IllegalAccessException ex) {
            System.out.println("Вызывается метод с доступом не public");
        } catch (IllegalArgumentException ex) {
            System.out.println("В момент вызова не заполнены параметры метода");
        } catch (InvocationTargetException ex) {
            System.out.println("Неизвестная А.К. ошибка");
        }
            String className = "com.ageev.MyUser";
        System.out.println("List of methods: " + className);
        Class clazz;

        try {
            clazz = Class.forName(className);
            System.out.println(" у класса есть анотация"+ clazz.isAnnotation());
            Class superClasses = clazz.getSuperclass();
            System.out.println(" у класса есть суперкласс"+ superClasses);
            Method[] methods = clazz.getMethods();
            for (Method func:
                 methods) {
                System.out.println(func.getName());
            }

            Constructor[] constructors = clazz.getConstructors();
            System.out.println("Constructors: ");
            for (Constructor func:
                    constructors) {
                System.out.println(func.getName()+" параметры "+func.getParameterCount());
            }
            Field[]  fields =  clazz.getFields();
            Class[] interfaces = clazz.getInterfaces();
            System.out.println("intefaces : ");
            for(Class c : interfaces)
            {
                System.out.println(c);
            }

        }
        catch (ClassNotFoundException ex){


        }

    }

}
