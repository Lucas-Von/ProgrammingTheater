package hackathon.vivo.ProgrammingTheater.Exception;

public class MyRuntimeException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	protected String code;

	protected String msg;

	protected String message;// 打印出的日志信息

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public MyRuntimeException(ExceptionEnums enums, String message) {
		super();
		this.code = enums.getCode();
		this.msg = enums.getMsg();
		this.message = message;
	}

	public MyRuntimeException(ExceptionEnums enums) {
		super();
		this.code = enums.getCode();
		this.msg = enums.getMsg();
	}

	public MyRuntimeException() {
		super();
	}

	public MyRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}

	public MyRuntimeException(String message) {
		super(message);
	}
}