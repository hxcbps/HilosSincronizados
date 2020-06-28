/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilossincronizados;

/**
 *
 * @author hxcbps
 */
public class Generar extends Thread {

    @Override
    public void run() {
        boolean vacio = true;
        Consumir consumir = new Consumir(); //Instanciamos la clase consumir   
        System.out.println(vacio);
        for (int i = 0; i <= 5; i++) { //Este contador será la bandera para que sincronicen los dos hilos
            if(i == 5){ // si la variable contador es igual a 5 pasara el valor a false a la clase consumir
                vacio = false;
                consumir.variableConsumir(vacio);//Cambia la variable a false y es tomada por el hilo consumidor
            }
            try {
                Generar.sleep(1000); //tomara 10 segundos para que el hilo consumidor tome la variable como false
            } catch (InterruptedException e) {
                System.out.println("Error en la clase Generar " + e);
            }
        }

    }

}
