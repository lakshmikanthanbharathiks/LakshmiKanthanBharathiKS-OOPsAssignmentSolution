package com.greatlearning.DepartmentApplication.model;

public class DriverClassMain 
{
	public static void main(String[] args)
	{
		AdminDepartment admdep = new AdminDepartment();
		System.out.println("Welcome to "+admdep.departmentName());
		System.out.println(admdep.getTodaysWork());
		System.out.println(admdep.getWorkDeadline());
		System.out.println(admdep.isTodayAHoliday());
		
		HrDepartment hrdep = new HrDepartment();
		System.out.println("Welcome to "+hrdep.departmentName());
		System.out.println(hrdep.doActivity());
		System.out.println(hrdep.getTodaysWork());
		System.out.println(hrdep.getWorkDeadline());
		System.out.println(hrdep.isTodayAHoliday());
		
		TechDepartment techdep = new TechDepartment();
		System.out.println("Welcome to "+techdep.departmentName());
		System.out.println(techdep.getTodaysWork());
		System.out.println(techdep.getWorkDeadline());
		System.out.println(techdep.getTechStackInformation());		
		System.out.println(techdep.isTodayAHoliday());
	}
}
