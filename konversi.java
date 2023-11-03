import java.util.*;
import java.lang.*;

public class konversi {
    public static String binaryToHex(String binary) {
        int desimal=Integer.parseInt(binary,2);
        return Integer.toHexString(desimal);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.printf("PROGRAM KONVERSI BILANGAN\n" +
                "=============================\n" +
                "1. Biner ke Desimal\n" +
                "2. Desimal ke Biner\n" +
                "3. Biner ke Hexa\n" +
                "4. Hexa ke Biner\n" +
                "5. Desimal ke Hexa\n" +
                "6. Hexa ke Desimal\n" +
                "0. Exit Program\n" +
                "Pilihan Anda? ");
        int pilih=input.nextInt();
        String biner, hexa;
        int desimal=0;

        while(pilih!=0){
            switch (pilih){
                case 1:
                    System.out.printf("Masukkan bilangan yang ingin Anda konversi: ");
                    biner=input.next();
                    desimal=Integer.parseInt(biner,2);
                    System.out.println("Bilangan Desimal: "+desimal);
                    break;
                case 2:
                    System.out.printf("Masukkan bilangan yang ingin Anda konversi: ");
                    desimal=input.nextInt();
                    biner=Integer.toBinaryString(desimal);
                    System.out.println("Bilangan Binernya adalah: "+biner);
                    break;
                case 3:
                    System.out.printf("Masukkan bilangan yang ingin Anda konversi: ");
                    biner=input.next();
                    hexa=binaryToHex(String.valueOf(biner));
                    System.out.println("Bilangan Hexanya adalah: "+hexa);
                    break;
                case 4:
                    System.out.printf("Masukkan bilangan yang ingin Anda konversi: ");
                    hexa=input.next();
                    desimal=Integer.parseInt(hexa);
                    biner=Integer.toHexString(desimal);
                    System.out.println("Bilangan Binernya adalah: "+biner);
                    break;
                case 5:
                    System.out.printf("Masukkan bilangan yang ingin Anda konversi: ");
                    desimal=input.nextInt();
                    hexa=Integer.toHexString(desimal);
                    System.out.println("Bilangan Hexanya adalah: "+hexa);
                    break;
                case 6:
                    System.out.printf("Masukkan bilangan yang ingin Anda konversi: ");
                    hexa=input.next();
                    desimal=Integer.parseInt(hexa);
                    System.out.println("Bilangan Desimalnya adalah: "+desimal);
                    break;
                default:
                    System.out.println("Pilihan Anda tidak ada dalam program.");
            }

            System.out.printf("\nPROGRAM KONVERSI BILANGAN\n" +
                    "=============================\n" +
                    "1. Biner ke Desimal\n" +
                    "2. Desimal ke Biner\n" +
                    "3. Biner ke Hexa\n" +
                    "4. Hexa ke Biner\n" +
                    "5. Desimal ke Hexa\n" +
                    "6. Hexa ke Desimal\n" +
                    "0. Exit Program\n" +
                    "Pilihan Anda? ");
            pilih=input.nextInt();
        }
    }
}

