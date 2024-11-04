<%@ page import="membership.MemberDAO"%>
<%@ page import="membership.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 로그인 폼으로부터 받은 아이디와 패스워드  		//1
String userId = request.getParameter("user_id"); 
String userPwd = request.getParameter("user_pw");  

// web.xml에서 가져온 데이터베이스 연결 정보			//2
String oracleDriver = application.getInitParameter("OracleDriver");
String oracleURL = application.getInitParameter("OracleURL");
String oracleId = application.getInitParameter("OracleId");
String oraclePwd = application.getInitParameter("OraclePwd");

// 회원 테이블 DAO를 통해 회원 정보 DTO 획득
MemberDAO dao = new MemberDAO(oracleDriver, oracleURL, oracleId, oraclePwd);	//3
MemberDTO memberDTO = dao.getMemberDTO(userId, userPwd);	//4
dao.close();	//5

// 로그인 성공 여부에 따른 처리
if (memberDTO.getId() != null) {	//6
    // 로그인 성공
    session.setAttribute("UserId", memberDTO.getId());	//7 
    session.setAttribute("UserName", memberDTO.getName()); 
    response.sendRedirect("LoginForm.jsp");	//8
}
else {
    // 로그인 실패
    request.setAttribute("LoginErrMsg", "로그인 오류입니다.");		//9 
    request.getRequestDispatcher("LoginForm.jsp").forward(request, response);		//10
}
%>