package code.template;

import java.util.Scanner;

public class CodeTemplate {
    public static String kalimat, dicari;
    Scanner a = new Scanner(System.in);//ici tab, code template
    
    
    
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        inputan1(a);
        inputan2(a);
        CodeTemplate in = new CodeTemplate();
        int i=0;
        while (i<kalimat.length()){ 
            String baru = kalimat.substring(i, i+1); 
            if (baru.equals(dicari)){
                System.out.println("Ada di index ke :"+i+" ");
            }
            i++;
        }
    }

    public static void inputan2(Scanner a) {
        System.out.println("Input Huruf yang Dicari :");
        dicari = a.next();
    }

    public static void inputan1(Scanner a) {
        System.out.println("Input Kalimat :");
        kalimat = a.next();
    }
}