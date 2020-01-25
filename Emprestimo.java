class Emprestimo{

  static int qtd;
  private static int geraCodigo;
  private int codEmp;
  private int codLivro;
  private int cpf;
  private boolean estado;
    
    public Emprestimo(Pessoa[] p, Livro[] l, int posiP, int posiL){
      codEmp = geraCodigo;
      this.codLivro = l[posiL].getCodigo();
      this.cpf = p[posiP].getCpf();
      this.estado = true;

      p[posiP].ganhaLivro();
      l[posiL].setEmprestado();

      geraCodigo++;
      qtd++;
    }

    public void verEmprestimo(){
      System.out.println("Código do emprestimo: "+this.codEmp);
      System.out.println("Código do livro: "+this.codLivro);
      System.out.println("CPF do cliente: "+this.cpf);
      System.out.println("Estado do emprestimo: "+this.estado);
    }
       
    
    
}