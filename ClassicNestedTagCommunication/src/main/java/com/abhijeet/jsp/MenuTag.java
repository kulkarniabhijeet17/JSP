package com.abhijeet.jsp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MenuTag extends TagSupport {
	private static final long serialVersionUID = 1L;

	private List<MenuItemTag> menuItems = new ArrayList<MenuItemTag>();
	private String prefix;

	public String getPrefix() {
		return this.prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public void addMenuItem(MenuItemTag tag) {
		menuItems.add(tag);
	}

	public int doStartTag() throws JspException {
		menuItems = new ArrayList<MenuItemTag>();
		return EVAL_BODY_INCLUDE;
	}

	public int doEndTag() throws JspException {
		JspWriter out = pageContext.getOut();
		try {
			// getJspBody().invoke(null);
			out.println("<table border='1'>");
			for (MenuItemTag tag : menuItems) {
				out.println(String.format("<tr><td>%s-%s</td></tr>", this.getPrefix(), tag.getValue()));
			}
			out.println("</table>");
		} catch (IOException e) {
			e.printStackTrace();
		}

		return EVAL_PAGE;
	}
}