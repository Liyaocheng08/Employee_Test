package net.javaguides.ems.mapper;

import net.javaguides.ems.dto.EmployeeDto;
import net.javaguides.ems.entity.Employee;

public class EmployeeMapper {
//    public static EmployeeDto mapToEmployeeDto(Employee employee) {
//        return EmployeeDto.builder()
//                .id(employee.getId())
//                .firstName(employee.getFirstname())
//                .lastName(employee.getLastName())
//                .email(employee.getEmail())
//                .build();
//    }


    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }
    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
