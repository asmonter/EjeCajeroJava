import java.util.*;

public class main {

    public static String printMenu(){
        Scanner sc= new Scanner(System.in);
        System.out.println("\nMenu: Enter\nSalir: q");
        String res = sc.nextLine();
        return res;
    }

    public static String printOptions(){
        Scanner sc= new Scanner(System.in);
        System.out.println("1. Consultar Saldo \n2. Retirar Saldo \n3. Hisorico de Movimientos");
        String res = sc.nextLine();
        return res;
    }

    public static void main(String[] args){
        Validations val = new Validations();
        Boolean password = val.veryPass();

        if (password){
            while (true){
                String res = printMenu();
                if (res.toLowerCase(Locale.ROOT).equals("q")){
                    break;
                }
                res = printOptions();
                switch (res) {
                    case "1":
                        val.currentBalance();
                        break;
                    case "2":
                        val.getMoney();
                        break;
                    case "3":
                        val.history();
                        break;
                    default:
                        System.out.println("no valido");
                        break;
                }
                System.out.println("\n");
            }
        }
    }
}
