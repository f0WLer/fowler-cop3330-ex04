import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alex Fowler
 */
public class App 
{
    public static void main( String[] args )
    {
        String blanks[] = new String[5];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter noun: ");
        blanks[1] = scanner.nextLine();
        System.out.print("Enter adjective: ");
        blanks[0] = scanner.nextLine();
        System.out.print("Enter adverb: ");
        blanks[2] = scanner.nextLine();
        System.out.print("Enter verb: ");
        blanks[3] = scanner.nextLine();
        System.out.print("Enter month: ");
        blanks[4] = scanner.nextLine();
        System.out.println(String.format("The %s %s very %s %s in %s",
                blanks[0], blanks[1], blanks[2], blanks[3], blanks[4]));
    }
}
