package OOPS.Interface;

class Phone {
    public void calls() {
        System.out.println("Calls from Phone class");
    }

    public void sms() {
        System.out.println("Sms from Phone class");
    }

}

interface Camera {
    public void photoClick();

    public void videoRecorder();
}

interface MusicPlayer {
    public void playMusic();

    public void searchMusic();
}

class SmartPhone extends Phone implements Camera, MusicPlayer {
    public void videoCall() {
        System.out.println("VideoCall from SmartPhone class");
    }

    @Override
    public void photoClick() {
        System.out.println("PhotoClick from SmartPhone class");
    }

    @Override
    public void videoRecorder() {
        System.out.println("videoRecorder from SmartPhone class");
    }

    @Override
    public void playMusic() {
        System.out.println("playMusic from SmartPhone class");
    }

    @Override
    public void searchMusic() {
        System.out.println("searchMusic from SmartPhone class");
    }

}

public class Lesson2 {
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
        s.calls();
        s.sms();
        s.videoCall();
        s.photoClick();
        s.videoRecorder();
        s.playMusic();
        s.searchMusic();

        Phone p = new Phone();
        p.calls();
        p.sms();

        // Camera c = new Camera(); you cannot create an object for interface
        Camera c = s; // But the interface can have a reference created
        c.photoClick();
        c.videoRecorder();

        // MusicPlayer m = new MusicPlayer(); you cannot create an object for interface
        MusicPlayer m = s; // But the interface can have a reference created
        m.playMusic();
        m.searchMusic();

        Camera c1 = new SmartPhone();
        c1.photoClick(); // dynamic method dispatch
        c1.videoRecorder(); // dynamic method dispatch

        MusicPlayer m1 = new SmartPhone();
        m1.playMusic(); // dynamic method dispatch
        m1.searchMusic(); // dynamic method dispatch

    }
}
