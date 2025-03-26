public class Usuario {

     /// Ações realizadas pelo usuário
    public static void main(String[] args) throws Exception {

    SmartTv smartTv = new SmartTv ();

    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.mudarCanal(27);
    //Comandos de mudança da situação origem, volume e canal    


    System.out.println("Volume Atual: " + smartTv.volume);
    //Saída para identificação do volume

    System.out.println("TV Ligada: " + smartTv.ligada);
    //Saída para Status da TV     

    System.out.println("Canal Atual: " + smartTv.canal);
    //Saída para conhecimento do canal em transmissão    

    System.out.println("Volume Atual: " + smartTv.volume);
    //Saída para identificação do volume

    smartTv.ligar();
    //Ação para ligar TV

    System.out.println("Novo Status | TV Ligada: " + smartTv.ligada);
    //Saída para Status da TV     

    }
}