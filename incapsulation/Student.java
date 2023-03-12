package incapsulation;

public class Student {
    private String name;
    private int age;
    public void setName(String newName){
        if(newName != null){
name = newName;
        }else{System.out.println("Name not set");}
    }
    public void setAge(int newAge){
        if(newAge < 0){
            age = -newAge;
        }else if(newAge > 120){
            age = 120;
        }else{
            age = newAge;
        }
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
