import java.util.Scanner;

class Main {

  public static int Opcao (){

    Scanner teclado = new Scanner (System.in);
    int op;

      System.out.println ("1 - CADASTRO CLIENTE");
      System.out.println ("2 - CADASTRO LIVRO");
      System.out.println ("3 - REALIZAR EMPRESTIMO");
      System.out.println ("4 - VER EMPRESTIMOS");

      System.out.println(" ");
      System.out.print("Informe sua opção: ");
      op = teclado.nextInt();
      
      while (op < 1 | op > 4){
          System.out.print("OPÇÃO INVÁLIDA - Informe novamente: ");
          op = teclado.nextInt();
      }
      
      return op;
    } 
  
  public static void criaPessoa(Pessoa[] p){

    String nome;
    int cpf;

    Scanner teclado = new Scanner(System.in);

    System.out.print("Informe o nome: ");
    nome = teclado.next();

    System.out.print("Informe o cpf: ");
    cpf = teclado.nextInt();

    p[Pessoa.qtd] = new Pessoa(cpf, nome);
    
  }  

  public static void criaLivro(Livro[] l){

    Scanner teclado = new Scanner(System.in);
    int codigo;
    String titulo;

    System.out.print("Informe o código: ");
    codigo = teclado.nextInt();

    System.out.print("Informe o título: ");
    titulo = teclado.next();

    l[Livro.qtd] = new Livro(codigo, titulo);

  }

  public static void fazEmprestimo(Livro[] l, Pessoa[] p, Emprestimo[] e){

    Scanner teclado = new Scanner(System.in);
    
    int codLivro, cpf;
 
    for (int i = 0; i <= (Livro.qtd-1); i++){
      l[i].mostraLivro();
    }

    System.out.println("---------------");
    System.out.println("CPF disponíveis:");
    for (int i = 0; i <= (Pessoa.qtd-1); i++){
      System.out.println(p[i].getCpf());
    }
     
    e[Emprestimo.qtd] = new Emprestimo(p, l, achaPessoa(p), achaLivro(l));

  }

  public static int achaLivro(Livro[] l){

    Scanner teclado = new Scanner(System.in);
    int codLivro;
    boolean ver = false;

    System.out.print("Informe o código do livro: ");
    codLivro = teclado.nextInt();
    while (ver == false){

      for (int i = 0; i <= (Livro.qtd)-1; i++){
        if (l[i].getCodigo() == codLivro){
          codLivro = i;
          ver = true;
          break;
        }
      }
      if (ver == true){
        break;
      }
      System.out.print("LIVRO NÃO EXISTE - Digite um código: ");
      codLivro = teclado.nextInt();
      
    }
    return codLivro;
   } 

  public static int achaPessoa(Pessoa[] p){
    
    Scanner teclado = new Scanner(System.in);
    int cpf;
    boolean ver = false;

    System.out.print("Informe o CPF: ");
    cpf = teclado.nextInt();

    while (ver == false){
      for (int i = 0; i <= (Pessoa.qtd-1); i++){
        if (cpf == p[i].getCpf()){
          ver = true;
          cpf = i;
          break;
        }
      }
      if (ver == true){
        break;
      }
      System.out.print("CPF NÃO ENCONTRADO - Informe o cpf: ");
      cpf = teclado.nextInt();
    }

    return cpf;
  }

  public static void todosEmprestimos(Emprestimo[] e){

    if (Emprestimo.qtd == 0){
      System.out.println("NÃO HÁ EMPRESTIMOS");
      return;
    }
    for (int i = 0; i <= (Emprestimo.qtd-1); i++){
      e[i].verEmprestimo();
    }
  }

 
  
  public static void main(String[]args)  {

    Scanner teclado = new Scanner(System.in);
    
    String resp;

    Livro[] liv = new Livro[10];
    Pessoa[] pes = new Pessoa[10];
    Emprestimo[] emp = new Emprestimo[10];
    
    do{

      switch(Opcao()){

        case 1: criaPessoa(pes);
                break;
        case 2: criaLivro(liv);
                break;
        case 3: fazEmprestimo(liv, pes, emp);
                break;
        case 4: todosEmprestimos(emp);
                break;
      }

      System.out.print("Deseja continuar? (Y/N): ");
      resp = teclado.next();

    } while (resp.equals("Y"));

  }
}