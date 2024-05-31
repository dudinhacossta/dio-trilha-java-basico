public class Usuario {
    /**
     * @param args
     * @throws Exception
     */ 
    public static void main(String[] args)throws Exception{
       SmartTv smartTv = new SmartTv();

       System.out.println ("A TV está? " + smartTv.ligada);
       System.out.println ("O volume é? " + smartTv.volume);
       System.out.println  ("O canal é? Top " + smartTv.canal);

       smartTv.mudarCanal(96);
       System.out.println  ("O canal é? " + smartTv.canal);
       
       smartTv.ligar ();
       System.out.println ("Novo status da Tv " + smartTv.ligada);

       smartTv.diminuirVolume();
       System.out.println ("O volume é: " + smartTv.volume);

       smartTv.aumentarVolume();
       System.out.println ("O volume é: " + smartTv.volume);

      


    }
}
