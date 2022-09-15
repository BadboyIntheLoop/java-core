package java_string;

class StringExample{
    public static void main(String[] args){
        String str = "hello world";
        String sub_str = str.substring(0,5);
        int index = str.indexOf("l"); // Find the first index of substring
        int lastind =  str.lastIndexOf("l");
        boolean matches = str.matches(".*wo.*"); // check match with sub string
        System.out.println(sub_str);
        System.out.println(matches);
        System.out.println(index + " " + lastind);
    }

}