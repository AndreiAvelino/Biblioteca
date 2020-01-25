
class Livro{
    
    static int qtd = 0;
    private String titulo;
    private int codigo;
    private boolean emprestado;
    
    public Livro(int codigo, String titulo){
        setCodigo(codigo);
        setTitulo(titulo);
        emprestado = false;
        qtd++;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public int getCodigo(){
        return this.codigo;
    }

    public void setEmprestado(){
      if (this.emprestado = false){
        this.emprestado = true;
      } else {
        this.emprestado = false;
      }
    }
    
    public boolean getEmprestado(){
      return this.emprestado;
    }
    
    public void mostraLivro(){
      System.out.println("Codigo: "+getCodigo());
      System.out.println("Título: "+getTitulo());
    }
    
}