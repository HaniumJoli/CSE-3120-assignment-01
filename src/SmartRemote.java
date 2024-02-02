//A smart remote is derived from the Remote class and provides additional functionality to control a smart TV.
//However, it can also control a general TV.
public class SmartRemote extends Remote{
    public SmartRemote(TV tv) {
        super(tv);
    }
    public void showYouTube() {
        if (tv instanceof SmartTV) {
            ((SmartTV) tv).YouTube();
        }
    }
}
