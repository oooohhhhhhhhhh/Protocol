package protocol;

import java.io.Serializable;

public class Response implements Serializable {
    // 添加 serialVersionUID 确保序列化兼容性
    private static final long serialVersionUID = 1L;
    
    private int status;
    private String message;
    private Object data;
    
    public Response(int status, String message) {
        this.status = status;
        this.message = message;
    }
    
    public Response(int status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }
    
    // Getters and Setters
    public int getStatus() { return status; }
    public void setStatus(int status) { this.status = status; }
    
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
    
    public Object getData() { return data; }
    public void setData(Object data) { this.data = data; }
    
    public boolean isSuccess() {
        return status == Protocol.SUCCESS;
    }
    
    @Override
    public String toString() {
        return "Response{status=" + status + ", message='" + message + "', data=" + data + "}";
    }
}