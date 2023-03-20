package testEmployee;

class TestEmployee {
    public static void main(String[] args) {
 
    Manager m1 = new Manager(1, "Smith", 23, 1000, 10.0);
    Manager m2 = new Manager(2, "Neo", 33, 2000, 10.0);
    Manager m3 = new Manager(3, "Trinity", 43, 3000, 10.0);
    Manager m4 = new Manager(4, "Morfeus", 53, 4000, 10.0);
    Manager m5 = new Manager(5, "Oracle", 63, 5000, 10.0);
    Manager m6 = new Manager(6, "Architect", 73, 6000, 10.0);
        
    Employee[] employees = new Employee[6];
    employees[0] = m1;
    employees[1] = m2;
    employees[2] = m3;
    employees[3] = m4;
    employees[4] = m5;
    employees[5] = m6;
    
    printArr(employees);
    
    }

  public static void printArr(Employee[] array){
     for(int i = 0; i < array.length; i++){
     System.out.println(array[i]);
    }
    System.out.println("_____________________");
    double sum = 0;
    for(int i = 0; i < array.length; i++){
      sum += array[i].calcSalary();
      }
      System.out.println("Total salary: " + sum);
      System.out.println("_____________________");
      System.out.println("Average salary: " + sum/array.length);
  }
}

