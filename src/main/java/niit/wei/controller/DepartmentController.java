package niit.wei.controller;

import niit.wei.entity.Department;
import niit.wei.service.DepartmentService;
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
 * @Date 2024-01-23 16:48
 * @Version 1.0
 */
@RestController
@RequestMapping("dept")
@CrossOrigin
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/deptList")
    public ResultJson<List<Department>> deptList() {
        List<Department> departments = departmentService.departments();
        return new ResultJson<>(departments, ResultCode.SUCCESS);
    }
}
