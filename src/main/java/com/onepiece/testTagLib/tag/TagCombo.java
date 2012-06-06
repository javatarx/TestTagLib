package com.onepiece.testTagLib.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class TagCombo extends TagSupport{
	private static final long serialVersionUID = 1L;

	private String nombre;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int doEndTag() throws JspTagException{
		
		try {
			JspWriter out = pageContext.getOut();
			out.write("Hola "+getNombre());
		} catch (IOException e) {
			throw new JspTagException("Error al escribir el tag");
		}
		return EVAL_PAGE;
	}
	
	
	
}
