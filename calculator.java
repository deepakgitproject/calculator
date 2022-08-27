@credit: deepakgitprojet [LPU STUDENT]
license: MIT license & General purpose license
FAIR USE

mport java.util.Scanner;

class Main {
  public static void main(String[] args) {

    char operator;
    Double value1, value2, finaloutput;
    Scanner input = new Scanner(System.in);
    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);
    System.out.println("Enter first number");
    value1 = input.nextDouble();
    System.out.println("Enter second number");
    value2 = input.nextDouble();
    switch (operator) {
        case '+':
        result = value1 + number2;
        System.out.println(value1 + " + " + value2 + " = " + finaloutput);
        break;
      case '-':
        result = value1 - number2;
        System.out.println(value1 + " - " + value2 + " = " + finaloutput);
        break;
      case '*':
        result = value1 * number2;
        System.out.println(value1 + " * " + value2 + " = " + finaloutput);
        break;
      case '/':
        result = value1 / number2;
        System.out.println(value1 + " / " + value2 + " = " + finaloutput);
        break;
      default:
        System.out.println("invalid command");
        break;
    }

    input.close();
  }
}
