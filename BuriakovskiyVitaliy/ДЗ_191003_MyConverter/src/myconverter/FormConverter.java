package myconverter;

import java.awt.Container;
import java.awt.FlowLayout;
import java.text.DecimalFormat;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FormConverter  {

    private JPanel panel;
    public JFrame jf;

    public FormConverter() {
        jf = new JFrame();
        jf.setTitle("Конвертер");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //jf.setLayout(new FlowLayout());
        jf.setLayout(new BoxLayout(jf.getContentPane(), BoxLayout.Y_AXIS));

        PanelConvertera kmToMl = new PanelConvertera() {
            @Override
            public String formula(Float data1, Float data2) {
                data1 = (float) (data1 / 1.6);
                return String.valueOf(data1);
            }
        };
        jf.add(kmToMl.creat("km.", "Convert", "ml.", false));

        
        PanelConvertera gradToRad = new PanelConvertera() {
            @Override
            public String formula(Float data1, Float data2) {
                data1 = (float) (data1 * Math.PI / 180);
                return String.valueOf(new DecimalFormat("#0.00").format(data1));
            }
        };
        jf.add(gradToRad.creat("°", "Convert", "r", false));

        
        PanelConvertera gradToForng = new PanelConvertera() {
            @Override
            public String formula(Float data1, Float data2) {
                data1 -= 17;
                return String.valueOf(data1);
            }
        };
        jf.add(gradToForng.creat("°C", "Convert", "F", false));

        
        PanelConvertera gradToKelv = new PanelConvertera() {
            @Override
            public String formula(Float data1, Float data2) {
                data1 = (float) (data1 + 273.15);
                return String.valueOf(data1);
            }
        };
        jf.add(gradToKelv.creat("°C", "Convert", "K", false));

        
        PanelConvertera forngToKelv = new PanelConvertera() {
            @Override
            public String formula(Float data1, Float data2) {
                data1 = (float) (data1 * 255.92777777778);
                return String.valueOf(new DecimalFormat("#0.00").format(data1));
            }
        };
        jf.add(forngToKelv.creat("F", "Convert", "K", false));

        
        PanelConvertera usdToUan = new PanelConvertera() {
            @Override
            public String formula(Float data1, Float data2) {
                data1 = (float) (data1 * data2);
                return String.valueOf(data1);
            }
        };
        jf.add(usdToUan.creat("$", "Convert", "грн.", true));

    }
}
