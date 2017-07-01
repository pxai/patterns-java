package io.pello.patterns.behavioral.chainofresponsibility;

/**
 * LogMessage could be simple text, xml or json format
 * 
 * @author Pello Xabier Altadill Izura
 * @greet any
 */
public class LogMessage {
	private int type;
	private String msg;
	
	/**
	 * Constructor for LogMessage
	 * @param type
	 * @param msg
	 */
	public LogMessage (int type, String msg) {
		this.type = type;
		this.msg = msg;
	}

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
