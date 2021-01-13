package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;     //import java.util.*
public class ArrayList1 {

	public static void main(String[] args) {

		 
			String [] arr = new String[] {"one", "two", "three"};
			/* Array -> ArrayList */
			//1) List 하나씩 옮기기 ( * int와 같은 primitive type의 경우 사용 )
			List<String> list = new ArrayList<String>();
			
			for(String s : arr) {
				
				list.add(s);
				
			}
		   //2) Arrays.asList() 메소드 사용하기 (가장 많이 사용)
		   List<String> list1 = new ArrayList<>(Arrays.asList(arr));
		   
		   System.out.println(list1);    //[one, two, three]
		   
		   //3) Collections.addAll() 메소드 사용하기  * src 와 dst 의 복사
		   List<String> list2 = new ArrayList<>();
		   
		   Collections.addAll(list2, arr);
		   
		   System.out.println(list2);      //[one, two, three]
		   
		   //4) List 인터페이스의 addAll() 메소드 사용하기
		   List<String> list3 = new ArrayList<>();
		   
		   list3.addAll(Arrays.asList(arr));
		   
		   System.out.println(list3);      //[one, two, three]
		   
		   /* ArrayList -> Array (array를 크기에 맞게 생성한 후 List 인터페이스의 toArray() 메소드 사용하기) */
		   
		   List<String> list4 = new ArrayList<String>();

		   list4.add("one");

		   list4.add("two");

		   list4.add("three");

		   String[] arr1 = new String[list4.size()];

		   list4.toArray(arr1);

		 

		   for(String s : arr1) {

		         System.out.print(s);     //one two three

		   }

	}

}
