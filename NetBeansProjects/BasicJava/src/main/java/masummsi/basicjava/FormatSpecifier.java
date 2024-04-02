/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package masummsi.basicjava;

/**
 *
 * @author masum
 */
public class FormatSpecifier {

    public static void main(String [] args ){
        
     /**
     * %b    boo
     * %c  char     single character 
     * %d  int      single integer
     * %f | %1f     float or double     signed decimal 
     * %e  double    exponential format 
     * %o  int      octal 
     * %u  int      unsigned value 
     * %x  int      hex value 
     * %id   int  long decimal 
     * %s array of char      sequence of char 
     */  
     
       boolean b;  
       float f; 
       double d; 
       char c;  
       
       //dynamic initialization 
       long l= 23338888;
       byte e = 111;
       int i = 34343;
       short s = 323;
       
       
       b= true;
       c= 'a';
       d= 12.5;
       f= 3.8f; // Always write f on float value.
       
       
       System.out.printf("Boolean = %b\n",b); //use printf function
       System.out.println("Float = "+f);
       System.out.println("Byte = "+e);
       System.out.printf("Int = %d\n",i); //use printf function
       System.out.printf("Short = %d\n",s); //use printf function
       System.out.printf("Character = %c\n",c); //use printf function
       System.out.println("Long = "+l);
       System.out.printf("Double = %.1f\n",d); //use printf function (*.1 used for precison value*)
    }    
}
  