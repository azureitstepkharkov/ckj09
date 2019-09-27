package OOP.pak1;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Files {
    public byte[] fileReader() throws IOException {
        JFrame frame = new JFrame();
        JFileChooser fileOpen = new JFileChooser();
        fileOpen.showOpenDialog(frame);
        return fileReader(String.valueOf(fileOpen.getSelectedFile()));
    }

    public byte[] fileReader(String path) throws IOException {
        FileInputStream readFile = new FileInputStream(path);
        byte[] bInput = new byte[readFile.available()];
        readFile.read(bInput);

        countOne(bInput);
        return bInput;
    }

//    public void fileWriter(byte[] data) throws IOException {
//        JFrame frame = new JFrame();
//        JFileChooser fileSave = new JFileChooser();
//        fileSave.showSaveDialog(frame);
//        fileWriter(data, String.valueOf(fileSave.getSelectedFile()));
//
//    }

    public void fileWriter(byte[] data, String path) throws IOException, MyException {
        if (path == "") {
            throw new MyException(0);
        } else {

            FileOutputStream writeFile = new FileOutputStream(path);
            writeFile.write(data);
            writeFile.close();
        }

    }

    void countOne(byte[] binaryFile) {
        int count = 0;
        byte b;
        for (int i = 0; i < binaryFile.length; i++) {
            b = binaryFile[i];
            for (int j = 0; j < 255; j++) {
                if (b % 2 != 0) count++;
                b = (byte) (b >>> 1);
                if (b == 0) break;
            }
        }
        System.out.format("!!!!!Количестов единиц в бинарном файле равно %d\n", count);
    }

}

class MyException extends Exception {
    private int detail;

    MyException(int a) {
        this.detail = a;
    }

    public String toString() {
        return "Путь к файлу отсутствует";
    }

}
