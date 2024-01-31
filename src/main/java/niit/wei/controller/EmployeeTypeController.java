package niit.wei.controller;

import niit.wei.entity.EmployeeType;
import niit.wei.service.EmployeeTypeService;
import niit.wei.utils.ResultCode;
import niit.wei.utils.ResultJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author WeiJinLong
 * @Date 2024-01-23 17:16
 * @Version 1.0
 */
@RestController
@CrossOrigin
@RequestMapping("empType")
public class EmployeeTypeController {
    @Autowired
    private EmployeeTypeService employeeTypeService;

    @GetMapping("/empTypeList")
    public ResultJson<List<EmployeeType>>  getEmployTypeList(){
        List<EmployeeType> employeeTypes = employeeTypeService.employeeTypes();
        return new ResultJson<>(employeeTypes, ResultCode.SUCCESS);
    }
}
