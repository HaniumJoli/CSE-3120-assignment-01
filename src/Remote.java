//This remote is an adapter for the TV class. It provides a simple interface for the user to interact with the TV.
//The remote has a reference to the TV object and can call its methods to change the state of the TV.
public class Remote {
    protected TV tv;

    public Remote(TV tv) {
        this.tv = tv;
    }

    public void togglePower() {
        if (tv.isEnabled()) {
            tv.disable();
        } else {
            tv.enable();
        }
    }
    public void volumeUp() {
        tv.setVolume(tv.getVolume() + 1);
    }
    public void volumeDown() {
        tv.setVolume(tv.getVolume() - 1);
    }
    public void channelUp() {
        tv.setChannel(tv.getChannel() + 1);
    }
    public void channelDown() {
        tv.setChannel(tv.getChannel() - 1);
    }
}
