import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        int mat, phy, history, che, music;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your mathematic grade: ");
        mat = input.nextInt();
        System.out.print("Please enter your physic grade: ");
        phy = input.nextInt();
        System.out.print("Please enter your history grade: ");
        history = input.nextInt();
        System.out.print("Please enter your chemical grade: ");
        che = input.nextInt();
        System.out.print("Please enter your music grade: ");
        music = input.nextInt();

        double average = (mat + phy + history + che + music) / 5;
        System.out.println("Your grade average is: " + average);

        String message = average >= 60 ? "You passed the class." : "You failed the class.";
        System.out.println(message);
    }
}