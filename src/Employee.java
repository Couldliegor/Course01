public class Employee {
    String name;
    private int department;
    private int salary;
    private final int id;
    private static int counterId;
    public Employee(String name, int department, int salary) {
        if (department < 0 || department > 5) {
            throw new IllegalArgumentException("invalid value");
        }
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = ++counterId;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public static int getCounterId() {
        return counterId;
    }

    public String getName() {
        return name;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("id of worker :%d worker :%s, department N %d, Salary : %d", id , name , department, salary ) ;
    }

    public static int salaryPayingPerMonth() {
        int sum = 0;
        for (Employee employee : Main.employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public void printEmployeesInformation() {
        for (Employee employee : Main.employees) {
            System.out.println(employee.toString());
        }
    }

    public Employee minSalaryWorker() {
        if (null == Main.employeeCounter) {
            throw new RuntimeException("You havent got any workers");
        }
        int min = Integer.MAX_VALUE;
        int counter = -2;
        for (int i = 0; i < Main.employees.length ; i++) {
            if(Main.employees[i] != null && Main.employees[i].getSalary() < min){
                min = Main.employees[i].getSalary();
                counter = i;
            }
        }
        return Main.employees[counter];
    }

    public Employee maxSalaryWorker() {
        int max = Integer.MIN_VALUE;
        int counter = -1;
        for (int i = 0; i < Main.employees.length; i++) {
            if(Main.employees[i] != null && Main.employees[i].getSalary() > max){
                max = Main.employees[i].getSalary();
                counter = i;
            }
        }
        return Main.employees[counter];
    }
    public double getMiddleEmployeeSalary(){
        double sum = salaryPayingPerMonth();
        return sum / id;
    }

    public void printFullNames() {
        for (Employee employee : Main.employees) {
            System.out.println(employee.getName());
        }
    }
}
