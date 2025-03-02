import java.util.ArrayList;

public class LearnArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>();
		
		arr.add(20);
		arr.add(30);
		arr.add(40);
		System.out.println(arr);
		
		arr.add(50);
		System.out.println(arr);

		for(int i=0;i<arr.size();i++) {
			System.out.println("The element is : " + arr.get(i));
			}
		
		ArrayList<Integer>	arr1=new ArrayList<>();
		arr1.add(60);
		arr1.add(70);
		arr1.add(80);
		System.out.println(arr1);
		
		System.out.println(arr.get(3));
		
		arr.addAll(arr1);
		System.out.println(arr);
		
		int count=arr.size();
		System.out.println(count);
		
		arr.remove(Integer.valueOf(50));
	    System.out.println(arr);
						
		arr.add(2,10);
        System.out.println(arr);
		
		for(Integer element : arr){
			System.out.println("The element is : " +element);
		}
		
		System.out.println(arr.contains(20));
		
//		arr.clear();
//	    System.out.println(arr);

	    arr.removeAll(arr);
	    System.out.println(arr);
		

	}

}
