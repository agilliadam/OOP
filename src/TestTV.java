public class TestTV extends TV {
    public static void main(String[] args){
        TV tv1 = new TV();
        tv1.turnOn();

        TV tv2 = new TV();
        tv2.turnOn();

        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        System.out.println("TV1: " + tv1.channel + " and volume level is " + tv1.volumeLevel);
        System.out.println("TV2: " + tv2.channel + " and volume level is " + tv2.volumeLevel);
    }
}