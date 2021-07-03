import java.util.Scanner;

public class HashMagico {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int casosDeTestes = Integer.parseInt(scanner.nextLine());
        
    for (int casoDeTeste = 0; casoDeTeste < casosDeTestes; casoDeTeste++) {
            
      int quantLinhasPorTeste = scanner.nextInt();
      int resultado = 0;
            
      for (int j = 0; j < quantLinhasPorTeste; j++) {
        char[] arrayLinha = scanner.next().toCharArray();
                
        for (int x = 0; x < arrayLinha.length; x++) {
          int posicao = (int) arrayLinha[x] - 65;
          resultado += posicao + j + x;
        }
      }
      System.out.println(resultado);
    }
  }
}