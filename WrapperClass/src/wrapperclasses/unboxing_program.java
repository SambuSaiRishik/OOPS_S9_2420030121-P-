package wrapperclasses;

public class unboxing_program {
	public static void main(String[] args) {
		Integer i = 50;
		Character c= 'S';
		System.out.println(int_Value(i));
		System.out.println(Char_Value(c));
	}

	private static char[] Char_Value(Character c) {
		return new char[]{c};
	}

	private static char[] int_Value(Integer i) {
		String s = i.toString();           
        return s.toCharArray(); 
	}
	}

