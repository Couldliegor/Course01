public class Main {
    public static Employee[] employees = new Employee[10];
    public static Employee employeeCounter = employees[0];

    public static void main(String[] args) {
        employees[0] = new Employee("Соколова Ева Николаевна", 2, 25000);
        employees[1] = new Employee("Савин Илья Львович", 3, 27000);
        employees[2] = new Employee("Герасимов Роман Леонидович", 1, 25000);
        employees[3] = new Employee("Тихонов Руслан Алексеевич", 5, 40000);
        employees[4] = new Employee("Андреева Екатерина Никитична", 4, 65000);
        employees[5] = new Employee("Кузнецова Анастасия Павловна", 1, 20000);
        employees[6] = new Employee("Сидоров Арсений Денисович", 1, 47000);
        employees[7] = new Employee("Масленников Артём Викторович", 2, 35000);
        employees[8] = new Employee("Романов Иван Александрович", 3, 25000);
        employees[9] = new Employee("Горшкова Кира Константиновна", 5, 27000);
        System.out.println(Employee.salaryPayingPerMonth());
    }
}