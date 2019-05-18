package logica;

import vista.frmPista;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Component;

/**
 * Clase Hilo, constructor y método que genera el movimiento de caballos.
 *
 * @author Wilmar Santiago Duque valencia / Documento: 1152707680
 * @author Kevin García Hincapié / Documento: 1018350636
 * @since paquete logica
 * @version Carrera Caballos V4.0
 */
public class hilo extends Thread {

    public String animal;
    public int limite;
    public JLabel label;

    public hilo(String animal, int limite, JLabel label) {
        this.animal = animal;
        this.limite = limite;
        this.label = label;
        setName(animal);
        frmPista.frm.ButInicioC.setEnabled(false);
    }//Constructor del hilo

    @Override
    public void run() {
        double t1 = 0, t2 = 0, t3 = 0, t4 = 0, t5 = 0, t6 = 0, t7 = 0, 
               ti1 = 0, ti2 = 0, ti3 = 0, ti4 = 0, ti5 = 0, ti6 = 0, ti7 = 0;
        float time1 = 0, time2 = 0, time3 = 0, time4 = 0, time5 = 0, time6 = 0, time7 = 0;
        String c1 = "", c2 = "", c3 = "", c4 = "", c5 = "", c6 = "", c7 = "";
        int posicion = 0;
        
        
        if (getName().equals("Jarvis")) {
            ti1 = System.currentTimeMillis();
            label.setLocation(0, 0);
            while (label.getLocation().x < 1420) {
                t1 = System.currentTimeMillis();
                try {
                    posicion = (int) (Math.random() * 30 + 1);
                    label.setLocation(label.getLocation().x + posicion, 280);
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                }
            }
            time1 = (float) ((t1 - ti1) / 1000);
            c1 = (animal + "  -  " + time1 + " segundos\n");
        }//
        
        if (getName().equals("Trueno")) {
            ti2 = System.currentTimeMillis();
            label.setLocation(0, 0);
            while (label.getLocation().x < 1420) {
                t2 = System.currentTimeMillis();
                try {
                    posicion = (int) (Math.random() * 30 + 1);
                    label.setLocation(label.getLocation().x + posicion, 60);
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                }
            }
            time2 = (float) ((t2 - ti2) / 1000);
            c2 = (animal + "  -  " + time2 + " segundos\n");
        }//

        if (getName().equals("Zeus")) {
            ti3 = System.currentTimeMillis();
            label.setLocation(0, 0);
            while (label.getLocation().x < 1420) {
                t3 = System.currentTimeMillis();
                try {
                    posicion = (int) (Math.random() * 30 + 1);
                    label.setLocation(label.getLocation().x + posicion, 170);
                    Thread.sleep(50);
                } catch (InterruptedException e) {

                }
            }
            time3 = (float) ((t3 - ti3) / 1000);
            c3 = (animal + "  -  " + time3 + " segundos\n");
        }//
        
        //4
        if (getName().equals("Neron")) {
            ti4 = System.currentTimeMillis();
            label.setLocation(0, 0);
            while (label.getLocation().x < 1420) {
                t4 = System.currentTimeMillis();
                try {
                    posicion = (int) (Math.random() * 30 + 1);
                    label.setLocation(label.getLocation().x + posicion, 400);
                    Thread.sleep(50);
                } catch (InterruptedException e) {

                }
            }
            time4 = (float) ((t4 - ti4) / 1000);
            c4 = (animal + "  -  " + time4 + " segundos\n");
        }
        
        //5
        if (getName().equals("Anafea")) {
            ti5 = System.currentTimeMillis();
            label.setLocation(0, 0);
            while (label.getLocation().x < 1420) {
                t5 = System.currentTimeMillis();
                try {
                    posicion = (int) (Math.random() * 30 + 1);
                    label.setLocation(label.getLocation().x + posicion, 525);
                    Thread.sleep(50);
                } catch (InterruptedException e) {

                }
            }
            time5 = (float) ((t5 - ti5) / 1000);
            c5 = (animal + "  -  " + time5 + " segundos\n");
        }
        
        //6
        if (getName().equals("Cinforoso")) {
            ti6 = System.currentTimeMillis();
            label.setLocation(0, 0);
            while (label.getLocation().x < 1420) {
                t6 = System.currentTimeMillis();
                try {
                    posicion = (int) (Math.random() * 30 + 1);
                    label.setLocation(label.getLocation().x + posicion, 640);
                    Thread.sleep(50);
                } catch (InterruptedException e) {

                }
            }
            time6 = (float) ((t6 - ti6) / 1000);
            c6 = (animal + "  -  " + time6 + " segundos\n");
        }
        
        //7
        if (getName().equals("Epifania")) {
            ti7 = System.currentTimeMillis();
            label.setLocation(0, 0);
            while (label.getLocation().x < 1420) {
                t7 = System.currentTimeMillis();
                try {
                    posicion = (int) (Math.random() * 30 + 1);
                    label.setLocation(label.getLocation().x + posicion, 755);
                    Thread.sleep(50);
                } catch (InterruptedException e) {

                }
            }
            time7 = (float) ((t7 - ti7) / 1000);
            c7 = (animal + "  -  " + time7 + " segundos\n");
        }
        
        
        //Retorna las posiciones al panel
        String posiciones = frmPista.frm.Resultados.getText() + (c1 + c2 + c3 + c4 + c5 + c6 + c7);
        frmPista.frm.Resultados.setText(posiciones);
        frmPista.frm.ButInicioC.setEnabled(true);
    }

}
