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
