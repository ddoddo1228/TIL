package fc.java.part2;

public class ObjectArrayExam {
    public static void main(String[] args) {
        //영화 3편 저장할 배열 생성, 데이터 저장 및 출력
        Movie[] m= new Movie[3];
        m[0]= new Movie();
        m[0].mtitle="A영화";
        m[0].mmajor="김씨";
        m[0].mtime=160;
        m[0].mlevel=15;
        m[0].mday="2024-01-14";

        m[1] = new Movie();
        m[1]= new Movie();
        m[1].mtitle="B영화";
        m[1].mmajor="이씨";
        m[1].mtime=160;
        m[1].mlevel=15;
        m[1].mday="2024-01-15";

        m[2] = new Movie();
        m[2]= new Movie();
        m[2].mtitle="C영화";
        m[2].mmajor="야씨";
        m[2].mtime=160;
        m[2].mlevel=15;
        m[2].mday="2024-01-16";

        for(int i=0; i<m.length;i++){
            System.out.println(m[i].mtitle+"\t"+m[i].mmajor+"\t"+m[i].mtime+"\t"+ m[i].mtime+"\t"+m[i].mlevel+"\t"+m[i].mday);
        }

    }
}
