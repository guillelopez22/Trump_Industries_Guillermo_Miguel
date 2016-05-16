/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author Miguel A. Ardon E
 */
public class Hilo implements Runnable {

    int tiempo;
    Lista_Materiales lista_materiales;
    Lista_Pilas lp_materiales;
    JProgressBar bara= new JProgressBar();
    int i=1;

    public Hilo(Producto producto, Lista_Pilas lp_materiales,JProgressBar bara) {
        this.tiempo = producto.getTiempo_esamblado();
        this.lista_materiales = producto.getMateriales();
        this.lp_materiales = lp_materiales;
        this.bara=bara;
    }

    @Override
    public void run() {
        System.out.println(tiempo+"tiempo");
        System.out.println(i+"conatdasd");
        while (i != tiempo) {
            bara.setValue(i);
            bara.repaint();
            i++;
            try {
                Thread.sleep(this.tiempo);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
            if(i==tiempo){
                bara.setValue(100);
                JOptionPane.showMessageDialog(null,"Se termino de ensamblar!!!");
                bara.setValue(0);
                break;
            }
        }
    }

}