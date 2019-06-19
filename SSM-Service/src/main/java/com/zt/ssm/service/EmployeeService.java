package com.zt.ssm.service;

import com.ssm.po.Employee;

public interface EmployeeService {
    /**
     * 根据id查询员工信息
     * @param id
     * @return
     */
    Employee getEmployeeById(Integer id);
}
