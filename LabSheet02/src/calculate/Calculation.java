package calculate;

import javax.swing.JOptionPane;

public class Calculation {
    public static double CalculateBill(int selectedPackage, double seconds) {
        double bill = 0;
        double finalBill;

        // Calculate the base bill based on the selected package
        switch (selectedPackage) {
            case 1 -> bill = (2 * seconds) + 2500;
            case 2 -> bill = (3 * seconds) + 1500;
            case 3 -> bill = (3.5 * seconds) + 1000;
            case 4 -> bill = (4 * seconds) + 1200;
            case 5 -> bill = (5 * seconds) + 1800;
            default -> {
                JOptionPane.showMessageDialog(null, "Error: Invalid Package");
                return 0; // Exit early if an invalid package is selected
            }
        }

        // Apply discounts or additional charges
        if (bill > 5000) {
            finalBill = bill - (bill * 0.1); // 10% discount
        } else if (bill < 1000) {
            finalBill = bill + (bill * 0.05); // 5% additional charge
        } else {
            finalBill = bill; // No change for bills between 1000 and 5000
        }

        return finalBill;
    }
}
