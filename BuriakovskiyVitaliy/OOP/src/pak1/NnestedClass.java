package OOP.pak1;

import java.io.IOException;

public class NnestedClass {

    void demo() throws IOException {
        byte[] b = new Files().fileReader("E:/1.txt");
        byte[] voltageSection = new byte[b.length / 2];
        byte[] amperageSection = new byte[b.length / 2];
        for (int i = 0; i < b.length; i += 2) {
            voltageSection[i / 2] = b[i];
            amperageSection[i / 2] = b[i + 1];
        }
        Accumulator.Li_Ion accumulator = new Accumulator.Li_Ion(voltageSection, amperageSection);
        accumulator.addListener(new Listener() {
            @Override
            public void doEvent() {
                System.out.println("Аккумулятор заряжен. Отключаем зарядное.");
                byte[] b = new byte[accumulator.amperageSection.length * 2];
                for (int i = 0; i < accumulator.amperageSection.length; i++) {
                    b[i * 2] = accumulator.amperageSection[i];
                    b[i * 2 + 1] = accumulator.voltageSection[i];
                }
                try {
                    new Files().fileWriter(b, "");
                }catch (MyException e) {
                    System.out.println("Путь к файлу отсутствует");
                }
                catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        accumulator.charge();
    }

}