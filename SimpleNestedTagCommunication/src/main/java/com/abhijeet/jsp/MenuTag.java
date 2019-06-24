package com.abhijeet.jsp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MenuTag extends SimpleTagSupport {
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

	public void doTag() throws JspException, IOException {
		getJspBody().invoke(null);
		JspWriter out = getJspContext().getOut();
		out.println("<table border='1'>");
		for (MenuItemTag tag : menuItems) {
			out.println(String.format("<tr><td>%s-%s</td></tr>", this.getPrefix(), tag.getValue()));
		}
		out.println("</table>");
	}
}