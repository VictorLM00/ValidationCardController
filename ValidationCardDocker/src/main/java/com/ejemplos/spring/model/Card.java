package com.ejemplos.spring.model;

import java.io.Serializable;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Card implements Serializable{

	private static final long serialVersionUID = 1L;
    
	@Min(value= 1000) @Max(value = 9999) @NotNull
	private Integer num1;
	
	@Min(value= 1000) @Max(value = 9999) @NotNull
	private Integer num2;
	
	@Min(value= 1000) @Max(value = 9999) @NotNull
	private Integer num3;
	
	@Min(value= 1000) @Max(value = 9999) @NotNull
	private Integer num4;
	
	@Min(value= 01) @Max(value=12) @NotNull
	private Integer month;
	@Min(value = 22) @Max(value=24) @NotNull
	private Integer year;
	

	public Integer getNum1() {return num1;}
	
	public void setNum1(Integer num1) {	this.num1 = num1;}

	public Integer getNum2() {return num2;}

	public void setNum2(Integer num2) {this.num2 = num2;}

	public Integer getNum3() {return num3;}
	
	public void setNum3(Integer num3) {this.num3 = num3;}

	public Integer getNum4() {return num4;}

	public void setNum4(Integer num4) {this.num4 = num4;}

	public Integer getMonth() {return month;}

	public void setMonth(Integer month) {this.month = month;}

	public Integer getYear() {return year;}

	public void setYear(Integer year) {this.year = year;}
	
	public static long getSerialversionuid() {return serialVersionUID;}

	@Override
	public String toString() {
		return "Card [num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + ", num4=" + num4 + ", month=" + month
				+ ", year=" + year + "]";
	}




	

	
	
}
