package niit.wei.service.impl;

import niit.wei.entity.Department;
import niit.wei.mapper.DepartmentMapper;
import niit.wei.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author WeiJinLong
 * @Date 2024-01-23 16:49
 * @Version 1.0
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;


    @Override
    public List<Department> departments() {
        return departmentMapper.departments();
    }
}
