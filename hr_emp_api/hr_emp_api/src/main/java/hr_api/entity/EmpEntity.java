package hr_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cdac_test")
public class EmpEntity {

	@Id
	@Column(name="emp_id")
	private int empid;
	
	@Column(name="e_name")
	private String ename;
	
	@Column(name="emp_sal")
	private double sal;
	
	@Column(name="dept_no")
	private int deptno;
	
	public EmpEntity() {
		// TODO Auto-generated constructor stub
	}

	public EmpEntity(int empid, String ename, double sal, int deptno) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.sal = sal;
		this.deptno = deptno;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "EmpEntity [empid=" + empid + ", ename=" + ename + ", sal=" + sal + ", deptno=" + deptno + "]";
	}
	

}
