package fc.java.poly;

public class Radio implements RemoCon {
    @Override
    public void chUp() {
        System.out.println("Radio의 채널이 올라간다.");
    }

    @Override
    public void chDown() {
        System.out.println("Radio의 채널이 내려간다.");
    }

    @Override
    public void volup() {
        System.out.println("Radio의 채널이 올라간다.");
    }

    @Override
    public void volDown() {
        System.out.println("Radio의 채널이 내려간다.");
    }
    @Override
    public void internet() {
        System.out.println("Radio에서는 인터넷이 지원이 안됩니다.");
    }
    //chUp(), chDown(), volUp(), VolDown()

}
