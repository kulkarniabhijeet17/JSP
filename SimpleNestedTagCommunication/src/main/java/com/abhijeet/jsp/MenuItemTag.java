package com.abhijeet.jsp;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MenuItemTag extends SimpleTagSupport {
	private String value;

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	public void doTag() throws JspException, IOException {
		MenuTag parent = (MenuTag) getParent();
		if (parent != null) {
			parent.addMenuItem(this);
		}
	}
}