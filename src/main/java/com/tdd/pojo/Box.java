package com.tdd.pojo;

import java.util.Date;

/**
 * box实体类
 * @author lenovo
 *
 */
public class Box {
	//宝箱编号
	private int boxNumber; 
	//宝箱的hash256值--->编号+上一个宝箱的Hash值+神秘数字 的hash256值
	private String hashCode; 
	//上一个宝箱的hash256值
	private String prevHashCode;
	//神秘数字
	private int openBoxNumber;
	
	
	
	public int getBoxNumber() {
		return boxNumber;
	}
	public void setBoxNumber(int boxNumber) {
		this.boxNumber = boxNumber;
	}
	public String getHashCode() {
		return hashCode;
	}
	public void setHashCode(String hashCode) {
		this.hashCode = hashCode;
	}
	public String getPrevHashCode() {
		return prevHashCode;
	}
	public void setPrevHashCode(String prevHashCode) {
		this.prevHashCode = prevHashCode;
	}
	public int getOpenBoxNumber() {
		return openBoxNumber;
	}
	public void setOpenBoxNumber(int openBoxNumber) {
		this.openBoxNumber = openBoxNumber;
	}
	
	public Box() {
		super();
	}
	
	public Box(int boxNumber,String hashCode, String prevHashCode, int openBoxNumber) {
		super();
		this.boxNumber = boxNumber;
		this.hashCode = hashCode;
		this.prevHashCode = prevHashCode;
		this.openBoxNumber = openBoxNumber;
	}
	
	/**
	 * 开箱字符串组合
	 * @return
	 */
    public String ComposeStr() {
    	//将宝箱编号、上一个宝箱的hash值和 神秘数字 组合起来
    	String composeStr=boxNumber + prevHashCode + openBoxNumber;
        return composeStr;
    }
	
	
}
