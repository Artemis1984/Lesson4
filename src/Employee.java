public class Employee {

    private String name;
    private String position;
    private String email;
    private String phonenumber;
    private int age;
    private int salary;

    public Employee(String _name, String _position, String _email, String _phonenumber, int _age, int _salary){
        this.name = _name;
        this.position = _position;
        this.email = _email;
        this.phonenumber = _phonenumber;
        this.age = _age;
        this.salary = _salary;
    }

    public void Show(){
        System.out.print("ФИО - " + name + ", Должность - " + position + ", email - "
                + email + ", Телефон - " + phonenumber + ", Возраст - " + age + ", Зарплата - " + salary + "$");
    }

    public int GetAge(){
        return age;
    }
}
