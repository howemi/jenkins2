import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
    System.out.println("welcome to the calculator\nEnter a command:");
    BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

    Calculator c = new Calculator();
    String name = "";
    while (!name.equals("q")) {
      // Reading data using readLine
      name = reader.readLine();
      String[] input = name.split(" ");
      switch (input[0]) {
        case "add": {
          System.out.println(c.add(Integer.parseInt(input[1]), Integer.parseInt(input[2])));
          break;
        }
        case "subtract": {
          System.out.println(c.subtract(Integer.parseInt(input[1]), Integer.parseInt(input[2])));
          break;
        }
        case "multiply": {
          System.out.println(c.multiply(Integer.parseInt(input[1]), Integer.parseInt(input[2])));
          break;
        }
        case "divide": {
          System.out.println(c.divide(Integer.parseInt(input[1]), Integer.parseInt(input[2])));
          break;
        }
        case "fib": {
          System.out.println(c.fibonacciNumberFinder(Integer.parseInt(input[1])));
          break;
        }
        case "binary": {
          System.out.println(c.intToBinaryNumber(Integer.parseInt(input[1])));
          break;
        }
        default: {
          break;
        }
      }
    }
  }
}