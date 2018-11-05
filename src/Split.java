import java.util.Arrays;

public class Split {

	public static void main(String[] args) {

// Your task Part 0

//String.split();

//It's a method that acts on a string, <StringName>.split(<String sp>);

//Where sp is the string where the string splits

//And it returns an array

// Example: "I like apples!".split(" ");

// it will split at spaces and return an array of ["I","like","apples!"]
		System.out.println(Arrays.toString("I like apples!".split(" ")));
// Example 2: "I really like really red apples"split("really")

// it will split at the word "really" and return an array of ["I "," like ","red apples!"]
		System.out.println(Arrays.toString("I really like really red apples".split("really")));
//play around with String.split!

//What happens if you "I reallyreally likeapples".split("really") ?
		System.out.println(Arrays.toString("I reallyreally likeapples".split("really")));
		sandwich("bread apples pineapples bread lettuce tomato bacon mayo ham bread cheese");
		splitBread(" apples pineapples lettuce tomato bacon mayo ham cheese bread");
	}
	
//Your task Part 1:

/*Write a method that take in a string like
* "applespineapplesbreadlettucetomatobaconmayohambreadcheese"
* describing a sandwich.
* Use String.split to split up the sandwich by the word "bread" and return what's in the middle of
* the sandwich and ignores what's on the outside
* What if it's a fancy sandwich with multiple pieces of bread?
*/ 
	
	public static void sandwich(String ingredients) {
		int countBread= (ingredients.length()-ingredients.replace("bread","").length())/5;
		int breadOne=ingredients.indexOf("bread");
		if(countBread==0) {
			countBread+=1;
		}
		String bread1=ingredients.substring(breadOne +5);
		String[] arraySand = bread1.split("bread");
		if(countBread==arraySand.length) {
			String[] arrayWich= new String[arraySand.length-1];
			for(int i=0;i<arrayWich.length;i++ ) {
				arrayWich[i]=arraySand[i];
			}
			System.out.println(Arrays.toString(arrayWich));
		}else {
			System.out.println(Arrays.toString(arraySand));
		}
		
	}
//Your task pt 2:

/*Write a method that take in a string like
* "apples pineapples bread lettuce tomato bacon mayo ham bread cheese"
* describing a sandwich
* use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of
* the sandwich and ignores what's on the outside.
* Again, what if it's a fancy sandwich with multiple pieces of bread?
*/
		public static void splitBread(String ingredients) {
			int countBread= (ingredients.length()-ingredients.replace("bread","").length())/5;
			int breadOne=ingredients.indexOf("bread");
			if(countBread==0) {
				countBread+=1;
			}
			String bread1=ingredients.substring(breadOne +5);
			String[] arraySand = bread1.split("bread");
			if(countBread==arraySand.length) {
				String[] arrayWich= new String[arraySand.length-1];
				for(int i=0;i<arrayWich.length;i++ ) {
					arrayWich[i]=arraySand[i];
				}
				String[] arrayWich1;
				if(countBread==1) {
					arrayWich1 = Arrays.toString(arrayWich).replace(",  ","").replace("[","").replace("]","").split(" ");
				}else {
					arrayWich1 = Arrays.toString(arrayWich).replace(",  ","").replace("[ ","").replace(" ]","").split(" ");
				}
				System.out.println(Arrays.toString(arrayWich1));
			}else {
				String[] arraySand1 = Arrays.toString(arraySand).replace(",  ","").replace("[ ","").replace(" ]","").split(" ");
				System.out.println(Arrays.toString(arraySand1));
			}
			

 }

}
