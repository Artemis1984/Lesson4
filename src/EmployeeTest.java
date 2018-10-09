public class EmployeeTest {

    public static void main(String[] args) {


        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Иван Иванович Иванов", "Младший разработчик", "Ivanov@mail.ru",
                "89999999999", 32, 2000);
        employees[1] = new Employee("Федор Федорович Федоров", "Младший разработчик", "Fedorov@mail.ru",
                "84951231234", 35, 2000);
        employees[2] = new Employee("Сергей Сергеевич Сергеев", "Младший разработчик", "Ivanov@mail.ru",
                "84956564312", 38, 2000);
        employees[3] = new Employee("Кирилл Кириллович Кириллов", "Младший разработчик", "Kirillov@mail.ru",
                "89999999999", 41, 2000);
        employees[4] = new Employee("Антон Антонович Антонов", "Младший разработчик", "Antonov@mail.ru",
                "89999999999", 45, 2000);


        for (Employee oldEmployee : employees){
            System.out.println();
            if (oldEmployee.GetAge() > 40){
                oldEmployee.Show();
            }
        }
    }
}
