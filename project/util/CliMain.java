package com.hexaware.ftp88.util;
import java.util.Scanner;
import com.hexaware.ftp88.model.LeaveDetails;
import java.text.ParseException;
//import com.hexaware.ftp88.model.LeaveType;
//import com.hexaware.ftp88.model.LeaveStatus;

import com.hexaware.ftp88.model.Employee;

/**
 * Class CliMain provides the command line interface to the leavemanagement
 * application.
 */
public class CliMain {
  private Scanner option = new Scanner(System.in, "UTF-8");

  private void mainMenu() {
    System.out.println("Leave Management System");
    System.out.println("-----------------------");
    System.out.println("1. List All Employees Info");
    System.out.println("2. Display Employee Info");
    System.out.println("3. Apply Leave");
    System.out.println("4. Pending Leaves");
    System.out.println("5. History");
    System.out.println("6. Approve/Deny");
    System.out.println("7. Exit");
    System.out.println("Enter your choice:");
    int menuOption = option.nextInt();
    mainMenuDetails(menuOption);
  }
  private void mainMenuDetails(final int selectedOption) {
    switch (selectedOption) {
      case 1:
        listEmployeesDetails();
        break;
      case 2:
        listEmployeeDetail();
        break;
      case 3:
        applyLeave();
        break;
      case 4:
        pendingLeaves();
        break;
      case 5:
        leaveHistory();
        break;
      case 6:
        approveDeny();
        break;
      case 7:
        // halt since normal exit throws a stacktrace due to jdbc threads not responding
        Runtime.getRuntime().halt(0);
      default:
        System.out.println("Choose either 1, 2, 3 or 4");
    }
    mainMenu();
  }
  private void applyLeave() {
    System.out.println("Enter an No of days ");
    int leaveDays = Integer.parseInt(option.next());
    System.out.println("Enter StartDate (yyyy-MM-dd) ");
    String leaveStartDate = option.next();
    System.out.println("Enter EndDate (yyyy-MM-dd) ");
    String leaveEndDate = option.next();
    System.out.println("Enter Leave EmpID ");
    int leaveEmpId = Integer.parseInt(option.next());
    System.out.println("Enter leave reason");
    String leaveReason = option.next();
    System.out.println("Enter leave applied date (yyyy-mm-dd)");
    String leaveAppliedOn = option.next();
    System.out.println("Enter leave type : EL, SL, ML ");
    String leavetype = option.next();
    option.nextLine();
    String res = null;
    try {
      res = LeaveDetails.applyLeave(leaveDays, leaveStartDate, leaveEndDate, leaveEmpId,
          leaveReason, leaveAppliedOn, leavetype);
    } catch (ParseException e) {
      System.out.println(e.getMessage());
    }
    System.out.println(res);
  }
  private void pendingLeaves() {
    int mgrId;
    System.out.println("Enter ManagerId ");
    mgrId = Integer.parseInt(option.next());
    LeaveDetails[] pending = LeaveDetails.listPending(mgrId);
    for (LeaveDetails e : pending) {
      System.out.println(e.getLeaveDays() + "  "
          + e.getLeaveId() + "  "
          + e.getLeaveStartDate() + "  "
          + e.getLeaveEndDate() + "  "
          + e.getLeaveEmpId() + "  "
          + e.getLeaveReason() + "  "
          + e.getLeaveAppliedOn());
    }
  }
 /**
  * For Approval and Denial.
  */
  public static void approveDeny() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a leave ID:");
    int leaveId = sc.nextInt();
    System.out.println("Approve (yes/no):");
    String ch = sc.next();
    System.out.println("Manager Comments  ");
    String leaveMgrComment = sc.next();
    String res = LeaveDetails.approveDeny(leaveId, ch, leaveMgrComment);
    System.out.println(res);
  }
  private void listEmployeeDetail() {
    System.out.println("Enter an Employee Id");
    int empId = option.nextInt();
    Employee e = Employee.listById(empId);
    if (e == null) {
      System.out.println("Sorry, No such employee");
    } else {
      System.out.println(e.getEmpId() + " " + e.getEname() + " " + e.getPhone() + " " + e.getEmail()
          + " " + e.getDept() + " " + e.getDate() + " " + e.getEmpMgrId() + " " + e.getLeaveBal());
    }
  }
  private void listEmployeesDetails() {
    Employee[] employee = Employee.listAll();
    for (Employee e : employee) {
      System.out.println(e.getEmpId() + " " + e.getEname() + " " + e.getPhone() + " " + e.getEmail()
          + " " + e.getDept() + " " + e.getDate() + " " + e.getEmpMgrId() + " " + e.getLeaveBal());
    }
  }
  private void leaveHistory() {
    System.out.println("Enter an Employee Id : ");
    final int empId = option.nextInt();
    LeaveDetails[] ld = LeaveDetails.leaveHis(empId);
    for (LeaveDetails e : ld) {
      System.out.println(e.getLeaveId() + " " + e.getLeaveEmpId() + " "
          + e.getLeaveStartDate() + " " + e.getLeaveEndDate() + " " + e.getLeaveDays() + " "
          + e.getLeaveType() + " " + e.getLeaveStatus() + " " + e.getLeaveReason() + " "
          + e.getLeaveAppliedOn());
    }
  }
  /**
   * The main entry point.
   * @param ar the list of arguments
   */
  public static void main(final String[] ar) {
    final CliMain mainObj = new CliMain();
    mainObj.mainMenu();
  }
}


