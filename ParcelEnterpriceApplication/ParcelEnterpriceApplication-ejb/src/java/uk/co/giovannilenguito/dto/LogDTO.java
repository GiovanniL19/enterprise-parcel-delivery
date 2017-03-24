package uk.co.giovannilenguito.dto;

/**
 *
 * @author Giovanni Lenguito <giovanni16.gl@gmail.com>
 */
public class LogDTO {
    private Integer logId;
    private String title;
    private String message;

    public LogDTO() {
    }

    public LogDTO(Integer logId, String title, String message) {
        this.logId = logId;
        this.title = title;
        this.message = message;
    }

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
