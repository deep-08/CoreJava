package wrapperClass;

public class DataConversion {

    public static void main(String[] args) {
        
   // !-- parsemethod will convert the non primitive data type to primitive type;
    	
    	/* String <integer> --> integer */
    	
    	String si1="123";
    	String si2="456";
    	
    	System.out.println(Integer.parseInt(si1)+Integer.parseInt(si2));
    	
    	
        /* String <double> --> double */
        String s1 = "10.5"; 
        String s2 = "20.3";
        // Converting String s1 and s2 to double using Double.parseDouble()and adding the values
        System.out.println(Double.parseDouble(s1) + Double.parseDouble(s2));

        /* String <boolean> --> boolean */
        String s11 = "true"; 
        String s21 = "false";
        // Converting String s11 and s21 to boolean using Boolean.parseBoolean()
        System.out.println(Boolean.parseBoolean(s11)); 
        System.out.println(Boolean.parseBoolean(s21));

        /* String <long> --> long */
        String l1 = "10000000000"; 
        String l2 = "20000000000";
        // Converting String l1 and l2 to long using Long.parseLong() and adding the values
        System.out.println(Long.parseLong(l1) + Long.parseLong(l2));

        
  // !-- valueOf is converting primitive data type to non primitive data type;
        
        /* int --> String */
        int i = 123;
        // Converting int i to String using String.valueOf()
        String i1 = String.valueOf(i);
        System.out.println(i1);

        /* double --> String */
        double d = 123.45;
        // Converting double d to String using String.valueOf()
        String s = String.valueOf(d);
        System.out.println(s);

        /* boolean --> String */
        boolean b = true;
        // Converting boolean b to String using String.valueOf()
        String b1 = String.valueOf(b);
        System.out.println(b1);

        /* long --> String */
        long l = 123456789L;
        // Converting long l to String using String.valueOf()
        String sl1 = String.valueOf(l);
        System.out.println(sl1);

        /* String <char> --> char */
        String sc1 = "Hello";
        // Converting String sc1 to char by accessing the first character using charAt(0)
        char c = sc1.charAt(0);
        System.out.println(sc1);

        /* char --> String */
        char c2 = 'A';
        // Converting char c2 to String using Character.toString()
        String cs1 = Character.toString(c2);
        System.out.println(cs1);

        /* String <float> --> float */
        String sf1 = "10.5"; 
        String sf2 = "20.3";
        // Converting String sf1 and sf2 to float using Float.parseFloat() and adding the values
        System.out.println(Float.parseFloat(sf1) + Float.parseFloat(sf2));

        /* String <short> --> short */
        String sshort = "1000";
        // Converting String short to short using Short.parseShort()
        short sh = Short.parseShort(sshort);
        System.out.println(sh);
    }

}
