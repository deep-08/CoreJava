package arrayListPack;

public class FindHowManyDuplicatesArray {

	public static void main(String[] args) {
		int a[]= {100,200,100,300,100,400,100};
		int num=100;
		int count = 0;
		
		for (int values : a) {
			if (values==num) {
				count++;
			}
		}
		System.out.println(count);
		

	}

}
