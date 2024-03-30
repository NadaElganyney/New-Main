import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        /*Q2
        String colors[] = {"green", "blue", "white"};
        colors[0] = "Red";
        System.out.println(Arrays.toString(colors));*/






        /*Q3

Scanner scanDegree = new Scanner(System.in);
        System.out.println("Please write your degree with Celsius");
int degreeInCelsius = scanDegree.nextInt();
double degreeInFahrenheit =  degreeInCelsius * 1.8 + 32;

        System.out.println("Your degree with Celsius is " + degreeInFahrenheit);*/






        //Q4
        Scanner scanNumbers = new Scanner(System.in);
        int i =0;
        int total=0;

        while (i < 5) {
            System.out.println("Please enter your number");
int numbers = scanNumbers.nextInt();
total+=numbers;
            i++;
        }
        int average= total/5;
        System.out.println("your total is "+ total + " your average is "+average);

   /*   Q1 &5

Scanner scanInput= new Scanner(System.in);
        System.out.println("Please enter your word");
        String input= scanInput.next();
        String revesre= "";
        for(int i =input.length()-1; i>=0;i--){
            revesre += input.charAt(i);
        }
        System.out.println("The reverse is "+ revesre);
        if (input.equals(revesre)) {
            System.out.println(" and it's a plindrom");
        }
        else
            System.out.println(" and it's not a plindrom");*/

    }
}