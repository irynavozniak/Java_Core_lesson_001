package ua.lviv.lgs;

public class Application {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		int a = 126;
		byte b = 33;
		short c = -1490;
		long d = 3440393;
		double e = 454.67;
		float f = 178;
		char g = 56;
		boolean h = false;
	
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		System.out.println("f = " + f);
		System.out.println("g = " + g);
		System.out.println("h = " + h);
		
		System.out.println("Max Byte = " + Byte.MAX_VALUE);
		System.out.println("Min Byte = " + Byte.MIN_VALUE);
		System.out.println("Max Short = " + Short.MAX_VALUE);
		System.out.println("Min Short = " + Short.MIN_VALUE);
		System.out.println("Max Long = " + Long.MAX_VALUE);
		System.out.println("Min Long = " + Long.MIN_VALUE);
		System.out.println("Max Int = " + Integer.MAX_VALUE);
		System.out.println("Min Int = " + Integer.MIN_VALUE);
		System.out.println("Max Double = " + Double.MAX_VALUE);
		System.out.println("Min Double = " + Double.MIN_VALUE);
		System.out.println("Max Float = " + Float.MAX_VALUE);
		System.out.println("Min Float = " + Float.MIN_VALUE);
		System.out.println("Max Char = " + (int) Character.MAX_VALUE);
		System.out.println("Min Char = " + (int) Character.MIN_VALUE);
		System.out.println("False Boolean = " + Boolean.FALSE);
		System.out.println("True Boolean = " + Boolean.TRUE);
	
		int a1 = new Integer(Integer.MAX_VALUE);
		System.out.println("Max Int = " + a1);
		int a2 = new Integer(Integer.MIN_VALUE);
		System.out.println("Max Int = " + a2);
		byte b1 = new Byte(Byte.MAX_VALUE);
		System.out.println("Max Byte = " + b1);
		byte b2 = new Byte(Byte.MIN_VALUE);
		System.out.println("Min Byte = " + b2);
		short c1 = new Short(Short.MAX_VALUE);
		System.out.println("Max Short = " + c1);
		short c2 = new Short(Short.MIN_VALUE);
		System.out.println("Min Short = " + c2);
		long d1 = new Long(Long.MAX_VALUE);
		System.out.println("Max Long = " + d1);
		long d2 = new Long(Long.MIN_VALUE);
		System.out.println("Min Long = " + d2);
		double e1 = new Double(Double.MAX_VALUE);
		System.out.println("Max Double = " + e1);
		double e2 = new Double(Double.MIN_VALUE);
		System.out.println("Min Double = " + e2);
		float f1 = new Float(Float.MAX_VALUE);
		System.out.println("Max Float = " + f1);
		float f2 = new Float(Float.MIN_VALUE);
		System.out.println("Min Float = " + f2);
		char g1 = new Character(Character.MAX_VALUE);
		System.out.println("Character Byte = " + (int) g1);
		char g2 = new Character(Character.MIN_VALUE);
		System.out.println("Character Byte = " + (int) g2);
		boolean h1 = new Boolean(Boolean.FALSE);
		System.out.println("FALSE Boolean = " +h1);
		boolean h2 = new Boolean(Boolean.TRUE);
		System.out.println("TRUE Boolean = " + h2);
		
		int array[] = new int[] {5, 78, 670, 12, 45, 6543, 564, 3, 9865435, 3532};
		int max = array[0];
		int min =array[0];
		 for (int i = 0; i < 10; i++) {
	            if (max < array[i])
	                max = array[i];
		}
		 System.out.println("Максимальне число в масиві: " + max);
		 for (int i = 0; i < 10; i++) {
	            if (min > array[i])
	                min = array[i];
		}
		 System.out.println("Мінімальне число в масиві: " + min);
	}
		}
	//First commit to gitHub


