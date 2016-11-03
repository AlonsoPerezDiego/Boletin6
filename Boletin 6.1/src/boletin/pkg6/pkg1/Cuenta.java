package boletin.pkg6.pkg1;

import javax.swing.JOptionPane;

public class Cuenta {
    
    private String nombre1, nCuenta1, nombre2, nCuenta2;
    private double saldo1, saldo2;
    private int select;
    private boolean resultado;
    
    public Cuenta(){
        nombre1 = "Aquiles Castro ";
        nCuenta1 = "123456asdf";
        nombre2 = "Elba Calao";
        nCuenta2 = "987654asdf";
    }
    
    public Cuenta(double s1, double s2, int seleccion){
        saldo1=s1;
        saldo2=s2;
        select=seleccion;
    }
    
    public void setSaldo1(){
        saldo1 = Double.parseDouble(JOptionPane.showInputDialog("El saldo de la cuenta de Aquiles."));
        saldo2 = ((saldo1-(Math.pow((Math.pow(saldo1, 2))-4*1*saldo1, 1/2))/(2*1)));
        while(saldo1<=0|saldo2<=0){
            JOptionPane.showMessageDialog(null, resultado = false);
            saldo1 = Double.parseDouble(JOptionPane.showInputDialog("El saldo de la cuenta de Aquiles."));
            saldo2 = ((saldo1-(Math.pow((Math.pow(saldo1, 2))-4*1*saldo1, 1/2))/(2*1)));
            
        }
        JOptionPane.showMessageDialog(null, resultado = true);
    }
    
    public void setSaldo2(){
        saldo2 = Double.parseDouble(JOptionPane.showInputDialog("El saldo de la cuenta de Elba."));
        saldo1 = ((saldo2-(Math.pow((Math.pow(saldo2, 2))-4*1*saldo2, 1/2))/(2*1)));
        
        while(saldo1<=0|saldo2<=0){
            JOptionPane.showMessageDialog(null, resultado = false);
            saldo2 = Double.parseDouble(JOptionPane.showInputDialog("El saldo de la cuenta de Elba."));
            saldo1 = ((saldo2-(Math.pow((Math.pow(saldo2, 2))-4*1*saldo2, 1/2))/(2*1)));
            
        }
        JOptionPane.showMessageDialog(null, resultado = true);
    }

    public String getNombre1() {
        return nombre1;
    }

    public String getnCuenta1() {
        return nCuenta1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public String getnCuenta2() {
        return nCuenta2;
    }

    public double getSaldo() {
        return saldo1;
    }

    public double getSaldo2() {
        return saldo2;
    }
    
    public void ingreso1(double ing1){
        
        while(ing1<0){
            JOptionPane.showMessageDialog(null, resultado = false);
            ing1 =  Double.parseDouble(JOptionPane.showInputDialog("Ingreso en la cuenta de Aquiles."));
            
        }
        JOptionPane.showMessageDialog(null, "El saldo de Aquiles es de " + saldo1+ing1 + "€.");
        JOptionPane.showMessageDialog(null, resultado = true);
    }
    
    public void ingreso2(double ing2){

        while(ing2<0){
            JOptionPane.showMessageDialog(null, resultado = false);
            ing2 = Double.parseDouble(JOptionPane.showInputDialog("Ingreso en la cuenta de Elba."));
            
        }
        JOptionPane.showMessageDialog(null, "El saldo de Elba es de " + saldo2+ing2 + "€.");
        JOptionPane.showMessageDialog(null, resultado = true);
    }
    
    public void reintegro1(double rein1){
     
        while(rein1<0){
            JOptionPane.showMessageDialog(null, resultado = false);
            rein1 = Double.parseDouble(JOptionPane.showInputDialog("Reintegro en la cuenta de Aquiles."));
            
        }
        while((saldo1-rein1)<0){
                JOptionPane.showMessageDialog(null, resultado = false);
                rein1 = Double.parseDouble(JOptionPane.showInputDialog("Reintegro en la cuenta de Aquiles."));
                
        }
        JOptionPane.showMessageDialog(null, "El saldo de Aquiles es de " + (saldo1-rein1) + "€.");
        JOptionPane.showMessageDialog(null, resultado = true);
        
    }
    
    public void reintegro2(double rein2){

        while(rein2<0){
            JOptionPane.showMessageDialog(null, resultado = false);
            rein2 = Double.parseDouble(JOptionPane.showInputDialog("Reintegro en la cuenta de Elba."));
            
        }
        while((saldo2-rein2)<0){
            JOptionPane.showMessageDialog(null, resultado = false);
            rein2 = Double.parseDouble(JOptionPane.showInputDialog("Reintegro en la cuenta de Elba.")); 
            
        }
        
        JOptionPane.showMessageDialog(null, "El saldo de Elba es de " + (saldo2-rein2) + "€.");
        JOptionPane.showMessageDialog(null, resultado = true);
    }
    
    public void transferenciaAE(double trans){

        while(trans>saldo1){
            JOptionPane.showMessageDialog(null, resultado = false);
            trans = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad que quieres transferir de Aquiles a Elba."));
            
        }
        JOptionPane.showMessageDialog(null, "Quedan " + (saldo1-trans) + "€ en la cuenta de Aquiles y " + saldo2+trans + "€ en la cuenta de Elba tras una transferencia de " + trans + "€.");
        JOptionPane.showMessageDialog(null, resultado = true);
        
    }
    
    public void transferenciaEA(double trans){

        while(trans>saldo2){
            JOptionPane.showMessageDialog(null, resultado = false);
            trans = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad que quieres transferir de Elba a Aquiles."));
            
        }
        JOptionPane.showMessageDialog(null, "Quedan " + (saldo2-trans) + "€ en la cuenta de Elba y " + saldo1+trans + "€ en la cuenta de Aquiles tras una transferencia de " + trans + "€.");
        JOptionPane.showMessageDialog(null, resultado = true);
    }
   
}