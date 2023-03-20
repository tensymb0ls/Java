package testEmployee;

public class WageEmployee extends Employee {
    private double hourPrice;
    private int hours;

    public WageEmployee(double hourPrice, int hours){
      this.hourPrice = hourPrice;
      this.hours = hours;
    }

	         public double getHourPrice() {
	         	return hourPrice;
	         }

	         public void setHourPrice(double hourPrice) {
	         	this.hourPrice = hourPrice;
	         }

	         public int getHours() {
	         	return hours;
	         }

	         public void setHours(int hours) {
	         	this.hours = hours;
	         }
  //@override
    public double calcSalary(){
      return hours * hourPrice;
    }
    //@override
    public String toString(){
      return super.toString() + " " + calcSalary();
    }
  }
