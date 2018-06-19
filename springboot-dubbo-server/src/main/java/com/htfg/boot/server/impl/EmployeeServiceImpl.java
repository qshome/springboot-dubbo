package com.htfg.boot.server.impl;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.htfg.boot.api.EmployeeService;
import com.htfg.boot.entity.Employee;


@Component
@Service(version="1.0.0")
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Employee queryEmployeeByName(String employeeName) {
		return new Employee(1,"上海","大城市");
	}

}
