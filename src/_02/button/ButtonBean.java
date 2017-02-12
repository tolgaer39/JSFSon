package _02.button;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="buttonBean")
public class ButtonBean {

	public String navigateToPage1() {
		return "page1";
	}

	public String navigateToPage2() {
		return "page2";
	}

}
