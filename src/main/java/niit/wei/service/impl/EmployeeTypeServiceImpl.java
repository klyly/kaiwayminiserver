package niit.wei.service.impl;

import niit.wei.entity.EmployeeType;
import niit.wei.mapper.EmployeeTypeMapper;
import niit.wei.service.EmployeeTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author WeiJinLong
 * @Date 2024-01-23 17:15
 * @Version 1.0
 */
@Service
public class EmployeeTypeServiceImpl implements EmployeeTypeService {
    @Autowired
    private EmployeeTypeMapper employeeTypeMapper;
    @Override
    public List<EmployeeType> employeeTypes() {
        return employeeTypeMapper.employeeTypes();
    }
}
