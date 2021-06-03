package E_07;



import java.util.Scanner;
/**
 * *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  *  Copyright 2021 Kevin Kant
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in);

        System.out.print("What is the length of the room: ");
        int length = reader.nextInt();
        System.out.print("What is the width of the room: ");
        int width = reader.nextInt();
        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");
        Converter myRoom = new Converter(length*width);

        myRoom.calcRoom();

    }
}
