import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Validations {
    float saldo = 1000;
    List movimientos = new ArrayList();
    String passWord = "1235";

    public Boolean veryPass(){
        int numValidation = 0;
        Boolean passwordValid = false;
        while (numValidation < 3){
            Scanner sc= new Scanner(System.in);
            System.out.println("Ingresa Contraseña:");
            String res = sc.nextLine();
            passwordValid = res.equals(this.passWord);
            numValidation++;
            if (passwordValid == true){
                break;
            }
            System.out.println("\n Contraseña Incorrecta");
        }
        return passwordValid;
    }

    public void currentBalance(){
        System.out.println(this.saldo);
    }

    public void getMoney(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Cuanto deceas retirar:");
        String res = sc.nextLine();
        try {
            Float value = Float.parseFloat(res);
            if (value < 1){
                throw new Exception("No se aceptan valores negativos");
            }else if (this.saldo - value < 0){
                throw new Exception("No te alcanza chavo");
            }
            this.saldo = this.saldo - value;
            System.out.println("Retirando "+ res +" te queda " + this.saldo);
            this.movimientos.add("Saldo retirado " + res);
        } catch (Exception e){
            System.out.println("No es posible este valor");
        }
    }

    public void history(){
        this.movimientos.forEach(System.out::println);

    }
}
