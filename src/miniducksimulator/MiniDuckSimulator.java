/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miniducksimulator;

/**
 *
 * @author production
 */
public class MiniDuckSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        
        mallard.performQuack();
        mallard.performFly();
    }
}
