package com.htfg.boot.api;

import com.htfg.boot.entity.Employee;

public interface EmployeeService {
	/**
	 * 根据员工姓名查询 
	 * @param employeeName
	 * @return
	 */
	Employee queryEmployeeByName(String employeeName);
}
