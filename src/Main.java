import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap a");
        a= scanner.nextInt();
        System.out.println("nhap b");
        b= scanner.nextInt();
        System.out.println("nhap c");
        c= scanner.nextInt();
        if (a<b){
            if (a<c){
                System.out.println("a la so be nhat");
            }
            else {
                System.out.println("c la so be nhat");
            }
        }
        else {
            if (b<c){
                System.out.println("b la so be nhat");
            }
            else {
                System.out.println("c la so nho nhat");
            }
        }
        }
    }
