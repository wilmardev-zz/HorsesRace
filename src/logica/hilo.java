package logica;

import vista.frmPista;
import javax.swing.JLabel;

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
    public int posicionY;

    public hilo(String animal, int limite, JLabel label, int posicionY) {
        this.animal = animal;
        this.limite = limite;
        this.label = label;
        this.posicionY = posicionY;
        setName(animal);
        frmPista.frm.ButInicioC.setEnabled(false);
    }

    @Override
    public void run() {
        double finalTime = 0, initTime;
        float raceTime;
        String result;
        int posicion;

        initTime = System.currentTimeMillis();
        label.setLocation(0, 0);
        while (label.getLocation().x < 1100) {
            finalTime = System.currentTimeMillis();
            try {
                posicion = (int) (Math.random() * 30 + 1);
                label.setLocation(label.getLocation().x + posicion, posicionY);
                Thread.sleep(50);
            } catch (InterruptedException e) {
            }
        }
        raceTime = (float) ((finalTime - initTime) / 1000);
        result = (animal + "  -  " + raceTime + " segundos\n");

        //Retorna las posiciones al panel
        String posiciones = frmPista.frm.Resultados.getText() + result;
        frmPista.frm.Resultados.setText(posiciones);
        frmPista.frm.ButInicioC.setEnabled(true);
    }

}
