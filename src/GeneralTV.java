//This is a concrete TV class derived from the abstract TV class
//It has the abstract methods implemented and can be used as a TV
//this follows the bridge design pattern
public class GeneralTV extends TV{
    public GeneralTV() {
        super();
    }
    @Override
    public void enable() {
        if(!powerOn){
            powerOn = true;
        }
        System.out.println("General TV is enabled");
    }

    @Override
    void disable() {
        if(powerOn){
            powerOn = false;
        }
        System.out.println("General TV is disabled");
    }

    public void setVolume(int volume) {
        super.setVolume(volume);
        System.out.println("General TV volume is set to " + volume);
    }
    public void setChannel(int channel) {
        super.setChannel(channel);
        System.out.println("General TV channel is set to " + channel);
    }
    public void printStatus() {
        System.out.println("General TV is " + (super.isEnabled() ? "enabled" : "disabled"));
        System.out.println("General TV volume is " + super.getVolume());
        System.out.println("General TV channel is " + super.getChannel());
    }
}
