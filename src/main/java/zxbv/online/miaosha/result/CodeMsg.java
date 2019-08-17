package zxbv.online.miaosha.result;

/**
 * @ClassName CodeMsg
 * @Description TODO
 * @Author zxb
 * @Date 2019/8/17 15:51
 * @Version 1.0
 */
public class CodeMsg {

    private int code;
    private String msg;
    /**
     * 通用异常
     */
    public static CodeMsg SUCCESS = new CodeMsg(0,"SUCCESS");
    public static CodeMsg SERVER_ERROR = new CodeMsg(500100,"服务端异常");

     //登录模块 500200xxx

    // 商品模块 500300xxx
    // 订单模块 500400xxx
    // 秒杀模块 500500xxx

    private CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public CodeMsg setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public CodeMsg setMsg(String msg) {
        this.msg = msg;
        return this;
    }
}
