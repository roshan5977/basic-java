package com.jsp.inheritance;

class Male
{
	private String Sperm="0 ml";

	public String getPennis() {
		return Sperm;
	}

	public void setTestis(String sperm) {
		Sperm = sperm;
	}
}
class Female
{
   private String Ovum="100 ml";//  private data member of female
   //bt object pussy will bring the private data member of male i.e sperm
   //through the functionality of pennis
   //and they after coupulation when ovum 100 ml meets 100 ml sperm
   
}
public class HumanBody {

	public static void main(String[] args) {
	Male pussy = new Male();//pussy is the object 
	System.out.println(pussy.getPennis());
	//After copulation (gapagap)!!!
	pussy.setTestis("100 ml");
	System.out.println(pussy.getPennis());
	// inside the pussy object another dm ovum meets and 
	//later after 9 month another new object formed named baby 
	//which is of both the class nd later baby will be one class!
	}

}
