
public class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public double getSalary()
    {
        return this.salary;
    }

    public String getName()
    {
        return this.name;
    }

    public int getId()
    {
        return this.id;
    }
}

class TaxCalculator
{
    Employee employee;

    public TaxCalculator(Employee e)
    {
        this.employee = e;
    }

    public double calculateTax() {
        // Calculate income tax logic here
        double taxPercentage = 0.2;
        return this.employee.getSalary() * taxPercentage;
    }
}

interface FileSaver
{
    public void save();
}

class DatabaseFileSaver implements FileSaver
{
    Employee employee;

    public DatabaseFileSaver(Employee e)
    {
        this.employee = e;
    }

    public void save() {
        // Save employee data to the database
        // Database interaction logic here
    }
}

class PayrollReportGenerator
{
    Employee employee;

    public PayrollReportGenerator(Employee e)
    {
        this.employee = e;
    }

    public void generatePayrollReport() {
        // Generate a payroll report
        // Payroll report generation logic here
    }
}


// The Employee class has three responsibilities: calculating tax, saving to the
// database, and generating a payroll report. According to SRP, a class should have only
// one reason to change, but this class can change for various reasons (e.g., tax
// calculation changes, database changes, report generation changes). Modify the
// classes to make it SRP-Complaint