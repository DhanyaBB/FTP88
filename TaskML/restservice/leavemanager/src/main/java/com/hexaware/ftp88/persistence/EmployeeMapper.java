package com.hexaware.ftp88.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.skife.jdbi.v2.StatementContext;

import com.hexaware.ftp88.model.Employee;

/**
 * Mapper class to map from result set to employee object.
 */
public class EmployeeMapper implements ResultSetMapper<Employee> {
  /**
   * @param idx the index
   * @param rs the resultset
   * @param ctx the context
   * @return the mapped employee object
   * @throws SQLException in case there is an error in fetching data from the resultset
   */
  public final Employee map(final int idx, final ResultSet rs, final      StatementContext ctx) throws SQLException {
    /**
     * @return Employee
     */
    return new Employee(rs.getInt("EMP_ID"), rs.getString("FULLNAME"), rs.getString("EMAIL_ID"),
    rs.getString("MOBILE_NUMBER"),
    rs.getDate("DATE_OF_JOINING"), rs.getString("DEPARTMENT"), rs.getInt("AVAIL_LEAVE_BAL_EL"),
    rs.getInt("AVAIL_LEAVE_BAL_ML"), rs.getString("DESIGNATION"), rs.getInt("MGR_ID"));

  }

}
