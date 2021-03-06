
package ultimateemoji;

import java.util.Random;

public class Luta {
    
private Lutador desafiado; 
private Lutador desafiante;
// tipo Lutador é um tipo abstrato de dado que vem da Classe Lutador
private int rounds;
private boolean aprovada;

// MÉTODOS ESPECIAIS

public void lutar(){
    if(this.aprovada == true){
        System.out.println(" - -  DESAFIADO - - -");
        this.desafiado.apresentar();
        System.out.println("- - - DESAFIANTE - - -");
        this.desafiante.apresentar();
        
        Random aleatorio = new Random(); //cria objeto denominado "aleatorio" do tipo randomico
        int vencedor = aleatorio.nextInt(3); //recebe 1, 2, ou 3
        switch(vencedor){
            case 1:
                System.out.println("EMPATOU!");
             this.desafiado.empatarLuta();;
             this.desafiante.empatarLuta();
             break;
             
            case 2:
                System.out.println("VITÓRIA DE " + this.desafiado.getNome());
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                break;
                
            case 3:
                System.out.println("VÍTÓRIA DE " + this.desafiante.getNome());
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
                break;
        }
    }
}

public void marcarLuta(Lutador l1, Lutador l2){
    if(l1.getCategoria()== l2.getCategoria() && l1 != l2){
        this.aprovada = true;
        this.desafiado = l1;
        this.desafiante = l2;
       }
    else{
        this.setAprovada(false);
        this.desafiado = null;
        this.desafiante = null;
        System.out.println("A luta não pode acontecer");
    }
    
}

public void setDesafiado(Lutador dd){
    this.desafiado = dd;
}

public Lutador getDesafiado(){
    return desafiado;
}

public void setDesafiante(Lutador ds){
    this.desafiante = ds;
}

public Lutador getDesafiante(){
    return desafiante;
}

public void setRounds(int r){
    this.rounds = r;
}

public int getRounds(){
    return rounds;
}

public void setAprovada(boolean ap){
    this.aprovada = ap;
}

public boolean getAprovada(){
    return aprovada;
}
    
}
