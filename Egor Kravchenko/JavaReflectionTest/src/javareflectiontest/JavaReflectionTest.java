package javareflectiontest;

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
            //
            //вызов метода, которому нужен параметр
            method = aUser.getClass().getMethod("setEmail", String.class);
            method.invoke(aUser, "tester2@gmail.com");
            //
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
        //
        //Список методов класса
        String className = "javareflectiontest.MyUser";
        System.out.println("Список методов класса:" + className);
        //Class clazz = MyUser.class;
        Class clazz;
        try {
            //аналог new с конструктором по умолчанию
            clazz = Class.forName(className);
            System.out.println("у класса есть аннотация "+clazz.isAnnotation()); 
            Class superClasses =  clazz.getSuperclass();
            System.out.println("у класса есть родитель "+superClasses); 
            Method[] methods = clazz.getMethods();
            //в дополнение ко всем "моим" открытм методам
           //идут все унаследованные от System.Object
           //и от родителей + "готовность" рботать с потоками:wait notify ...
           System.out.println("методы класса ");
            for (Method function : methods) {
                System.out.println(function.getName());
                //
                 if (  function.getParameterCount() == 1//если у метода только один параметр
                    && function.getParameterTypes()[0].//и тип этого параметра String
                       getName().indexOf("String") >= 0)
                 {
                       function.invoke(aUser, "testvalue");
                 }
                //
            }
            //import java.lang.reflect.Constructor;
            Constructor[] contrs = clazz.getConstructors();
            System.out.println("конструкторы: ");
            for (Constructor function : contrs) {
                System.out.println(function.getName()+" параметры "+function.getParameterCount() );
                
            }
            //
            Field[]  fields =  clazz.getFields();
            Class[] interfaces = clazz.getInterfaces();
            System.out.println("intefaces : ");
            for(Class c : interfaces)
            {
                System.out.println(c);
            }
            //
        } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(JavaReflectionTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(JavaReflectionTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(JavaReflectionTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(JavaReflectionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
      
       
        
    }
    
}
