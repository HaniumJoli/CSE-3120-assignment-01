//this is the abstract class for TV
//it has the basic methods that a TV should have
public abstract class TV {
    protected Boolean powerOn;
    protected int volume;
    protected int channel;

    public TV() {
        powerOn = false;
        volume = 0;
        channel = 0;
    }
    abstract void enable() ;
    abstract void disable();
    boolean isEnabled() {
        return powerOn;
    }
    void setVolume(int volume) {
        this.volume = volume;
    }
    int getVolume() {
        return volume;
    }
    void setChannel(int channel) {
        this.channel = channel;
    }
    int getChannel() {
        return channel;
    }
}
