import java.util.*;
public class KimuraMain{
	public static void main(String[] args){
		int[][] nums= new int[3][];
		nums[0] = new int[]{2,3,4};
		nums[1] = new int[]{4,1,4,5};
		nums[2] = new int[]{8,3};
		for(int i=0;i<nums.length;i++){
			if(i==0){
				System.out.println("{");
			}
			for(int j=0;j<nums[i].length;j++){
				if(j==0){
					System.out.printf("\t{");
				}
				System.out.print(nums[i][j]);
				if(j==nums[i].length-1){
					break;
				}
				System.out.print(",");
			}
			System.out.println("},");
		}
		System.out.println("}");
	}
}
