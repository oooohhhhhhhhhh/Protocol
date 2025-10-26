package protocol;

import java.io.Serializable;

public class Request implements Serializable {
    // 添加 serialVersionUID 确保序列化兼容性
    private static final long serialVersionUID = 1L;
    
    private int type;
    private String playerName;
    private Object data;
    
    public Request(int type, String playerName) {
        this.type = type;
        this.playerName = playerName;
    }
    
    public Request(int type, String playerName, Object data) {
        this.type = type;
        this.playerName = playerName;
        this.data = data;
    }
    
    // Getters and Setters
    public int getType() { return type; }
    public void setType(int type) { this.type = type; }
    
    public String getPlayerName() { return playerName; }
    public void setPlayerName(String playerName) { this.playerName = playerName; }
    
    public Object getData() { return data; }
    public void setData(Object data) { this.data = data; }
    
    @Override
    public String toString() {
        return "Request{type=" + type + ", playerName='" + playerName + "', data=" + data + "}";
    }
}