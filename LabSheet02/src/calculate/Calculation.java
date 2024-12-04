
package calculate;

import javax.swing.JOptionPane;



public class Calculation {
    public static double CalculateBill(Double selectedPackage,Double Second){
      double Bill = 0;
      double finalBill = 0;
      if (selectedPackage == 1){
          Bill = (2 * Second)+2500;
      }
      else if (selectedPackage == 2){
          Bill = (3 * Second)+1500;
      }
      else if (selectedPackage == 3){
          Bill = (3.5 * Second)+1000;
      }
      else if (selectedPackage == 4){
          Bill = (4 * Second)+1200;
      }
      else if(selectedPackage == 5){
          Bill = (5 * Second)+1800;
      }
      else{
         JOptionPane.showMessageDialog(null, "Error");
      }
      
      if(Bill > 5000){
         finalBill = Bill - (Bill * 0.1);
      }
      if (Bill < 1000){
          finalBill = Bill + (Bill * 0.05);
      }
      return finalBill;
}
}
