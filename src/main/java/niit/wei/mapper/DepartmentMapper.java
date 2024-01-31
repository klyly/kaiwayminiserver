package niit.wei.mapper;

import niit.wei.entity.Department;

import java.util.List;

public interface DepartmentMapper {
    int deleteByPrimaryKey(String oid);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(String oid);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKeyWithBLOBs(Department record);

    int updateByPrimaryKey(Department record);

    String departmentName(String oid);

    List<Department> departments();
}