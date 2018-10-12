/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session11_DesignPattern.composition;

public class Student {
    //composition has-a relationship 
    private Course course;

    public Student() {
        this.course = new Course();
        course.setScore(1000);
    }

    public long getScore() {
        return course.getScore();
    }

    public static void main(String[] args) {
        Student p = new Student();
        System.out.println(p.getScore());
    }
}
