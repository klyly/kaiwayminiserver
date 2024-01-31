package niit.wei.entity.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author WeiJinLong
 * @Date 2024-01-19 17:12
 * @Version 1.0
 */
@Data
public class EmployeePojo {
    private String kwEmpid;

    private String kwName;

    private String kwDepartment;

    private String kwEmployeetype;

    private String departmentName;

    private String employeeTypeName;
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date kwBeginDate;
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date kwEndDate;

    private String avator;

    private static final long serialVersionUID = 1L;
}

