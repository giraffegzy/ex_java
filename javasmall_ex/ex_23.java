package cn.gzy.Test;

import java.io.File;
import java.util.Arrays;

public class ex_23 {
public static void main(String[] args) {
	File f = new File("C:/Windows");
	File[] fs = f.listFiles();
	long max = 0;
	long min = Integer.MAX_VALUE;
	File maxfi = null;
	File minfi = null;
	for(File file:fs) {
		if(file.isDirectory())continue;
		if(file.length()>max) {
			max = file.length();
			maxfi =file;
		}
		if(file.length()<min&&file.length()!=0) {
			min = file.length();
			minfi =file;
		}
	}
	System.out.printf("最大文件是:%s" +"大小为：%,d字节",maxfi.getAbsolutePath(),max);
	System.out.println();
	System.out.printf("最小文件是:%s" +"大小为：%,d字节",minfi.getAbsolutePath(),min);
}
}
