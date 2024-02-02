public class Main {
    public static void main(String[] args) {
        //Both the GeneralTV and SmartTV classes are derived from the TV class,
        //So they can be used from a TV reference
        TV generalTV = new GeneralTV();
        TV smartTV = new SmartTV();

        //A Smart remote can control a smart TV
        SmartRemote smartRemote = new SmartRemote(smartTV);

        //A general remote can control a general TV
        Remote remote = new Remote(generalTV);

        //A smart remote can also control a general TV
        Remote smartRemote2 = new SmartRemote(generalTV);

        //A general remote can also control a smart TV
        Remote remote2 = new Remote(smartTV);

        //Since both the remotes have the same tv reference in their constructor, they control the same TV
        remote.togglePower();
        remote.volumeUp();
        smartRemote2.channelUp();
        smartRemote2.togglePower();


        //Again, both the remotes have the same tv reference in their constructor, they control the same TV
        remote2.togglePower();
        remote2.volumeUp();
        smartRemote.volumeDown();
        //Youtube accessed through the smart remote
        smartRemote.showYouTube();


    }
}