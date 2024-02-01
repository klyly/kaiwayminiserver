package niit.wei.controller;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.lang.UUID;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import niit.wei.entity.Employee;
import niit.wei.entity.pojo.EmployeePojo;
import niit.wei.service.EmployeeService;
import niit.wei.utils.ExcelUtils;
import niit.wei.utils.ResultCode;
import niit.wei.utils.ResultJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * @Author WeiJinLong
 * @Date 2024-01-19 16:56
 * @Version 1.0
 */
@RestController
@RequestMapping("emp")
@CrossOrigin
@Slf4j
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

//    分页查询用户
    @GetMapping("/employees")
    public ResultJson<PageInfo<EmployeePojo>> getEmployees(@RequestParam("pageNo") Integer pageNo,@RequestParam("pageSize") Integer pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        List<Employee> employees = employeeService.employees();
        PageInfo<Employee> pageInfo = new PageInfo<>(employees);
        List<EmployeePojo> employeePojos = BeanUtil.copyToList(employees, EmployeePojo.class);
        PageInfo<EmployeePojo> page = new PageInfo<>();
        BeanUtil.copyProperties(pageInfo, page);
        page.setList(employeePojos);
        log.info("page:{}",page);
        return new ResultJson<>(page, ResultCode.SUCCESS);
    }
//    删除用户
    @GetMapping("/deleteEmpByEmpId")
    public ResultJson deleteEmployeeById(@RequestParam("kwEmpid") String kwEmpid){
        employeeService.deleteByKwEmpid(kwEmpid);
        return new ResultJson(null,ResultCode.SUCCESS);
    }
//    添加用户
    @PostMapping("/insertEmp")
    public ResultJson<Integer> insertEmp(@RequestBody Employee employee){
        String uuid = UUID.randomUUID().toString();
        employee.setOid(uuid);
        int insert = employeeService.insert(employee);
        return new ResultJson<>(insert,ResultCode.SUCCESS);
    }

//    查询单个用户
    @GetMapping("/employee")
    public ResultJson<EmployeePojo> getEmployee(@RequestParam("kwEmpid") String kwEmpid){
        Employee employee = employeeService.selectBykwEmpid(kwEmpid);
        EmployeePojo employeePojo = BeanUtil.copyProperties(employee, EmployeePojo.class);
        return new ResultJson<>(employeePojo,ResultCode.SUCCESS);
    }
//    修改用户信息
    @PostMapping("/updateEmploy")
    public ResultJson<Integer> updateEmploy(@RequestBody Employee employee){
        int i = employeeService.updateByEmpidSelective(employee);
        return new ResultJson<>(i,ResultCode.SUCCESS);
    }
//    批量删除
    @PostMapping("/batchDeleteEmp")
    public ResultJson batchDeleteEmp(@RequestBody List<String> kwEmpids){
        employeeService.batchDeleteEmps(kwEmpids);
        return new ResultJson<>(null,ResultCode.SUCCESS);
    }
//    批量导入功能
    @PostMapping("/batchUpload")
    public  ResultJson uploadExcel(@RequestParam("file") MultipartFile file){

        long startTime=System.currentTimeMillis();
        try {
            List<Employee> list= ExcelUtils.importExcel(file, Employee.class);
            for (Employee employee : list) {
                String uuid = UUID.randomUUID().toString();
                employee.setOid(uuid);
                log.info("Employee:{}",employee);
            }
            employeeService.batchAddEmps(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("用时："+(endTime-startTime));
        return new ResultJson(null,ResultCode.SUCCESS);
    }
}
