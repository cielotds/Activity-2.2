public class InheritanceSample {
    
    public static void main(String[] args) {
        
        Student student1 = new Student("Cielo Tadas", "Tanggoy, Balayan, Batangas", "BSIT", 2);
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Address: " + student1.getAddress());
        System.out.println("Student Program: " + student1.getProgram());
        System.out.println("Student Year: " + student1.getYear());

        System.out.println("\n");

        Staff staff1 = new Staff("Staf 1", "Sambat, Balayan, Batangas", "BSU Balayan", 5000);
        System.out.println("Staff Name: " + staff1.getName());
        System.out.println("Staff Address: " + staff1.getAddress());
        System.out.println("School: " + staff1.getSchool());
        System.out.println("Salary: " + staff1.getSalary() + " php");
    }
}

class Person{
    protected String name;
    protected String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }
}

class Student extends Person{
    private String program;
    private int year;

    public Student(String name, String address, String program, int year){
        this.name = name;
        this.address = address;
        this.program = program;
        this.year = year;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }
}

class Staff extends Person {
    private String school;
    private double salary;

    Staff(String name, String address, String school, double salary){
        this.name = name;
        this.address = address;
        this.school = school;
        this.salary = salary;
    }

    public void setSchool(String school){
        this.school = school;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public String getSchool(){
        return school;
    }

    public double getSalary(){
        return salary;
    }
}