package JavaRushLessons9;

import java.io.IOException;
import java.util.Scanner;

public class Exceptions6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());

        if ( x !=0){
            try{
                throw new IOException();
            }catch (IOException e){
                System.out.println("пользователь ввел число отличное от 0");
            }
        }
    }
}
