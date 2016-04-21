/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoptions2016;
import textio.*;
import OptionsLibrary.*; //Aca se importa el Jar que tiene todos los modelos de opciones


/**
 *
 * @author Paulino
 */

public class ProjectOptions2016 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int model;
        int tipoEjercicio;
        int tipoContrato;
        int callPut;
        double underlyingValue;
        double strike;
        double daysToExpiration;
        double vlt;
        double tasa;
        int steps;
/*        
        while (true) {
         System.out.print("Enter Model (1 a 4): ");
         model = TextIO.getlnInt();
         
         if (model >=1  & model <=4)
            break;
         System.out.println("  Please try again.");
      }
        while (true) {
         System.out.print("Enter Tipo Ejercicio (0 European, 1 American): ");
         tipoEjercicio = TextIO.getlnInt();
         
         if (tipoEjercicio == 0 | tipoEjercicio == 1)
            break;
         System.out.println("  Please try again.");
    
    }
        while (true) {
         System.out.print("Enter Tipo Contrato (0 Equity, 1 Futures): ");
         tipoContrato = TextIO.getlnInt();
         
         if (tipoContrato == 0 | tipoContrato == 1)
            break;
         System.out.println("  Please try again.");
    }
         while (true) {
         System.out.print("Enter Call or Put (0 Call, 1 Put): ");
         callPut = TextIO.getlnInt();
         
         if (callPut == 0 | callPut == 1)
            break;
         System.out.println("  Please try again.");
    }
          while (true) {
         System.out.print("Enter Underlying Value: ");
         underlyingValue = TextIO.getlnDouble();
         
         if (underlyingValue >= 0)
            break;
         System.out.println("  Please try again.");
    }
           while (true) {
         System.out.print("Enter Strike Price: ");
         strike = TextIO.getlnDouble();
         
         if (strike >= 0)
            break;
         System.out.println("  Please try again.");
    }
             while (true) {
         System.out.print("Enter days to Expiration: ");
         daysToExpiration = TextIO.getlnDouble();
         
         if (daysToExpiration >= 0)
            break;
         System.out.println("  Please try again.");
    }
         while (true) {
         System.out.print("Enter Volatility: ");
         vlt = TextIO.getlnDouble();
         
         if (vlt >= 0)
            break;
         System.out.println("  Please try again.");
    }    
     while (true) {
         System.out.print("Enter short term interest rate: ");
         tasa = TextIO.getlnDouble();
         
         if (tasa >= 0)
            break;
         System.out.println("  Please try again.");
    }
     while (true) {
         System.out.print("Enter Steps: ");
         steps = TextIO.getlnInt();
         
         if (steps > 0)
            break;
         System.out.println("  Please try again.");
    }
/*
     AbstractOption Option=BuildOption(1,tipoEjercicio,tipoContrato, callPut, underlyingValue, strike, daysToExpiration, vlt, tasa,steps);
        
        double v=0;
        switch(ValueToFind){
            case 0: //Prima
                v= Option.getPrima();
                break;
            case 1: //Delta
                v= Option.getDelta();
                break;
            case 2: //Gamma
                v= Option.getGamma();
                break;
            case 3: //Vega
                v= Option.getVega();
                break;
            case 4: //Theta
                v= Option.getTheta();
                break;
            case 5: //Rho
                v= Option.getRho();
                break;
                
        }//end switch
        return v;
    }
    private AbstractOption BuildOption(int Modelo, int TipoEjercicio, int TipoContrato, int CallPut, double UnderlyingValue, double Strike, double DaysToExpiration, double Volatilidad, double Tasa, int Steps){
  */  
  
        AbstractOption Option=new BlackScholesModel(0, 0, 23.0, 25.0, 100, .32, .08);
        Option.CalculateDerivatives();
        System.out.println("Prima:"+ Option.getPrima());
        System.out.println("Delta:"+ Option.getDelta());
        System.out.println("Gamma:"+ Option.getGamma());
        System.out.println("Theta:"+ Option.getTheta());
        System.out.println("Vega:"+ Option.getVega());
        System.out.println("Rho:"+ Option.getRho());
        
        System.out.println();
        System.out.print("CNDF (Apache): " +DistFunctions.CNDF(Math.PI));
        System.out.println();
        System.out.print("PDF (Apache): "+DistFunctions.PDF(Math.PI));
        System.out.println();
        System.out.print("phi (Gauss): "+DistFunctions.phi(Math.PI));
        System.out.println();
        System.out.print("Phi (Gauss): "+DistFunctions.Phi(Math.PI));
        System.out.println();
        System.out.print("CNDF2: "+DistFunctions.CNDF2(Math.PI));
        System.out.println();
        System.out.print("Branch Abril 2: ");
        System.out.println();
    }
     
}
    
