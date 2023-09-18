public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada ?" + SmartTv.ligada);
        System.out.println("Canal Atual :" + SmartTv.canal);
        System.out.println("Volume Atual :" + SmartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> : TV Ligada ?" + SmartTv.ligada); 

        smartTv.desligar();
        System.out.println("Novo Status -> : TV Ligada ?" + SmartTv.desligada); 

    }
}
