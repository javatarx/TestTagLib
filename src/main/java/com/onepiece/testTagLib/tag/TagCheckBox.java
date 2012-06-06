package com.onepiece.testTagLib.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class TagCheckBox extends TagSupport{
	private static final long serialVersionUID = 1L;

	@Override
	public int doEndTag() throws JspException {
		
		try {
			JspWriter out = pageContext.getOut();
			for (int i = 0; i < 10; i++) {
				out.write("<input type=\"checkbox\" name=\"numeros\" value=\""+i+"\">"+i+"<br />");
			}
		} catch (IOException e) {
			throw new JspTagException("Error al escribir su tag");
		}
		
		return EVAL_PAGE;
	}
	
	
	
}
