package Daire;
import java.util.Scanner;
public class DaireAlan {
    public static void main(String[]args){
        final double pi=3.14;
        int r;
        int a;
        Scanner inp=new Scanner(System.in);
        System.out.println("yarıçap girin:");
        r=inp.nextInt();
        System.out.println("merkez açısı girin:");
        a=inp.nextInt();
        double alan=(pi*(r*r)*a)/360;
        System.out.println("daire dilimin alanı:"+alan);
    }
}
