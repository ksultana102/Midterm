package design;
import org.junit.Assert;
import org.junit.Test;


public class UnitTestingEmployeeInfo {
    @Test
    public void Test() {
        EmployeeInfo employeeInfo = new EmployeeInfo("Samia", 12);

        employeeInfo.setSalary(5000);

        Assert.assertEquals(500, EmployeeInfo.calculateEmployeePension());
        Assert.assertEquals(900, EmployeeInfo.calculateEmployeeBonus(5));
        Assert.assertEquals(5000, employeeInfo.calculateSalary());
        Assert.assertEquals(12, employeeInfo.employeeId());
        Assert.assertEquals("Samia", employeeInfo.employeeName());

    }
}




