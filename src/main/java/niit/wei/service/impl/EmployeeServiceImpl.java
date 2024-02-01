package niit.wei.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.lang.UUID;
import niit.wei.entity.Employee;
import niit.wei.entity.pojo.EmployeePojo;
import niit.wei.mapper.EmployeeMapper;
import niit.wei.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author WeiJinLong
 * @Date 2024-01-19 16:58
 * @Version 1.0
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> employees() {
        return employeeMapper.employees();
    }

    @Override
    public void deleteByKwEmpid(String kwEmpid) {
        employeeMapper.deleteByKwEmpid(kwEmpid);
    }

    @Override
    public int insert(Employee record) {
        return employeeMapper.insert(record);
    }

    @Override
    public Employee selectBykwEmpid(String kwEmpid) {
        return employeeMapper.selectBykwEmpid(kwEmpid);
    }

    @Override
    public int updateByEmpidSelective(Employee record) {
        return employeeMapper.updateByEmpidSelective(record);
    }

    @Override
    public void batchDeleteEmps(List<String> kwEmpids) {
        employeeMapper.batchDeleteEmps(kwEmpids);
    }

    @Override
    public void batchAddEmps(List<Employee> emps) {
        employeeMapper.batchAddEmps(emps);
    }
}
