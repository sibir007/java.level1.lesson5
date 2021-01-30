package ru.geekbrains.java.level1.lesson5;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employeeArr = new Employee[5];
        employeeArr[0] = new Employee(
                "Sibiryakov Dmitriy Olegovich",
                "Manager",
                "Sibiryakov@mail.ru",
                "8-800-000-00-00",
                70000,
                46);
        employeeArr[1] = new Employee(
                "Spitsin Roman Sergeevich",
                "Manager",
                "Spitsin@mail.ru",
                "8-800-000-00-01",
                60000,
                30
        );
        employeeArr[2] = new Employee(
                "Verbenko Margarita Alekseevna",
                "Specialis",
                "Verbenko@mail.ru",
                "8-800-000-00-02",
                50000,
                25
        );
        employeeArr[3] = new Employee(
                "Shapovalov Vitaliy Ivanovich",
                "Specialist",
                "Shapovalov@mail.ru",
                "8-800-000-00-03",
                60000,
                55
        );
        employeeArr[4] = new Employee(
                "Mihailov Andrey Sergeevich",
                "Specialist",
                "Mihailov@mail.ru",
                "8-800-000-00-04",
                55000,
                32
        );
        for (Employee employee : employeeArr) {
            if (employee.getAge() > 40) {
                System.out.println(employee);
            }
        }
    }
}
