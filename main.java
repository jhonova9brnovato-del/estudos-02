import java.util.Scanner;

public class main {
  /*
 
 * TÓPICOS ABORDADOS:
 *
 * 1. import
 *    - Importa a classe Scanner do pacote java.util.
 *
 * 2. Classe
 *    - Todo código Java fica dentro de uma classe.
 *    - Convenção: nome começa com maiúscula (Main).
 *
 * 3. Método main
 *    - Ponto de entrada do programa.
 *    - Assinatura padrão: public static void main(String[] args)
 *    - args recebe argumentos da linha de comando.
 *
 * 4. Comentários
 *    - // linha | /* bloco *\/ | /** Javadoc *\/
 *
 * 5. Entrada de dados (Scanner)
 *    - new Scanner(System.in): lê do teclado.
 *    - next(): lê uma palavra (String).
 *    - nextInt(): lê um número inteiro.
 *    - close(): fecha o Scanner ao terminar.
 *
 * 6. Saída de dados
 *    - print(): imprime sem pular linha.
 *    - println(): imprime e pula linha.
 *    - printf(): imprime texto formatado.
 *
 * 7. Formatação (printf)
 *    - %s: texto | %d: inteiro | \n e %n: quebra de linha.
 *
 * 8. Variáveis e tipos de dados
 *    - String: texto (nome).
 *    - int: número inteiro (idade, dia, mês, ano).
 *    - Scanner: objeto de leitura.
 *
 * 9. Inferência de tipo (var)
 *    - O compilador deduz o tipo pelo valor atribuído (Java 10+).
 *
 * FLUXO DO PROGRAMA:
 *    1) Pede o nome        -> String
 *    2) Pede a idade       -> int
 *    3) Pede dia/mês/ano   -> int
 *    4) Exibe as mensagens com os dados informados
 *
 *
 */
  */
    public void main(String[] args) {
        /* comentario de teste para eu lenbra como se faz **/
        Scanner scanner = new Scanner(System.in);
        System.out.print("seja bem-bem vindo\nqual seria seu nome!");
        String namr = scanner.next();
        System.out.printf("ola %s",namr);
        System.out.printf("\nQual seria a sua idade %s:", namr);
        int age = scanner.nextInt();
        System.out.printf("seja muito bem-vindo %s \nsua idade e de %s",namr, age);
        System.out.println("qual e seria a sua idade? Dia,Mês,Ano");
        var Dia = scanner.nextInt();
        var Mes = scanner.nextInt();
        var Ano = scanner.nextInt();
        System.out.printf("Olá %s \n você naceu %s / %s / %s \nsua idade correponde a %s Anos",namr,Dia,Mes,Ano,age);

    }
}