package io.pello.patterns.behavioral.mediator;

/**
 * Represents a Command given by a General
 * @author Pello Xabier Altadill Izura
 * @greetz any
 */
public class Command {
	private String msg;

	/**
	 * @param msg
	 */
	public Command(String msg) {
		this.msg = msg;
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
