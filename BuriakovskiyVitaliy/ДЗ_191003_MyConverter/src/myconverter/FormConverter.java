package myconverter;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FormConverter {

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
            public float formula(Float data1, Float data2) {
               return (float) (data1 / 1.6);
            }

            @Override
            public float formulaRevers(Float data1, Float data2) {
                return (float) (data1 * 1.6);
            }
        };
        jf.add(kmToMl.creat("km.", "Convert", "ml.", false));

        PanelConvertera gradToRad = new PanelConvertera() {
            @Override
            public float formula(Float data1, Float data2) {
                return (float) (data1 * Math.PI / 180);
            }

            @Override
            public float formulaRevers(Float data1, Float data2) {
                    return (float) (data1 * 180 / Math.PI);
            }
        };
        jf.add(gradToRad.creat("°", "Convert", "r", false));

        PanelConvertera gradToForng = new PanelConvertera() {
            @Override
            public float formula(Float data1, Float data2) {
                 return data1 - 17;
            }

            @Override
            public float formulaRevers(Float data1, Float data2) {
                   return data1 + 17;
            }
        };
        jf.add(gradToForng.creat("°C", "Convert", "F", false));

        PanelConvertera gradToKelv = new PanelConvertera() {
            @Override
            public float formula(Float data1, Float data2) {
                return (float) (data1 + 273.15);
            }

            @Override
            public float formulaRevers(Float data1, Float data2) {
                return (float) (data1 - 273.15);
            }
        };
        jf.add(gradToKelv.creat("°C", "Convert", "K", false));

        PanelConvertera forngToKelv = new PanelConvertera() {
            @Override
            public float formula(Float data1, Float data2) {
                return (float) (data1 * 255.92777777778);
            }

            @Override
            public float formulaRevers(Float data1, Float data2) {
                return (float) (data1 / 255.92777777778);
            }
        };
        jf.add(forngToKelv.creat("F", "Convert", "K", false));

        PanelConvertera usdToUan = new PanelConvertera() {
            @Override
            public float formula(Float data1, Float data2) {
                return (float) (data1 * data2);
            }

            @Override
            public float formulaRevers(Float data1, Float data2) {
                return (float) (data1 / data2);
            }
        };
        jf.add(usdToUan.creat("$", "Convert", "грн.", true));

    }
}
