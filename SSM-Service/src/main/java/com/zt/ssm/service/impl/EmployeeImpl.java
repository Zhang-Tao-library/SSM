package com.zt.ssm.service.impl;

import com.ssm.mapper.EmployeeMapper;
import com.ssm.po.Employee;
import com.zt.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("employeeService")
@Transactional
public class EmployeeImpl implements EmployeeService {

//    注入mapper
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public Employee getEmployeeById(Integer id) {
        return employeeMapper.selectByPrimaryKey(id);
    }
}
