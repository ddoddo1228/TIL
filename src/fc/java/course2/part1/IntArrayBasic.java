package fc.java.course2.part1;

public class IntArrayBasic {
    public static void main(String[] args) {
        //정수 5개 배열에 저장, 출력
        int[] nums = new int[5];
        nums[0]=1;
        nums[1]=2;
        nums[2]=3;
        nums[3]=4;
        nums[4]=5;
        //nums.length: 길이를 구하는 동작
        for(int i = 0; i<nums.length;i++){
            int data=nums[i];
            System.out.println(data);
        }
        //향상된 for문(foreach)
        for(int data:nums){
            System.out.println(data);
        }

    }
}
