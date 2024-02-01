package niit.wei;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.lang.UUID;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import niit.wei.entity.Department;
import niit.wei.entity.Employee;
import niit.wei.entity.pojo.EmployeePojo;
import niit.wei.mapper.DepartmentMapper;
import niit.wei.mapper.EmployeeMapper;
import niit.wei.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
class KaiwayminiserverApplicationTests {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private DepartmentMapper departmentMapper;

    @Autowired
    private EmployeeService employeeService;

    @Test
    void contextLoads1() {
        PageHelper.startPage(1,2);
        List<Employee> employee = employeeMapper.employees();
        PageInfo<Employee> pageInfo = new PageInfo<>(employee);
        System.out.println(pageInfo+"--->");
        List<EmployeePojo> employeePojos = BeanUtil.copyToList(employee, EmployeePojo.class);
        PageInfo<EmployeePojo> employeePojosInfo = new PageInfo<>();
        BeanUtil.copyProperties(pageInfo, employeePojosInfo);
        employeePojosInfo.setList(employeePojos);
        System.out.println(employeePojosInfo);
    }
    @Test
    void contextLoads2() {
//        List<Department> departments = departmentMapper.departments();
//        for (Department department : departments) {
//            System.out.println(department);
//        String uuid = UUID.randomUUID().toString();
//        System.out.println(uuid);
//        Employee employee = employeeMapper.selectBykwEmpid("KW01");
//        System.out.println(employee);
        List<String> ls = new ArrayList<String>();
        ls.add("KW01");
        ls.add("KW02");
        employeeMapper.batchDeleteEmps(ls);

    }

    @Test
    void contextLoads3() {
        List<Employee> list = new ArrayList<>();
        Employee employee = new Employee("1231215","123","123","30904396-aa9c-447b-b7b6-3cc7bf6e2e78","32f3c1b6-58d2-400b-9dbd-d167fd902a31",new Date(),new Date(),null,null);
        Employee employee1 = new Employee("1231213","124","123","30904396-aa9c-447b-b7b6-3cc7bf6e2e78","32f3c1b6-58d2-400b-9dbd-d167fd902a31",new Date(),new Date(),null,null);
        Employee employee2 = new Employee("1231214","125","123","30904396-aa9c-447b-b7b6-3cc7bf6e2e78","32f3c1b6-58d2-400b-9dbd-d167fd902a31",new Date(),new Date(),null,null);
        list.add(employee);
        list.add(employee1);
        list.add(employee2);
        employeeMapper.batchAddEmps(list);
    }
}
