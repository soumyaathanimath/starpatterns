/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package starpatterns;

/**
 *
 * @author dell1
 */
public class Starpatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /*public static void main(String[] args) {
            for(int i=1;i<5;i++)
            {
                for(int j=1;j<5;j++)
                {
                    if(i<=j)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                System.out.println("");
            }
    }*/
            for(int i=1;i<5;i++)
            {
                for(int j=1;j<5;j++)
                {
                    if(i+j>5)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                System.out.println("");
            }
    }
    }
    
