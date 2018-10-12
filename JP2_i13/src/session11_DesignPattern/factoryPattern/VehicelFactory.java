/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session11_DesignPattern.factoryPattern;

/**
 *
 * @author maithicamnhung
 */
public class VehicelFactory {
    public Vehicle getVehicle(String verhicleType){
        if(verhicleType == null)
            return null;
        if(verhicleType.equalsIgnoreCase("Car"))
            return new Car();
        else if(verhicleType.equalsIgnoreCase("Truck"))
            return new Truck();
        else if(verhicleType.equalsIgnoreCase("bike"))
            return new Bike();
        return null;
            
    }
}
