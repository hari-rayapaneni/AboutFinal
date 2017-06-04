package com.info;

public class FinalRefference {
	private String name="kumar";
	private int no=1;
	public static void main(String[] args) {
		final FinalRefference r=new FinalRefference();
		r.name="hari";
		r.no=10;
		System.out.println(r);
	}
	@Override
	public String toString() {
		return name+" "+no;
	}

}
