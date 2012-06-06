package com.onepiece.testTagLib.tag;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class TagListaPorParametros extends TagSupport{
	private static final long serialVersionUID = 1L;

	private List<String> lista=null;
	
	public List<String> getLista() {
		return lista;
	}

	public void setLista(List<String> lista) {
		this.lista = lista;
	}

	@Override
	public int doEndTag() throws JspException {
		
		List<String> numeros = new ArrayList<String>();
		numeros.add(new String("Uno"));
		numeros.add(new String("Dos"));
		numeros.add(new String("Tres"));
		numeros.add(new String("Cuatro"));
		numeros.add(new String("Cinco"));
		numeros.add(new String("Seis"));
		numeros.add(new String("Siete"));
		numeros.add(new String("Ocho"));
		numeros.add(new String("Nueve"));
		numeros.add(new String("Diez"));
		
		
		try {
			JspWriter out =  pageContext.getOut();
			for (String item : numeros) {
				if (getLista().contains(item)) {
					out.write("<h2>"+item+"</h2> Seleccionado<br />");
				}else {
					out.write("<h2>"+item+"</h2><br />");
				}
			}
		} catch (IOException e) {
			throw new JspTagException("Error al escribir el tag"); 
		}
		
		return EVAL_PAGE;
	}
}
