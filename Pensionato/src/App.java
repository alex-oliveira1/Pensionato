import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); // Criar um objeto Scanner para ler a entrada do usuário
        Rent[] vect = new Rent[10]; // Criar um array de objetos Rent com um tamanho máximo de 10 quartos
        System.out.print("Quantos quartos serão alugados? "); // Solicitar ao usuário o número de quartos que serão alugados
        int n = sc.nextInt(); // Ler o número de quartos do usuário
        for (int i = 1; i <= n; i++) { // Iterar para cada quarto que será alugado
            System.out.println();
            System.out.println("Aluguel #" + i + ":"); // Mostrar o número do aluguel atual
            System.out.print("Nome: "); // Solicitar ao usuário o nome do inquilino
            sc.nextLine();
            String name = sc.nextLine(); // Ler o nome do inquilino do usuário
            System.out.print("Email: "); // Solicitar ao usuário o email do inquilino
            String email = sc.nextLine(); // Ler o email do inquilino do usuário
            System.out.println("Quarto: "); // Solicitar ao usuário o número do quarto a ser alugado
            int quarto = sc.nextInt(); // Ler o número do quarto do usuário
            vect[quarto] = new Rent(name, email); // Criar um novo objeto Rent com os dados do inquilino e atribuí-lo ao quarto correspondente no array
        }
        System.out.println();
        System.out.println("Quartos ocupados:"); // Mostrar os quartos ocupados
        for (int i = 0; i < 10; i++) { // Iterar através de todos os quartos do array
            if (vect[i] != null) { // Verificar se o quarto está ocupado (se há um objeto Rent naquela posição do array)
                System.out.println(i + ": " + vect[i]); // Mostrar o número do quarto e os dados do inquilino
            }
        }
        sc.close(); // Fechar o objeto Scanner
    }
}
