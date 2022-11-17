import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b,c;

        System.out.print("Lutfen 1. sayi giriniz: ");
        a = input.nextInt();

        System.out.print("Lutfen 2. sayi giriniz: ");
        b = input.nextInt();

        System.out.print("Lutfen 3. sayi giriniz: ");
        c = input.nextInt();

        if (a < b && a < c){
            if (b < c){
                System.out.println("SIRALAMANIZ:   " + a + " " + b + " " + c);
            } else if (c < b){
                System.out.println("SIRALAMANIZ:  " + a + " " + c + " " + b);
            }
        }else if (b < a && b < c){
            if (a < c){
                System.out.println("SIRALAMANIZ:  " + b + " " + a + " " + c);
            } else if (c < a){
                System.out.println("TSIRALAMANIZ:  " + b + " " + c + " " + a);
            }
        }else if (c < a && c < b){
            if (a < b){
                System.out.println("SIRALAMANIZ:  " + c + " " + a + " " + b);
            } else if (b < a){
                System.out.println("SIRALAMANIZ:  " + c + " " + b + " " + a);
            }
        }
    }
}