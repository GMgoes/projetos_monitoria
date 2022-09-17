public class Relogio {

    public static void main(String[] args) throws InterruptedException{

        for (int horas = 0; horas < 24; horas ++){
            for(int minutos = 0; minutos < 60; minutos ++){
                for(int segundos = 0; segundos < 60; segundos ++){
                    Thread.sleep(1);
                    System.out.println("São "+horas+":"+minutos+":"+segundos+" horas");
                }
            }
        }
    }
}
