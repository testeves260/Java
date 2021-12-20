package entities;

public class Empregados {

    private String name;
    private int id;
    private double salary;

    public Empregados(String name, int id, double salary){

        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public int getID(){
        return this.id;
    }

    public void setID(int id){
        this.id = id;
    }

    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSalaryRaise(double percentage){
        this.salary = this.salary + (this.salary * (percentage/100));
    }
}
