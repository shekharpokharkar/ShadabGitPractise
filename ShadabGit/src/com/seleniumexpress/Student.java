package com.seleniumexpress;

public class Student {

	private String studentName;
	private Long studentRollNo;
	private String studetnCity;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Long getStudentRollNo() {
		return studentRollNo;
	}

	public void setStudentRollNo(Long studentRollNo) {
		this.studentRollNo = studentRollNo;
	}

	public String getStudetnCity() {
		return studetnCity;
	}

	public void setStudetnCity(String studetnCity) {
		this.studetnCity = studetnCity;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentRollNo=" + studentRollNo + ", studetnCity="
				+ studetnCity + "]";
	}

}
