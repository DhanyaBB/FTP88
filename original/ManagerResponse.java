package com.hexaware.ftp02.model;

/**
 * ManagerResponse class to store the reply.
 * @author hexaware
 */
public class ManagerResponse {
  /**
   * status to store leave status.
   */
  private String leaveStatus;
  /**
   * comment to store manager's comment.
   */
  private String  leaveMgrComment;
  /**
   * @param argLeaveStatus to initialize the status.
   * @param  argLeaveMgrComment to initialize the status.
   */
  public  ManagerResponse(final String argLeaveStatus, final String argLeaveMgrComment) {
    this.leaveStatus = argLeaveStatus;
    this.leaveMgrComment =  argLeaveMgrComment;
  }
  /**
   * default constructor.
   */
  public  ManagerResponse() {
  }

  /**
   * Gets the status.
   * @return the leave Status.
   */
  public final String getLeaveStatus() {
    return leaveStatus;
  }

  /**
   * @param argLeaveStatus to set the status.
   */
  public final void setLeaveStatus(final String argLeaveStatus) {
    this.leaveStatus = argLeaveStatus;
  }
  /**
   * Gets the comment.
   * @return the comment.
   */
  public final String getLeaveMgrComment() {
    return leaveMgrComment;
  }

  /**
   * @param argLeaveMgrComment to set the comment.
   */
  public final void setLeaveMgrComment(final String argLeaveMgrComment) {
    this.leaveMgrComment =  argLeaveMgrComment;
  }
}
