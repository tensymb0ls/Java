package incapsulation;
public class App {

    public static void main(String[] args) {
    Student s1 = new Student();
    s1.setName("John"); 
    s1.setAge(18); 

    Student s2 = new Student();
    s2.setName("Jack");
    s2.setAge(23);
        
    Student[] students = {s1, s2};
    System.out.println(avgAge(students));
    System.out.println(s2.getName());      
    }

    public static int avgAge (Student[] arr) { //средний возраст
        int count = 0;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != null){
                count++;
                sum += arr[i].getAge();
            }
        }
        return sum / count;
    }
}

