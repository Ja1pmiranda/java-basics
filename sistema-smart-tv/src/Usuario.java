public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada? : " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Tv Ligada? : " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Tv Ligada? : " + smartTv.ligada);

        smartTv.mudarCanal(33);
        System.out.println("Canal atual : " + smartTv.canal);


    }
}