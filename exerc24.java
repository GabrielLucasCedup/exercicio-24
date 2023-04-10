import java.util.Scanner; 
public class exerc24{
    public static void main(String[] args){
        String op = "S";
        Scanner read = new Scanner(System.in);
        int[] num = new int[30];
        int i = 1;
        String numstr;
        boolean ver = true;
        while(op.equals("S")){
            while (ver) {
                System.out.print("Digite um número: ");
                numstr = read.next();
                if (isInteger(numstr)) {
                    ver = false;
                    num[i] = Integer.parseInt(numstr);
                } else {
                    System.out.println("Caractere inválido!");
                }
            }
            System.out.println();
            System.out.println("Digite 's' se deseja continuar");
            System.out.print("Ou digite outro caracter para encerrar: ");
            op = (read.next()).toUpperCase();
            System.out.println();
            i++;
            ver = true;
        }
        for(int j=1;j<i;j++){
            if(num[j] > 0){
                System.out.println(num[j]+" é número positivo");
            }else
            if(num[j]<0){
                System.out.println(num[j]+" é número negativo");
            }else{
                System.out.println(num[j]+" é número zero");
            }
        }
    }
  
    private static boolean isInteger(String str) {
        return str != null && str.matches("[+-]?[0-9]+");
    }

}