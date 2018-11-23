
package mundo;


public class Bebe extends Pessoa{
    short meses;
    
    //criação do metodo construtor
    public Bebe(String nome, char sexo){
        this.nome = nome;
        this.sexo = sexo;
        
    
    }
    //reescrita do metodo
    @Override
    public void andar(){
         System.out.println(nome + " está engatinhando!"); 
         
     
     
     
    }
    
}
