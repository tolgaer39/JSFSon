package _01.output;

import javax.faces.bean.ManagedBean;


@ManagedBean
public class OutputBean {

	private String plainText ="Hello";
	private String htmlText = "<input size=\"20\" type=\"text\" />";
	
	public String getPlainText() {
		return plainText;
	}
	public void setPlainText(String plainText) {
		this.plainText = plainText;
	}
	public String getHtmlText() {
		return htmlText;
	}
	public void setHtmlText(String htmlText) {
		this.htmlText = htmlText;
	}
	
}
