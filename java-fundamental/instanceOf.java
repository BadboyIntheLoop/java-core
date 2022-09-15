package java_instanceof;

//The Java instanceof operator can determine if a given Java object
// is an instance of a given class, superclass or interface

import java.util.HashMap;
import java.util.Map;


class instanceofExample{
    public static void main(String[] args){
        Map<Object, Object> map = new HashMap();
        boolean mapIsObject = map instanceof Object;
        System.out.println(mapIsObject);
    }
}