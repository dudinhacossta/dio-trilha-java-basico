package candidatura;

public class ProcessoSeletivo {
    
   
    public static void main(String[] args) {
        double salarioBase = 2000.0;
        double salarioPretendido = 1900.0;

        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
            
        } else if (salarioBase == salarioPretendido){
            System.out.println("Ligar com contra proposta");
        }else{
            System.out.println("Aguardando resultado dos demais");
        }
    }
}
    

