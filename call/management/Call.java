package call.management;

import java.sql.Date;

public class Call {

    private String callID;
    private User caller;
    private User receiver;
    private Date startTime;
    private Date endTime;
    private String status;

    public Call(String callID, User caller, User receiver, Date startTime, Date endTime, String status) {
        this.callID = callID;
        this.caller = caller;
        this.receiver = receiver;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
    }

    // Getters and Setters omitted for brevity
    public String getCallID() {
        return callID;
    }   
    public User getCaller() {
        return caller;
    }       
    public User getReceiver() {
        return receiver;
    }
    public Date getStartTime() {
        return startTime;
    }
    public Date getEndTime() {
        return endTime;
    }
    public String getStatus() {
        return status;
    }
    public void setCallID(String callID) {
        this.callID = callID;
    }
    public void setCaller(User caller) {
        this.caller = caller;
    }
    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    public void setStatus(String status) {
        this.status = status;
    }

}
