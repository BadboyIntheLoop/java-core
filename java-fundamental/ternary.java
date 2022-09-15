package java_ternary;

class TernaryExample{
    public static class A{
        private static int value;
        public A(int v){
            value = v;
        }
        public static int getValue(){
            return value;
        }
    }
    public static void main(String[] args){
        A initA = new A(8);
        int value = (initA != null) ? initA.getValue() : null;
        System.out.println(value);
    }
}