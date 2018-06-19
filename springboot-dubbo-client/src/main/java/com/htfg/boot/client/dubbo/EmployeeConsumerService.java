package com.htfg.boot.client.dubbo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.htfg.boot.api.EmployeeService;
import com.htfg.boot.entity.Employee;


@Component
public class EmployeeConsumerService {
	
	//@Autowired
	@Reference(version="1.0.0")
	EmployeeService employeeService;
	
	public void printEmployee() {  
        String employeeName = "上海";  
        if(employeeService == null){  
            System.out.println("employeeService 服务对象 为空");  
        }else {
        Employee employee = employeeService.queryEmployeeByName(employeeName);
        System.out.println(employee.toString());  
        }
    }

}
