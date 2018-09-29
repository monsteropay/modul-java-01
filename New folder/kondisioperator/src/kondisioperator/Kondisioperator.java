/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kondisioperator;

/**
 *
 * @author Lk09Nu3UTY
 */
public class Kondisioperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String status = "";
        int grade = 80;
        //mendapatkan status pelajar
        status = (grade >= 60) ? "passsed":"fail";
        //print status
        System.out.println( status);
    }
    
}
