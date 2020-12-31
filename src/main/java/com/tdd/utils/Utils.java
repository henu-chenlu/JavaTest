package com.tdd.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import com.tdd.pojo.Box;

import java.nio.charset.StandardCharsets;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;

/**
 * 工具类：转换hash
 * @author lenovo
 *
 */
public class Utils {
	
	
	/**
	* 实现SHA256加密
	* @param str 加密后的报文
	* @return
	*/
	public static String getSHA256StrJava(String str){
	 MessageDigest messageDigest;
	 String encodeStr = "";
	 try {
	  messageDigest = MessageDigest.getInstance("SHA-256");
	  messageDigest.update(str.getBytes("UTF-8"));
	  encodeStr = byte2Hex(messageDigest.digest());
	 } catch (NoSuchAlgorithmException e) {
	  e.printStackTrace();
	 } catch (UnsupportedEncodingException e) {
	  e.printStackTrace();
	 }
	 return encodeStr;
	}
	
	
	/**
	* 将byte转为16进制
	* @param bytes
	* @return
	*/
	private static String byte2Hex(byte[] bytes){
	 StringBuffer stringBuffer = new StringBuffer();
	 String temp = null;
	 for (int i=0;i<bytes.length;i++){
	  temp = Integer.toHexString(bytes[i] & 0xFF);
	  if (temp.length()==1){
	  //1得到一位的进行补0操作
	  stringBuffer.append("0");
	  }
	  stringBuffer.append(temp);
	 }
	 return stringBuffer.toString();
	}


}
