package com.tdd;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import com.tdd.pojo.Box;
import com.tdd.utils.Utils;

/**
 * 启动类
 * @author lenovo
 *
 */
public class AppRun {

	public static void main(String[] args) {
        List<Box> boxes = BoxInfo();
        for(Box box:boxes){
        	System.out.println("第"+box.getBoxNumber()+"个宝箱的神秘数字为："+box.getOpenBoxNumber());
        }
        
    }
	
	/**
	 * 获取10个箱子属性值
	 * @return
	 */
    private static List<Box> BoxInfo() {
        List<Box> boxInfos = new ArrayList<Box>();
        //第一个宝箱的上一个hash值为0
        String preBoxHash = "0";
        for (int i = 1; i <= 10; i++) {
            Box box = new Box();
            box.setBoxNumber(i);
            box.setPrevHashCode(preBoxHash);
            String hash = box.ComposeStr();
            box.setHashCode(hash);
            box.setOpenBoxNumber(getopenBoxNumber(hash));
            preBoxHash = hash;
            boxInfos.add(box);
        }
        return boxInfos;
    }

    /**
     * 获取开箱数字
     * @param hash
     * @return
     */
	static int getopenBoxNumber(String hash) {
		int index = 0;
        while (!hash.startsWith("00000")) {
				hash = hash + index;
				hash = Utils.getSHA256StrJava(hash);
                index++;
            }
        
        return index;
	}
}
