package niit.wei.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class Department implements Serializable {
    private String oid;

    private String kwDepartmentid;

    private String kwDepartmentname;

    private String kwShortname;

    private Integer kwLevel;

    private String kwParentdepartment;

    private String dep1;

    private String dep2;

    private String dep3;

    private String dep4;

    private Integer optimisticlockfield;

    private String kwRemark;

    private static final long serialVersionUID = 1L;

}