package boletin.pkg6.pkg1;
// @author Diego
import javax.swing.JOptionPane;

public class Boletin61 {

    public static void main(String[] args) {
        
        Cuenta oper = new Cuenta();
        int select2;
        int select = Integer.parseInt(JOptionPane.showInputDialog("Introduce '1' para la cuenta de Aquiles. \nIntroduce '2' para la cuenta de Elba. \nIntroduce '3' para no hacer nada."));
        while((select!=1&&select!=2)&&select!=3){
            JOptionPane.showMessageDialog(null,"Error");
            select = Integer.parseInt(JOptionPane.showInputDialog("Introduce '1' para la cuenta de Aquiles. \nIntroduce '2' para la cuenta de Elba. \nIntroduce '3' para no hacer nada."));
        }
        switch(select){
            
            case 1: JOptionPane.showMessageDialog(null,"Nombre: " + oper.getNombre1() +  "\n Número de cuenta: " + oper.getnCuenta1() );
                    oper.setSaldo1();
                    select2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce '1' para ingreso.\nIntroduce '2' para reintegro.\nIntroduce '3' para transferencia.\nIntroduce cualquier otro número para terminar."));
                    while((select2==1|select2==2)|select2==3){
                        switch(select2){
                            case 1: oper.ingreso1(Double.parseDouble(JOptionPane.showInputDialog("Ingreso en la cuenta de Aquiles.")));
                                    select2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce '1' para ingreso.\nIntroduce '2' para reintegro.\nIntroduce '3' para transferencia.\nIntroduce cualquier otro número para terminar."));
                                    break;
                            case 2: oper.reintegro1(Double.parseDouble(JOptionPane.showInputDialog("Reintegro en la cuenta de Aquiles.")));
                                    select2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce '1' para ingreso.\nIntroduce '2' para reintegro.\nIntroduce '3' para transferencia.\nIntroduce cualquier otro número para terminar."));
                                    break;
                            case 3: oper.transferenciaAE(Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad que quieres transferir de Aquiles a Elba.")));
                                    select2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce '1' para ingreso.\nIntroduce '2' para reintegro.\nIntroduce '3' para transferencia.\nIntroduce cualquier otro número para terminar."));
                                    break;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"Adios");
                    break;
                    
            case 2: JOptionPane.showMessageDialog(null,"Nombre: " + oper.getNombre2() + "\n Número de cuenta: " + oper.getnCuenta1());
                    oper.setSaldo2();
                    select2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce '1' para ingreso.\nIntroduce '2' para reintegro.\nIntroduce '3' para transferencia.\nIntroduce cualquier otro número para terminar."));
                    while((select2==1|select2==2)|select2==3){
                        switch(select2){
                            case 1: oper.ingreso2(Double.parseDouble(JOptionPane.showInputDialog("Ingreso en la cuenta de Elba.")));
                                    select2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce '1' para ingreso.\nIntroduce '2' para reintegro.\nIntroduce '3' para transferencia.\nIntroduce cualquier otro número para terminar."));
                                    break;
                            case 2: oper.reintegro2(Double.parseDouble(JOptionPane.showInputDialog("Reintegro en la cuenta de Elba.")));
                                    select2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce '1' para ingreso.\nIntroduce '2' para reintegro.\nIntroduce '3' para transferencia.\nIntroduce cualquier otro número para terminar."));
                                    break;
                            case 3: oper.transferenciaEA(Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad que quieres transferir de Elba a Aquiles.")));
                                    select2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce '1' para ingreso.\nIntroduce '2' para reintegro.\nIntroduce '3' para transferencia.\nIntroduce cualquier otro número para terminar."));
                                    break;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"Adios");
                    break;
            
            case 3: JOptionPane.showMessageDialog(null,"Adios");
                    break;
                    
        }
        
    }
    
}
