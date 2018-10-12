/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session11_DesignPattern.factoryPattern;

/**
 *
 * @author maithicamnhung
 */
public class FactoryPatternExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VehicelFactory vehicleFactory = new  VehicelFactory();
        Vehicle carObj = vehicleFactory.getVehicle("car");
        carObj.move();
        
        Vehicle truckObj = vehicleFactory.getVehicle("Truck");
        truckObj.move();
        
        Vehicle bike = vehicleFactory.getVehicle("BIKE");
        bike.move();
        
    }
}
