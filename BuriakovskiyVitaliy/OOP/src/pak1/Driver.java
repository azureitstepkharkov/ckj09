package OOP.pak1;

import java.io.IOException;
//Сигма адванс

public class Driver {
    public static void main(String[] args) throws IOException {
        Factory factory = new Factory();
        Object manTgsTanker = factory.creat("MAN_TGS_TANKER");
        ((CargoCar) manTgsTanker).hookTrailer(100, 200);
        ((Cargo) manTgsTanker).load();
        ((TankerCar) manTgsTanker).run();
        ((Car) manTgsTanker).stop();

        new NnestedClass().demo();
    }

}
