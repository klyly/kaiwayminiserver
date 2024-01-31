package niit.wei.mapper;

import niit.wei.entity.EmployeeType;

import java.util.List;

public interface EmployeeTypeMapper {
    int deleteByPrimaryKey(String oid);

    int insert(EmployeeType record);

    int insertSelective(EmployeeType record);

    EmployeeType selectByPrimaryKey(String oid);

    int updateByPrimaryKeySelective(EmployeeType record);

    int updateByPrimaryKeyWithBLOBs(EmployeeType record);

    int updateByPrimaryKey(EmployeeType record);

    String employeeTypeName(String oid);

    List<EmployeeType> employeeTypes();
}