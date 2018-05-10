# Caesar cipher 

In cryptography, a Caesar cipher is one of the simplest and most widely known encryption techniques. 
The algorithm takes a message stored in a string and shifts every letter a given number of steps in the alphabet. 
For example a caesar cipher with a shift of 1 and "ABC" as an input would output "BCD". If the range of the alphabet is exceeded
the algorithm starts in the beginning of the alphabet.
As an exercise I implemented it in Java. 

```java
package caesar_cipher;

public class start {

	public static void main(String[] args) {
		String input = "TESTING";
		System.out.print(caesar (input, 2));
	}
	
	private static String caesar (String input, int shift){
		char[] cs = input.toCharArray();
		for (int i = 0 ; i < cs.length ; i ++){
			int temp = (int) cs[i];
			if (temp == 90){
				temp = temp - 26;
			}
			cs[i] = (char) (temp + shift);
		}
		
		return new String(cs);
	}	
}
```

First, I worte a function called 'caesar' which takes a string wich it is going to encode and an integer representing how many times the letter should be shifted. 
Since chars can be casted into integers easily, I now only have to convert the string into a char array so I can iterate thorugh the array and shift every letter.

```java
private static String caesar (String input, int shift){
	char[] cs = input.toCharArray();
	cs[i] = (char) (temp + shift);
				
	return new String(cs);
}
```

But this method is not starting in the beginneng of the alphabet if the range of the alphabet is exceeded. 
Therefore, I added oen more if statement.

```java
private static String caesar (String input, int shift){
	char[] cs = input.toCharArray();
	for (int i = 0 ; i < cs.length ; i ++){
		int temp = (int) cs[i];
		if (temp == 90){
			temp = temp - 26;
		}
		cs[i] = (char) (temp + shift);
	}
		
	return new String(cs);
}
```

(Note: the expression (char) 90 equals 'Z')
