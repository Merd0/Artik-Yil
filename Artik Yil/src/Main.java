  import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int year;

        System.out.print("Yılı Giriniz :");
        year = input.nextInt();

        if ( year %4 == 0 && year %100 != 0 || year %400 == 0   ){

            System.out.print( year + " yılı artık yıldır! ");

        } else {
            System.out.print( year +  " yılı artık yıl değildir!" );
        }

    }
}