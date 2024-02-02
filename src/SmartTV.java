//like generalTV, this is also a subclass of TV
//It provides basic Tv functionality and also has a method to play YouTube
//This follows the bridge design pattern
public class SmartTV extends TV{
    public SmartTV() {
        super();
    }

    @Override
    void enable() {
        System.out.println("Smart TV is enabled");
    }

    @Override
    void disable() {
        System.out.println("Smart TV is disabled");
    }

    public void setVolume(int volume) {
        super.setVolume(volume);
        System.out.println("Smart TV volume is set to " + volume);
    }
    public void setChannel(int channel) {
        super.setChannel(channel);
        System.out.println("Smart TV channel is set to " + channel);
    }
    public void YouTube() {
        System.out.println("Smart TV is playing YouTube");
    }
}
