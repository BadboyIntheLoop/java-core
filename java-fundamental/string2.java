package java_string;

class StringExample2{
    public static void main(String[] args){
        String str = "hello world";
        String str1 = "abd";
        String str2 = "ABD";
        System.out.println(str.equals(str1));
        System.out.println(str1.equalsIgnoreCase(str2));

        // startsWith() and endsWith()
        System.out.println("-----------------------");
        String text = "This is a good day to code";
        System.out.println( text.startsWith("This"));
        System.out.println( text.startsWith("is", 5) );

        // compareTo()
        System.out.println("-----------------------");
        String one   = "abc";
        String two   = "def";
        String three = "adb";
        // Compare to in order
        System.out.println( one.compareTo(two)   );
        System.out.println( one.compareTo(three) );

    }

}