package com.student;

import java.util.Arrays;

public class Student {
	private int iD;
	private String naMe;
	private String stuydentClass;
	private String diviSion;	
	private String graDe;
	private double marKs[] = new double[5];
	public int getiD() {
		return iD;
	}


	public void setiD(int iD) {
		this.iD = iD;
	}


	public String getNaMe() {
		return naMe;
	}


	public void setNaMe(String naMe) {
		this.naMe = naMe;
	}


	public String getStuydentClass() {
		return stuydentClass;
	}


	public void setStuydentClass(String stuydentClass) {
		this.stuydentClass = stuydentClass;
	}


	public String getDiviSion() {
		return diviSion;
	}


	public void setDiviSion(String diviSion) {
		this.diviSion = diviSion;
	}


	public String getGraDe() {
		return graDe;
	}


	public void setGraDe(String graDe) {
		this.graDe = graDe;
	}


	public double[] getMarKs() {
		return marKs;
	}


	public void setMarKs(double[] marKs) {
		this.marKs = marKs;
	}


	public double getPercenTage() {
		return percenTage;
	}


	public void setPercenTage(double percenTage) {
		
		this.percenTage = percenTage;
	}


	private double percenTage;

	public Student(int iD, String naMe, String stuydentClass, String diviSion, String graDe, double[] marKs,
		 double percenTage) {
		super();
		this.iD = iD;
		this.naMe = naMe;
		this.stuydentClass = stuydentClass;
		this.diviSion = diviSion;
		this.graDe = graDe;
		this.marKs = marKs;
		this.percenTage = percenTage;
	}
	

	public Student(int id2, String name2, String class1, String diviSion2, double[] marks2) {
		super();
		this.iD = id2;
		this.naMe = name2;
		this.stuydentClass = class1;
		this.diviSion = diviSion2;
		this.marKs = marks2;
	}


	public Student() {
		// TODO Auto-generated constructor stub
	}


	public void Percentage () {
		
		
	}


	@Override
	public String toString() {
		return "Student [iD=" + iD + ", naMe=" + naMe + ", stuydentClass=" + stuydentClass + ", diviSion=" + diviSion
				+ ", graDe=" + graDe + ", marKs=" + Arrays.toString(marKs) + ", percenTage=" + percenTage + "]";
	}

}
