/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANGELO
 */
public class Logaritmo {
    public static double logaritmo(double dnumeros1, double dnumeros2){
        double result = 0.0;
        try{
     
            if(dnumeros1==2){
            result=Math.log(dnumeros2);
            return result;
        }else if(dnumeros1==10){
            result=Math.log10(dnumeros2);
            return result;
        }else{
            result=Math.log1p(dnumeros2);
            return result;
        }
            
        }catch(Exception e){
                System.out.println("ERRO");
                return 0.0;
        }
           
    }
    }

