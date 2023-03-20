package testEmployee;

public class Manager extends SalaryEmployee {
    private double bonuses;

      public Manager(double bonuses, double salary){
        super();
        this.bonuses = bonuses;
    }
            public double getBonuses() {
                return bonuses;
              }
            public void setBonuses(double bonuses) {
                this.bonuses = bonuses;
              }
    public Manager(int id, String name, int age, double salary, double bonuses){
      super(id, name, age, salary);
      this.bonuses = bonuses;
  }

    //@override
    public double calcSalary(){
      return super.getSalary() + (super.getSalary() * bonuses);
    }
   // @override
    public String toString(){
      return super.toString()  + " " + calcSalary();
    }
}
