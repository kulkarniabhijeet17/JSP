package com.abhijeet.jsp;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class MenuItemTag extends TagSupport {
	private static final long serialVersionUID = 1L;

	private String value;

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	public int doStartTag() throws JspException {
		return EVAL_BODY_INCLUDE;
	}

	public int doEndTag() throws JspException {
		MenuTag parent = (MenuTag) getParent();
		if (parent != null) {
			parent.addMenuItem(this);
		}
		return EVAL_PAGE;
	}
}