package model1.board;

public class BoardDTO {
	
	//DTO(Data Transfer Object)는 주로 데이터 저장이나 전송에 사용되는, 로직을 가지고 있지 않은 객체를 말한다 
	//자바빈즈 규약에 따름
	//계층 사이에서 데이터를 교환하기 위해 생성하는 객체입니다. 별다른 로직없이 속성(멤ㅇ버 변수)과 그 속성에 접근하기 위한 게터/세터 메서드만 갖춘게 특
	//징입니다. 그래서 값 객체 라고도 합니다.
	
	//맴버 변수 선언
	private String title;
	private String content;
	private String id;
	private java.sql.Date postdate;
	private String visitcount;
	private String name;
	private String num;
	
	//게터/세터		
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public java.sql.Date getPostdate() {
		return postdate;
	}
	public void setPostdate(java.sql.Date postdate) {
		this.postdate = postdate;
	}
	public String getVisitcount() {
		return visitcount;
	}
	
	public void setVisitcount(String visitcount) {
		this.visitcount = visitcount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
