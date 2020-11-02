package HW4;

import com.sun.jdi.Method;

public class Employee {

    public int id;
    public String name;
    public int age;
    public String position;
    public String phoneNum;
    public int salary;

    Employee(String name, int age, String position, String phoneNum, int salary, int id){
        this.name = name;
        this.age = age;
        this.position = position;
        this.phoneNum = phoneNum;
        this.salary = salary;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getPosition(){
        return position;
    }

    public String getPhoneNum(){
        return phoneNum;
    }

    public int getSalary(){
        return salary;
    }

    public void salaryUp() {
        if (getAge() >= 45) {
            setSalary();
        }
    }

    public int setSalary() {
        this.salary = salary + 5000;
        return salary;
    }

    public int setId() {
        this.id = (int) (Math.random() * 100);
        return id;
    }

}
