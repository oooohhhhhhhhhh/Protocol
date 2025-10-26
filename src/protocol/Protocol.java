package protocol;

public class Protocol {
    // 操作类型
    public static final int LOGIN = 1;
    public static final int REGISTER = 2;
    public static final int CULTIVATE = 3;
    public static final int ENTER_SECLUSION = 4;
    public static final int EXIT_SECLUSION = 5;
    public static final int GET_ITEMS = 6;
    public static final int ADD_ITEM = 7;
    public static final int USE_ITEM = 8;
    public static final int SAVE_GAME = 9;
    public static final int GET_PLAYER_LIST = 10;
    public static final int GET_PLAYER_STATUS = 11;
    public static final int GET_ALL_JINGJIE = 12;
    public static final int GET_JINGJIE_BY_LEVEL = 13;
    public static final int GET_NEXT_JINGJIE = 14;
    public static final int CHECK_LEVEL_UP = 15;
    
    // 响应状态
    public static final int SUCCESS = 200;
    public static final int ERROR = 400;
    public static final int NOT_FOUND = 404;
    
    // 服务器配置
    public static final int SERVER_PORT = 8888;
    public static final String SERVER_HOST = "localhost";
}