class Pessoa{
    
    static int qtd = 0;    
    private String nome;
    private int cpf;
    private int qtdEmp;
    
    
    public Pessoa(int cpf, String nome){
        setCpf(cpf);
        setNome(nome);
        qtdEmp = 0;
        qtd++;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
    
    public int getCpf(){
        return cpf;
    }

    public void ganhaLivro(){
      this.qtdEmp++;
    }
    
    
}