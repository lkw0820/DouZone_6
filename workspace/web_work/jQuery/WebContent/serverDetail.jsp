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
	String productCode = request.getParameter("productCode");
	String productName = request.getParameter("productName");
	String unit = request.getParameter("unit");
	String cnt = request.getParameter("cnt");
	String price = request.getParameter("price");
	String supplyValue = request.getParameter("supplyValue");
	String vat = request.getParameter("vat");
	String totalPrice = request.getParameter("totalPrice");
	String note = request.getParameter("note");
	

	
	
	if(list == null){		
		list = new ArrayList<purchaseDetail>();		
		if(pno != null){
			list.add(new purchaseDetail(pno,productCode,productName,unit,cnt,price,supplyValue,vat,totalPrice,note));	
		}
	}else if(pno != null){	
		list.add(new purchaseDetail(pno,productCode,productName,unit,cnt,price,supplyValue,vat,totalPrice,note));
	}
	
	
		
	if(list != null && list.size() != 0){
		String json = JSONArray.fromObject(list).toString();
		out.print(json);
	}
	
	
	%>