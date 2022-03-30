package com.lti.example;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENTS")
public class Student {
	@Id
	@Column(name="STUDID")
	private int studid;
	
	@Column(name="STUNAME")
	private String stuName1;
	
	@Column(name="STUSCORE")
	private double stuscore;
	
	public int getStiId() {
		return stiId;
	}


	public void setStiId(int stiId) {
		this.stiId = stiId;
	}


	public String getStuName() {
		return stuName1;
	}


	public void setStuName(String stuName) {
		this.stuName1 = stuName;
	}


	public double getStuScore() {
		return stuScore;
	}


	public void setStuScore(double stuScore) {
		this.stuScore = stuScore;
	}

    @Id
	private int stiId;
	private String stuName;
	private double stuScore;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int stiId, String stuName, double stuScore) {
		super();
		this.stiId = stiId;
		this.stuName1 = stuName;
		this.stuScore = stuScore;
	}


	@Override
	public String toString() {
		return "Student [stiId=" + stiId + ", stuName=" + stuName1 + ", stuScore=" + stuScore + "]";
	}
}
