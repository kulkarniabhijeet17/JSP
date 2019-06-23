package com.abhijeet.jsp;

import java.io.IOException;

import javax.servlet.jsp.tagext.TagSupport;

public class ClassicTagHandler extends TagSupport {
	private static final long serialVersionUID = 1L;
	private String username;

	public int doStartTag() {
		try {
			pageContext.getOut().write("<br>Welcome " + username);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}

	public int doEndTag() {
		try {
			pageContext.getOut().println("<br>End of the tag");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 0;
	}

	// There must be a setter method for every attribute
	public void setUsername(String username) {
		this.username = username;
	}
}