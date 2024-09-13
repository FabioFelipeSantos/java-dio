public class User {

    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("It's the TV turn on? " + smartTv.turnOn);
        System.out.println("\nWhat's the TV channel? " + smartTv.channel);
        System.out.println("\nWhat's the TV volume? " + smartTv.volume);

        smartTv.turnOff();
        System.out.println("\n\nIt's the TV turn on? " + smartTv.turnOn);

        smartTv.turnOn();
        System.out.println("\n\nIt's the TV turn on? " + smartTv.turnOn);

        smartTv.increaseVolume();
        System.out.println("\nWhat's the TV volume? " + smartTv.volume);

        smartTv.decreaseVolume();
        smartTv.decreaseVolume();
        smartTv.decreaseVolume();
        System.out.println("\nWhat's the TV volume? " + smartTv.volume);

        for (int i = 0; i < 10; i++) {
            smartTv.increaseChannel();
        }
        System.out.println("\nWhat's the TV channel? " + smartTv.channel);

        for (int i = 0; i < 4; i++) {
            smartTv.decreaseChannel();
        }
        System.out.println("\nWhat's the TV channel? " + smartTv.channel);
    }
}
