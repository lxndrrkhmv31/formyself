public class main {
    public static void main(String[] args) {

        int volume = 1200;
        int fillingSpeed = 30; //30 litres per minute
        int devastationSpeed = 10; //10 litres per minute

        int presentVolume = 0;

        int time = 0;

        while (presentVolume != volume) {
            presentVolume = presentVolume + fillingSpeed - devastationSpeed;
            time = time + 1;
        }

        System.out.println("Время наполнения бассейна " + time + " минут");
    }
}
