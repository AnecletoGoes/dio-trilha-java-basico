public class SmartTv {
    static boolean ligada=false;
    static int canal=1;
    static int volume = 25;
    static boolean desligada=true;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;

    }

    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        desligada=false;     
    }

}
