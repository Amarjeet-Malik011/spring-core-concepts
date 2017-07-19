package springbean_autowiring.XML_based;


import springbean_autowiring.Employee;

public class EmployeeService {

    private Employee employeeasd;

    // constructor is used for autowire by constructor
    public EmployeeService(Employee emp) {
        System.out.println("Autowiring by constructor used ");
        this.employeeasd = emp;
    }

    // default constructor to avoid BeanInstantiationException for autowire
    // byName or byType
    public EmployeeService() {
        System.out.println("Default Constructor used");
    }

    // used for autowire byName and byType
    public void setEmployee(Employee emp) {
        System.out.println("Autowiring By name");
        this.employeeasd = emp;
    }

    public Employee getEmployee() {
        return this.employeeasd;
    }
}
