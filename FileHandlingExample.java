import java.io.File;

import java.util.Scanner;
import java.io.FileNotFoundException;
public class FileHandlingExample 
{

public static void main(String args[])
{
    /*File Creation*/
    // try{
    //     File obj = new File("myFileone.txt");
    //     if(obj.createNewFile())
    //     {
    //         System.out.println("File Created :"+obj.getName());
    //     }
    //     else
    //     {
    //         System.out.println("File already Exist");
    //     }
    // }
    // catch (IOException e){
    //         System.out.println("An Error has Occured");
    //         e.printStackTrace();
    // }


    /* File Reading */
    try{
            File obj = new File("myFileone.txt");

            Scanner read=new Scanner(obj);
            while(read.hasNextLine())
            {
                String data=read.nextLine();
                System.out.println(data);
            }
            read.close();

        }
        catch (FileNotFoundException e)
        {
            System.out.println("An Error has Occured");
            e.printStackTrace();
        }
    }
}