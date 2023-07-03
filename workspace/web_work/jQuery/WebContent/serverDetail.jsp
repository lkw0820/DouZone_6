<%@page import="kosa.purchaseDetail"%>
<%@page import="java.util.List"%>
<%@page import="net.sf.json.JSONArray"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%!
    List<purchaseDetail> list;
    %>
    
    
	<%
	
	String pno = request.getParameter("pno");
	String aCode = request.getParameter("aCode");
	String aName = request.getParameter("aName");
	String eName = request.getParameter("eName");
	String status = request.getParameter("status");
	
	
	if(list == null){		
		list = new ArrayList<purchaseDetail>();		
		if(date != null){
			list.add(new purchaseDetail(date,pno,aCode,aName,eName,status));	
		}
	}else if(date != null){	
		list.add(new purchaseDetail(date,pno,aCode,aName,eName,status));
	}
	
	
		
	if(list != null && list.size() != 0){
		String json = JSONArray.fromObject(list).toString();
		out.print(json);
	}
	
	
	%>