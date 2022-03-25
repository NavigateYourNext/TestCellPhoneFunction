package util;

import javax.swing.*;
public class ValidatePhoneNumber {
    public static void main(String[] args){
        String cellPhoneNumber;
        cellPhoneNumber = JOptionPane.showInputDialog("Please enter your cellPhone number =) ");
        if(validateSAPhoneNumber(cellPhoneNumber)){
            JFrame frame = new JFrame("Input Dialog");
            JOptionPane.showMessageDialog(frame,"CellPhone number is valid =)");
            System.exit(0);
        }else{
            JFrame frame = new JFrame("Output Dialog");
            JOptionPane.showMessageDialog(frame,"CellPhone number is invalid =(");
            System.exit(0);
        }
    }

    public static boolean validateSAPhoneNumber(String cellPhoneNumber){
        if(cellPhoneNumber.matches("^((?:\\+27|27)|0)(\\d{2})-?(\\d{3})-?(\\d{4})$")){
            return true;
        }else{
            return false;
        }
    }
}
