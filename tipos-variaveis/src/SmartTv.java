 public class SmartTv  {
    boolean ligada = false;
    int volume = 33;
    int canal = 58;
    
    public void mudarCanal (int novoCanal){
      canal = novoCanal;
    }
    public void ligar(){
      ligada = true;
    }
    public void desligar() {
      ligada = false;
      
    }
    public void diminuirVolume() {
      volume--;

    }
    public void aumentarVolume() {
      volume++;

    }
 }
