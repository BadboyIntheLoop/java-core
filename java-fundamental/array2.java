package java_array;
import java.util.Arrays;
import java.util.Comparator;

class SortingArray{
    private static class Employee{
        public String name;
        public int    employeeId;

        public Employee(String name, int employeeId){
            this.name       = name;
            this.employeeId = employeeId;
        }
    }   
    public static void main(String[] args){
        int[] arr = {6, 7, 23, 25, 9, 1, 4};
        int[] arr1 = new int[10];
        Arrays.fill(arr1, 1213); 
        //Arrays.fill(arr1, 12, start, end) <-> Fill form start to end-1
        Arrays.sort(arr);
        Employee[] employeeArray = new Employee[3];
        
        employeeArray[0] = new Employee("Xander", 1);
        employeeArray[1] = new Employee("John"  , 3);
        employeeArray[2] = new Employee("Anna"  , 2);

        Arrays.sort(employeeArray, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.name.compareTo(e2.name);
            }
        });
        System.out.println(Arrays.toString(arr));
        for(int i=0; i < employeeArray.length; i++) {
            System.out.println(employeeArray[i].name);
        }

        // Another functions
        /* Arrays.binarySearch(int[] arr, element);
        Arrays.equals(int[] arr1, int[] arr2); */
    }
}