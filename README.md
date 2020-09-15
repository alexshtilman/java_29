1.  Update HW #26 EmployeesService

    1. Write two classes in the package DTO (these classes should have the method equals implementations for testing per all fields, constructors for all fields and getters for all fields)

       ```JAVA
       class MinMaxSalaryEmployees {
           int minSalary;
           int maxSalary;
           List<Employee> employees; //list of employees receiving salary in the range    from minSalary (inclusive) to  maxSalary (exclusive)
       }

       class DepartmentSalary {
           String department;
           double avgSalary; //average salary in the department
       }
       ```

    1. Add two methods in the interface EmployeeService
       - `MinMaxSalaryEmployees[] getEmployeesBySalariesInterval(int interval)` returns array of the MinMaxSalaryEmployees objects sorted by minSalary value
       - `DepartmentSalary[] getDepartmentAvgSalaryDistribution()` returns array of the DepartmentSalary objects sorted by the descending order of the average salary values. - Write implementations of the methods described in the 1.2 in the class EmployeeServiceMapsImpl - Write tests for these methods
