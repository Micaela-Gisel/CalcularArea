package app;

import java.util.Scanner;

public  class CalcularArea {
       
         private static Double areaR = null;
         private static Double areaT = null;
            
    public CalcularArea() {
        //super();
       
    }
        public static Double AreaR (Double base, Double altura){
            
            areaR = base * altura; 
            return areaR;
        }
        public static  Double AreaT (Double areaR){
         areaT = areaR / 2 ;
        return areaT;
}

  
}

