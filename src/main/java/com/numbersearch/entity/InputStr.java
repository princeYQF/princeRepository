package com.numbersearch.entity;

public class InputStr {
	
	private String requestState;

	private String str;
	
	private String strContainLetters;
	
	private String strContainNumbers;
	
	private String result;
	
	

	public String getRequestState() {
		return requestState;
	}

	public void setRequestState(String requestState) {
		this.requestState = requestState;
	}

	public String getStr() {
		return str;
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	
	public String getStrContainLetters() {
		return strContainLetters;
	}
	
	public void setStrContainLetters(String strContainLetters) {
		this.strContainLetters = strContainLetters;
	}
	
	public String getStrContainNumbers() {
		return strContainNumbers;
	}
	
	public void setStrContainNumbers(String strContainNumbers) {
		this.strContainNumbers = strContainNumbers;
	}
	
	public String getResult() {
		return result;
	}
	
	public void setResult(String result) {
		this.result = result;
	}
	  
  
	@Override
	public String toString() {
		return ("requestState="+requestState+",str="+str+",strContainLetters="+strContainNumbers+",result="+result);
	}

}
