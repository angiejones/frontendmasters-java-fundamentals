package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionHandling {

    public static void main(String[] args) {
        File file = new File("files/numbers.txt");
        Scanner fileReader = null;
        try{
            fileReader = new Scanner(file);
            while(fileReader.hasNext()){
                System.out.println(fileReader.nextDouble());
            }
        }catch(FileNotFoundException e){

        }catch(InputMismatchException e){
            
        }catch(Exception e){

        }finally{
            fileReader.close();
        }
    }
}
