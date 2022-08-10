import java.util.Scanner;

public class Main {
            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Vvedite dannie");
                String operation = scanner.next();
                String[] massiv;
                int result = 0;
                String resultRome = "";
                try {
                    if (operation.contains("+")) {
                        massiv = operation.split("[+]");
                        result = Calculator.sum(Integer.parseInt(massiv[0]), Integer.parseInt(massiv[1]));
                    } else if (operation.contains("-")) {
                        massiv = operation.split("[-]");
                        result = Calculator.min(Integer.parseInt(massiv[0]), Integer.parseInt(massiv[1]));
                    } else if (operation.contains("*")) {
                        massiv = operation.split("[*]");
                        result = Calculator.mul(Integer.parseInt(massiv[0]), Integer.parseInt(massiv[1]));
                    } else if (operation.contains("/")) {
                        massiv = operation.split("[/]");
                        result = Calculator.div(Integer.parseInt(massiv[0]), Integer.parseInt(massiv[1]));
                    }
                    System.out.println(result);
                } catch (NumberFormatException e) {
                    if (operation.contains("+")) {
                        massiv = operation.split("[+]");
                        resultRome = RomeCalculator.sum(massiv[0], massiv[1]);
                    } else if (operation.contains("-")) {
                        massiv = operation.split("[-]");
                        resultRome = RomeCalculator.min(massiv[0], massiv[1]);
                    } else if (operation.contains("*")) {
                        massiv = operation.split("[*]");
                        resultRome = RomeCalculator.mul(massiv[0], massiv[1]);
                    } else if (operation.contains("/")) {
                        massiv = operation.split("[/]");
                        resultRome = RomeCalculator.div(massiv[0], massiv[1]);
                    }
                    System.out.println(resultRome);
                }
            }
        }
