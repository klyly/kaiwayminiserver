package niit.wei.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class EmployeeType implements Serializable {
    private String oid;

    private String kwEmployeetypeid;

    private String kwEmployeetypename;

    private Integer optimisticlockfield;

    private String kwRemark;

    private static final long serialVersionUID = 1L;



}