package com.greatlearning.DepartmentApplication.model;

public class SuperDepartment 
{
	public String departmentName()
    {
		return "Super Department";
    }

    public String getTodaysWork()
    {
	    return "No Work as of now";
    }

    public String getWorkDeadline()
    {
	    return "Nil";
    }
	
    public String isTodayAHoliday()
    {
	    return "Today is not a holiday\n";
    }
}

class AdminDepartment extends SuperDepartment
{
	public String departmentName()
	{
		return "Admin Department";
	}

	public String getTodaysWork()
	{
		return "Complete your documents Submission";
	}	
	
	public String getWorkDeadline()
    {
	    return "Complete by EOD ";
    }
}

class HrDepartment extends SuperDepartment
{
	public String departmentName()
    {
		return "HR Department";
    }

    public String getTodaysWork()
    {
	    return "Fill today’s timesheet and mark your attendance";
    }

    public String getWorkDeadline()
    {
	    return "Complete by EOD";
    }
    
    public String doActivity()
    {
    	return "Team Lunch";
    }
}

class TechDepartment extends SuperDepartment
{
	public String departmentName()
    {
		return "Tech Department";
    }

    public String getTodaysWork()
    {
	    return "Complete coding of Module 1";
    }

    public String getWorkDeadline()
    {
	    return "Complete by EOD";
    }
    public String getTechStackInformation()
    {
    	return "Core Java";
    }
}    
    
