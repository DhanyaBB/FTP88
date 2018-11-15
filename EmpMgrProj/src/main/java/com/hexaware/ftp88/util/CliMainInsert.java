
package com.hexaware.ftp88.util;
import java.util.Scanner;

import com.hexaware.ftp88.model.EmpMgr;
import java.text.SimpleDateFormat;
import java.text.ParseException;

/**
 * Class CliMain provides the command line interface to the leavemanagement
 * application.
 */
public class CliMainInsert {
  public static void main(String[] args) {
    EmpMgr.insertEmp(551, "Richa", "Dehli", 1);
    System.out.println("Record Inserted...");
  }
}