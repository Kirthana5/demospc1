/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacedemos;

/**
 *
 * @author KIRTHANA
 */
public class multipleinheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //obj creation using class
        test1 o=new test1();
        o.display();//common method for both INTERFACES
        o.dis1();//method of INTERFACE 1
        o.dis2();//method of INTERFACE 2
        o.display1();//concrete method in CLASS
        
        //obj creation using interface 1
        one o1=new test1();
        o1.display();//---->its own method
        o1.dis1();   //---->its own method
        //o1.display1();------>can't call class' method
        //o1.dis2();------>can't call other interface's method
       
        
        //obj creation using interface 2
        two o2=new test1();
        o2.display();//---->its own method
        o2.dis2();   //---->its own method
        //o2.display1();------>can't call class' method
        //o2.dis1();------>can't call other interface's method
    }
    
}
/*class a  -------->DIAMOND PROBLEM
{
    void display()
    {
        System.out.println("A");
    }

}
class b
{
    void display()
    {
        System.out.println("A");
    }

}
class c extends a,b //------>this is not possible in JAVA,hence we move
{                            for INTERFACE
}*/

interface one
{
    void display();
    void dis1();
}
interface two
{
    void display();
    void dis2();
}
class test1 implements one,two
{
    public void display()
    {
        System.out.println("Common method for Interface 1,Interface 2");
    }
    public void dis1()
    {
        System.out.println("Interface 1");
    }
    public void dis2()
    {
        System.out.println("Interface 2");
    }
    public void display1()
    {
        System.out.println("Method of class");
    }
    
}