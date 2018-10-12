/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session8_multiThread.deadlock;

/**
 *
 * @author maithicamnhung
 */
public class Friend {

    private String name;

    public Friend(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public synchronized void bow(Friend bower) {
        System.out.format("%s: %s"
                + "  must bowed to me!%n",
                this.name, bower.getName());
        bower.bowBack(this);
    }

    public synchronized void bowBack(Friend bower) {
        System.out.format("%s: %s"
                + " has bowed back to me!%n",
                this.name, bower.getName());
    }
}
