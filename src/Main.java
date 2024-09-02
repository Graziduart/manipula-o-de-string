import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite uma string: ");
            String input = scanner.nextLine();

            // a) Número de caracteres da string
            System.out.println("Número de caracteres: " + input.length());

            // b) String em maiúsculo
            System.out.println("String em maiúsculo: " + input.toUpperCase());

            // c) Número de vogais na string
            int vogais = contarVogais(input);
            System.out.println("Número de vogais: " + vogais);

            // d) Se a string começa com "UNI" (ignorando maiúsculas/minúsculas)
            boolean comecaComUNI = input.toUpperCase().startsWith("UNI");
            System.out.println("Começa com 'UNI': " + comecaComUNI);

            // e) Se a string termina com "RIO" (ignorando maiúsculas/minúsculas)
            boolean terminaComRIO = input.toUpperCase().endsWith("RIO");
            System.out.println("Termina com 'RIO': " + terminaComRIO);
        }

        public static int contarVogais(String input) {
            int contador = 0;
            String vogais = "AEIOUaeiou";
            for (char c : input.toCharArray()) {
                if (vogais.indexOf(c) != -1) {
                    contador++;
                }
            }
            return contador;
        }
    }