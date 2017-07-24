package cn.jblog.mvc.vo;

public class RenderBean {
	private Integer state;
	private String msg;

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public RenderBean(Integer state, String msg) {
		super();
		this.state = state;
		this.msg = msg;
	}

	public RenderBean() {
		super();
	}
	
}
