package fc.java.poly;

public class TV implements RemoCon {
    @Override
    public void chUp() {
        System.out.println("TV채널이 올라간다.");
    }

    @Override
    public void chDown() {
        System.out.println("TV채널이 내려간다.");
    }

    @Override
    public void volup() {
        System.out.println("TV채널이 올라간다.");
    }

    @Override
    public void volDown() {
        System.out.println("TV채널이 내려간다.");
    }
    @Override
    public void internet() {
        System.out.println("TV에서 인터넷 실행된다.");
    }
    //chUp(), chDown(), volUp(), VolDown()
}
