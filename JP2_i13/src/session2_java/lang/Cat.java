/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session2_java.lang;

/**
 *
 * @author maithicamnhung
 */
public class Cat{
    public String name;
    public int age;
    private String ms;

    public Cat(String ms) {
        this.ms = ms;
    }

    public Cat() {
        this.name = "";
        this.age = 1;
    }
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name, int age, String ms) {
        this.name = name;
        this.age = age;
        this.ms = ms;
    }

    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMs() {
        return ms;
    }
    
    private void changeName(String name){
        this.name = name;
    }
    
}
