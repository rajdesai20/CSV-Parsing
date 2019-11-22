package com.ms3.CVSparse.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Col_Data {
	@Column(name="A")
	private String A;
	@Column(name="B")
	private String B;
	@Id
	@Column(name="C")
	private String C;
	@Column(name="D")
	private String D;
	@Column(length = 20000, name= "E")
	private String E;
	@Column(name="F")
	private String F;
	@Column(name="G")
	private String G;
	@Column(name="H")
	private String H;
	@Column(name="I")
	private String I;
	@Column(name="J")
	private String J;
	public String getA() {
		return A;
	}
	public void setA(String a) {
		A = a;
	}
	public String getB() {
		return B;
	}
	public void setB(String b) {
		B = b;
	}
	public String getC() {
		return C;
	}
	public void setC(String c) {
		C = c;
	}
	public String getD() {
		return D;
	}
	public void setD(String d) {
		D = d;
	}
	public String getE() {
		return E;
	}
	public void setE(String e) {
		E = e;
	}
	public String getF() {
		return F;
	}
	public void setF(String f) {
		F = f;
	}
	public String getG() {
		return G;
	}
	public void setG(String g) {
		G = g;
	}
	public String getH() {
		return H;
	}
	public void setH(String h) {
		H = h;
	}
	public String getI() {
		return I;
	}
	public void setI(String i) {
		I = i;
	}
	public String getJ() {
		return J;
	}
	public void setJ(String j) {
		J = j;
	}
	@Override
	public String toString() {
		return "Col_Data [A=" + A + ", B=" + B + ", C=" + C + ", D=" + D + ", E=" + E + ", F=" + F + ", G=" + G + ", H="
				+ H + ", I=" + I + ", J=" + J + "]";
	}
	
	
	
}
