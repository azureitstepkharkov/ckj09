package lspexample2;


public class LSPExample2 {

   
    
    public static void main(String[] args) 
    {
       
    }
    private class MyItem
    {
        public String title;
        public int id;
    }
    private interface  IMyValidator
    {
        boolean isValid(MyItem item);
        //true - объект MyItem находится в корректном
        //состоянии
        //false - объект не в корректном стостоянии
    }
    private class IntValidator implements IMyValidator
    {
        @Override
        public boolean isValid(MyItem item)
        {
          return item.id != 0;
        }
    }
    private class StringValidator implements IMyValidator
    {
        @Override
        public boolean isValid(MyItem item) 
        {
            return  item.title.isEmpty();
        }
    }
    //нарушение LSP - описание метода в интерфейсе предписывает
    //всего два состояния true или false
    //а здесь вводится третье состояние через генерацию
    //исключения.
    //решения.
    //вариант 1 (чистый ООП: переделать метод должен возвращать int или enum)
    //вариант 2 - java решение: при описании метода ввести декларирование
    //метод генерирует исключение
    private class DefaultValidator implements IMyValidator
    {
        @Override
        public boolean isValid(MyItem item) 
        {
            if (item.id==0)
            {
              throw new IllegalStateException("Не известное состояние"); 
            }
            return true;
        }
    }
    
}
