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
public class Consumir extends Thread  {
    
    public void variableConsumir(boolean bandera){
        System.out.println(bandera);
    }
    
    @Override
    public void run() {
        
    }
}
