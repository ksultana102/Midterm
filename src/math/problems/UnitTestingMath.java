package math.problems;

import design.EmployeeInfo;
import org.junit.Assert;
import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class UnitTestingMath {

        //Apply Unit testing into each classes and methods in this package.
        @Test
        public void Test() {
            Factorial factorial = new Factorial();

            factorial.factorial(4);

            Assert.assertEquals(24,factorial.factorial(4));
            Fibonacci fibonacci=new Fibonacci();
            public void fibonacci_iterative() {
                Assert.assertEquals(34, fibonacci(8));

            }
