<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head><%@ page isELIgnored="false" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tuan Hoang</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
 
 
</head>
<body>
 <div class="container"> 
   <h1 style="text-align: center">Sản phẩm</h1>
   <hr />

   <input type="button" value="Thêm sản phẩm"
    onclick="window.location.href='showForm'; return false;"
    class="btn btn-success" />
    <br/><br/>
   <div class="panel panel-info">
    
    <div class="panel-body">
     <table class="table table-striped table-bordered">
      <tr>
      <th>Id</th>
       <th>Mã sản phẩm</th>
       <th>Nhóm sản phẩm</th> 
       <th>Tên sản phẩm</th>
       <th>Giá</th>
        <th>Mô tả</th>
         <th>Ngày tạo</th>
         <th colspan="2">Action</th>
         
      </tr>  
      <c:forEach var="tempCompany" items="${companys}">  
       <c:url var="updateLink" value="/updateForm">
        <c:param name="id" value="${tempCompany.id}" />
       </c:url>  
       <c:url var="deleteLink" value="/delete">
        <c:param name="id" value="${tempCompany.id}" />
       </c:url>

       <tr>
       <td>${tempCompany.id}</td>
        <td>${tempCompany.masp}</td>
        <td>${tempCompany.nhomsp}</td> 
		<td>${tempCompany.tensp}</td> 
		<td>${tempCompany.gia}</td> 
		<td>${tempCompany.mota}</td> 
		<td>${tempCompany.ngaytao}</td> 
        <td >
         <a  class="btn btn-success" href="${updateLink}">Cập nhật </a>
         
        </td>
		<td>
		<a class="btn btn-danger" href="${deleteLink}"
         onclick="if (!(confirm('ban co chac la muon xoa san pham?'))) return false">Xóa</a>
         </td>
       </tr>

      </c:forEach>

     </table>

    </div>
   </div>
   

 </div>
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
  
</body>
</html>>