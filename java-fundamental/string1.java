package java_string;

class StringExample1{
    public static void main(String[] args){
        String text = "     No time to die  ";
        String trimmed_text = text.trim();
        System.out.println(trimmed_text);

        // String replace
        // replaceFirst() and replaceAll()
        String source   = "123abc";
        String replaced = source.replace("ab", "@2");
        System.out.println(replaced);
        
    }
}