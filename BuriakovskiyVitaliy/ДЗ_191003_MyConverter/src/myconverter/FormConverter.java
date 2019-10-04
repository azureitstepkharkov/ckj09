package myconverter;

import java.awt.FlowLayout;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FormConverter extends JFrame {

    private JPanel panel;

    public FormConverter() {
        this.setSize(350, 300);
        this.setTitle("Конвертер");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        PanelConvertera kmToMl = new PanelConvertera() {
            @Override
            public String formula(Float data1, Float data2) {
                data1 = (float) (data1 / 1.6);
                return String.valueOf(data1);
            }
        };
        this.add(kmToMl.creat("km.", "Convert", "ml.", false));

        
        PanelConvertera gradToRad = new PanelConvertera() {
            @Override
            public String formula(Float data1, Float data2) {
                data1 = (float) (data1 * Math.PI / 180);
                return String.valueOf(new DecimalFormat("#0.00").format(data1));
            }
        };
        this.add(gradToRad.creat("°", "Convert", "r", false));

        
        PanelConvertera gradToForng = new PanelConvertera() {
            @Override
            public String formula(Float data1, Float data2) {
                data1 = (float) (data1 - 17);
                return String.valueOf(data1);
            }
        };
        this.add(gradToForng.creat("°C", "Convert", "F", false));

        
        PanelConvertera gradToKelv = new PanelConvertera() {
            @Override
            public String formula(Float data1, Float data2) {
                data1 = (float) (data1 + 273.15);
                return String.valueOf(data1);
            }
        };
        this.add(gradToKelv.creat("°C", "Convert", "K", false));

        
        PanelConvertera forngToKelv = new PanelConvertera() {
            @Override
            public String formula(Float data1, Float data2) {
                data1 = (float) (data1 * 255.92777777778);
                return String.valueOf(new DecimalFormat("#0.00").format(data1));
            }
        };
        this.add(forngToKelv.creat("F", "Convert", "K", false));

        
        PanelConvertera usdToUan = new PanelConvertera() {
            @Override
            public String formula(Float data1, Float data2) {
                data1 = (float) (data1 * data2);
                return String.valueOf(data1);
            }
        };
        this.add(usdToUan.creat("$", "Convert", "грн.", true));

    }
}
