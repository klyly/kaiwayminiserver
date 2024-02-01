package niit.wei.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
public class Employee implements Serializable {
    private String oid;
    @Excel(name = "kwEmpid",orderNum = "0")
    private String kwEmpid;
    @Excel(name = "kwName",orderNum = "1")
    private String kwName;
    @Excel(name = "departmentName",orderNum = "2",
            replace = {"通讯工程_30904396-aa9c-447b-b7b6-3cc7bf6e2e78",
                    "行政管理_60846385-d3ba-42ce-acf0-100b7b176a2a",
                    "电子信息_bf6f2a9a-89a7-4f8a-9712-113f0663133a",
                    "人工智能_d4f8a4ba-c456-4edc-b851-44edcb0563dc"
            })
    private String kwDepartment;
    @Excel(name = "employeeTypeName",orderNum = "3",
            replace = {"硕士生_03a6fcc8-a5fc-4997-86d5-3e5362302823",
                    "博士生_32f3c1b6-58d2-400b-9dbd-d167fd902a31",
                    "本科生_696c554d-afdb-41da-9c38-e1d8f96d1b78",
                    "教职工_a62c8eed-c012-45fd-91e3-35293ea6aa3d",
                    "其它_c176c046-9a69-4f4d-bc7b-21200d38c8d2"
            })
    private String kwEmployeetype;

    @Excel(name = "kwBeginDate",orderNum = "4" ,importFormat = "yyyy-MM-dd")
    private Date kwBeginDate;

    @Excel(name = "kwEndDate",orderNum = "5",importFormat = "yyyy-MM-dd")
    private Date kwEndDate;

    private Integer optimisticlockfield;

    private String avator;

    private String departmentName;

    private String employeeTypeName;

    private static final long serialVersionUID = 1L;

    public Employee(String oid, String kwEmpid, String kwName, String kwDepartment, String kwEmployeetype, Date kwBeginDate, Date kwEndDate, Integer optimisticlockfield, String avator) {
        this.oid = oid;
        this.kwEmpid = kwEmpid;
        this.kwName = kwName;
        this.kwDepartment = kwDepartment;
        this.kwEmployeetype = kwEmployeetype;
        this.kwBeginDate = kwBeginDate;
        this.kwEndDate = kwEndDate;
        this.optimisticlockfield = optimisticlockfield;
        this.avator = avator;
        this.departmentName = departmentName;
        this.employeeTypeName = employeeTypeName;
    }

    public Employee() {
    }
}