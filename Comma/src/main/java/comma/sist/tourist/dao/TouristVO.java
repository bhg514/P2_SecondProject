package comma.sist.tourist.dao;

public class TouristVO {
	private int tour_no; //pk
	private String user_id; //fk
	private int text_no;//fk
	private String tour_theme ;
	private String tour_detail ;
	
	public int getTour_no() {
		return tour_no;
	}
	public void setTour_no(int tour_no) {
		this.tour_no = tour_no;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public int getText_no() {
		return text_no;
	}
	public void setText_no(int text_no) {
		this.text_no = text_no;
	}
	public String getTour_theme() {
		return tour_theme;
	}
	public void setTour_theme(String tour_theme) {
		this.tour_theme = tour_theme;
	}
	public String getTour_detail() {
		return tour_detail;
	}
	public void setTour_detail(String tour_detail) {
		this.tour_detail = tour_detail;
	}
	
}
