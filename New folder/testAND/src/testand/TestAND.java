/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testand;

/**
 *
 * @author Lk09Nu3UTY
 */
public class TestAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int i = 0;
        int j = 10;
        boolean test = false;
        //demo &&
        test = (i > 10) && (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
        //demo &
        test = (i >10) & (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
                
      
    }
    
}
