package niit.wei.service;

import niit.wei.entity.Employee;
import niit.wei.entity.pojo.EmployeePojo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author WeiJinLong
 * @Date 2024-01-19 16:57
 * @Version 1.0
 */
public interface EmployeeService {
    List<Employee> employees();

    void deleteByKwEmpid(String kwEmpid);

    int insert(Employee record);

    Employee selectBykwEmpid(String kwEmpid);

    int updateByEmpidSelective(Employee record);

    void batchDeleteEmps(@Param("kwEmpids") List<String> kwEmpids);

    void batchAddEmps(@Param("emps") List<Employee> emps);
}
