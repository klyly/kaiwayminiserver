package niit.wei.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
public class Employee implements Serializable {
    private String oid;

    private String kwEmpid;

    private String kwName;

    private String kwDepartment;

    private String kwEmployeetype;
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date kwBeginDate;
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date kwEndDate;

    private Integer optimisticlockfield;

    private String avator;

    private String departmentName;

    private String employeeTypeName;

    private static final long serialVersionUID = 1L;


}