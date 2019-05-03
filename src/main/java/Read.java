import java.util.Scanner;

public class Read {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        System.out.print("Number you enter is: ");
        if (number < 10 & number >= 0) {
            switch (number) {
                case 0:
                    System.out.print("zero");
                    break;
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
                default:
                    System.out.println("Out of ability");
            }
        }else if (number < 20 | number == 10) {
            switch (number) {
                case 10:
                    System.out.print("ten");
                    break;
                case 11:
                    System.out.print("eleven");
                    break;
                case 12:
                    System.out.print("twelve");
                    break;
                case 13:
                    System.out.print("thirteen");
                    break;
                case 14:
                    System.out.print("fourteen");
                    break;
                case 15:
                    System.out.print("fifteen");
                    break;
                case 16:
                    System.out.print("sixteen");
                    break;
                case 17:
                    System.out.print("seventeen");
                    break;
                case 18:
                    System.out.print("eighteen");
                    break;
                case 19:
                    System.out.print("nineteen");
                    break;
                default:
                    System.out.println("Out of ability");
            }
        }else if (number < 30 | number == 20) {
            String num = "twenty";
            switch (number) {
                case 20:
                    System.out.print(num );
                    break;
                case 21:
                    System.out.print(num + " one");
                    break;
                case 22:
                    System.out.print(num + " two");
                    break;
                case 23:
                    System.out.print(num + " three");
                    break;
                case 24:
                    System.out.print(num + " four");
                    break;
                case 25:
                    System.out.print(num + " five");
                    break;
                case 26:
                    System.out.print(num + " six");
                    break;
                case 27:
                    System.out.print(num + " seven");
                    break;
                case 28:
                    System.out.print(num + " eight");
                    break;
                case 29:
                    System.out.print(num + " nine");
                    break;
                default:
                    System.out.println("Out of ability");
            }
        }
    }
}
