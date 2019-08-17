package zxbv.online.miaosha.result;

/**
 * @ClassName Result
 * @Description TODO
 * @Author zxb
 * @Date 2019/8/17 15:35
 * @Version 1.0
 */
public class Result<T>{

    private int code;
    private String msg;
    private T data;

    /**
     * 成功时候调用
     * @param <T>
     * @return
     */
    public static <T> Result <T> success(T data){
        return new Result<>(data);
    }

    private Result(T data) {
        this.code = 0;
        this.msg = "SUCCESS";
        this.data = data;
    }

    /**
     * 失败时候调用
     * @param <T>
     * @return
     */
    public static <T> Result <T> error(CodeMsg cm){
        return new Result<T>(cm);
    }

    private Result(CodeMsg cm) {
        if (cm == null){
            return;
        }
        this.code = cm.getCode();
        this.msg = cm.getMsg();
    }

    public int getCode() {
        return code;
    }

    public Result<T> setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public Result<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

    public Result<T> setData(T data) {
        this.data = data;
        return this;
    }
}
