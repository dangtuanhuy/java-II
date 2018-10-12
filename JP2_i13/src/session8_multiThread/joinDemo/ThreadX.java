/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session8_multiThread.joinDemo;

/**
 *
 * @author maithicamnhung
 */
public class ThreadX extends Thread{
    
    public ThreadX(String name)
    {
        super(name);
    }
    public void run()
    {
        System.out.println("Tên luồng:"+getName());
        for(int i=0;i<5;i++)
        {
                try {
                    sleep(100); //--Sleep 100ms
                } catch (InterruptedException e) {
                    //--Ko làm gì cả nếu có ngoại lệ
                }
            System.out.println("i="+i);
        }
    }
}  

