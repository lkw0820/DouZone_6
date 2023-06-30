<%@page import="kosa.purchaseOrder"%>
<%@page import="java.util.List"%>
<%@page import="net.sf.json.JSONArray"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%!
    List<purchaseOrder> list;
    %>
    
    
	<%
	String date = request.getParameter("date");
	//String pno = request.getParameter("pno");
	//String aCode = request.getParameter("aCode");
	//String aName = request.getParameter("aName");
	String eName = request.getParameter("eName");
	//String status = request.getParameter("status");
	
	
	if(list == null){		
		list = new ArrayList<purchaseOrder>();		
		if(date != null){
			list.add(new purchaseOrder());	
		}
	}else if(date != null){	
		list.add(new purchaseOrder());
	}
	
	
		
	if(list != null && list.size() != 0){
		String json = JSONArray.fromObject(list).toString();
		out.print(json);
	}
	
	
	%>