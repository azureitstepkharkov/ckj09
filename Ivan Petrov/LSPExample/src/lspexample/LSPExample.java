package lspexample;

import java.util.List;
import javafx.scene.media.MediaView;

public class LSPExample {

    //LSP нарушено: instanceof + явное приведение типа
    //для вызова overloaded method-а
    /*
    public static void playSound(List<Animal> animals)
    {
        for(Animal a : animals)
        {
            if ( a instanceof  Cat)
            {
                ((Cat)a).playMeaw();
            }
            else if ( a instanceof  Dog)
            {
                ((Dog)a).playBark();
            }
            else if (a instanceof  Elephant)
            {
                ((Elephant)a).playTrumpet();
            }
        }
    }
    */
    public static void playSound(List<IAnimal> animals)
    {
        for(IAnimal a : animals)
        {
            a.playSound();
        }
    }
    /*
    public static void playSound(List<Animal> animals)
    {
        for(Animal a : animals)
        {
           ((IAnimal)a).playSound();
        }
    }
    */
    public static void main(String[] args) 
    {

    }
 
    private interface IAnimal
    {
        void playSound();
    }
    private abstract class Animal implements IAnimal
    {
        int sex;
        String nick;
    }
    private class Cat extends Animal
    {
        private void playMeaw(){}
        @Override
        public void playSound() 
        { 
            playMeaw();
        }
    }
    private class Dog extends Animal{
        private void playBark(){} 
        @Override
        public void playSound() 
        {
            playBark();
        }
    }
    private class Elephant extends Animal{
        private void playTrumpet(){}

        @Override
        public void playSound() 
        {
            playTrumpet();
        }
    }
    /*
    private class Animal
    {
        int sex;
        String nick;
    }
    private class Cat extends Animal
    {
        public void playMeaw(){}
    }
    private class Dog extends Animal{
        public void playBark(){} 
    }
    private class Elephant extends Animal{
        public void playTrumpet(){}
    }
    */
}
