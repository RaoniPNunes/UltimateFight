
package ultimateemoji;


public class Lutador {
    
// ATRIBUTOS
    
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    
// MÉTODO CONSTRUTOR

public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em ){
    this.nome = no;
    this.nacionalidade = na;
    this.idade = id;
    this.altura = al;
    this.setPeso(pe);
    this.vitorias = vi;
    this.derrotas = de;
    this.empates = em;
}    
// MÉTODOS GET e SET

    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float al) {
        this.altura = al;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        this.categoria = categoria;
        if(this.peso < 52.2){
            this.categoria = "Inválido";
        }
        else if(this.peso <= 70.3){
            this.categoria = "Leves"; 
        }
        else if(this.peso <= 83.9){
            this.categoria = "Médios";
        }
        else if(this.peso <=120.2){
            this.categoria = "pesados";
        }
        else{
            this.categoria = "Inválidos";
    }
    }    

    public int getVitorias(){
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
// MÉTODOS ESPECÍFICOS
    
    public void apresentar(){
        System.out.println("- - - - - - - - - ");
        System.out.println("CHEGOU A HORA");
        System.out.println("Lutador: " + getNome());
        System.out.println("Nacionalidade: " + getNacionalidade());
        System.out.println("Idade: " + getIdade());
        System.out.println("Altura: " + getAltura());
        System.out.println("Pesando: " + getPeso());
        System.out.println("Ganhou: " + getVitorias() + " Lutas");
        System.out.println("Perdeu: " + getDerrotas() + " lutas");
        System.out.println("Empatou: " + getEmpates() + " Lutas");
        System.out.println("- - - - - - - - - -");
        
    }
    
    public void status(){
        System.out.println("Nome: " + getNome());
        System.out.println("É um peso " + getCategoria());
        System.out.println(getVitorias() + " Vitórias");
        System.out.println(getDerrotas() + " Derrotas");
        System.out.println(getEmpates() + " Empates");
        
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+ 1);
        
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+ 1);
        
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
        
    }
}
