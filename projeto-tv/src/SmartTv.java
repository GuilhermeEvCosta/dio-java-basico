public class SmartTv {
    // Classe: pública; Nome: SmartTV


    boolean ligada = false; // Indica se a TV está ligada ou desligada
    int canal = 1; // Canal atual, origem
    int volume = 10; // Volume atual, origem

    /// Ações do Canal
    public void mudarCanal (int novoCanal){  // Alternando o canal origem diretamente
        canal = novoCanal; 
    }
    public void aumentarCanal(){   // Aumentando canal
        canal++;
    }
    public void diminuirCanal(){   // Diminuindo canal
        canal--;
    }

    /// Ações do Volume
    public void aumentarVolume(){  //Volume sendo somado com + 1
        volume ++;
        System.out.println("Aumentando volume para:" + volume);      
    }
    public void diminuirVolume(){  //Volume sendo subtraido - 1
        volume --;
        System.out.println("Diminuindo volume para:" + volume);       
    }

     /// Ações de ligar e desligar
    public void ligar (){
       ligada = true; 
    }
    public void desligar (){
        ligada = false; 
     }
     
     public static void main (String[] args) {
        System.out.println("Pronto"); 
     }
    
}
