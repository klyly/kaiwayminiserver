package niit.wei.mapper;

import niit.wei.entity.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {
    int deleteByPrimaryKey(String oid);

    void deleteByKwEmpid(String kwEmpid);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(String oid);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

    List<Employee> employees();

    Employee selectBykwEmpid(String oid);

    int updateByEmpidSelective(Employee record);

    void batchDeleteEmps(@Param("kwEmpids") List<String> kwEmpids);
}