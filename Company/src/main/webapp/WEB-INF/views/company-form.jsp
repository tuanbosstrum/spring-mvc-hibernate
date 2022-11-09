<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head><%@ page isELIgnored="false" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Company</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
 
</head>
<body>
 <div class="container">
  <div class="col-md-offset-2 col-md-7">
   <h2 class="text-center"> Thêm sản phẩm </h2> 
   <div class="panel panel-info"> 
    <div class="panel-body">
     <form:form action="saveCompany" cssClass="form-horizontal"
      method="post" modelAttribute="company"> 
    
      <form:hidden path="id" /> 
      <div class="form-group">
       <label for="masp" class="col-md-3 control-label">
        Mã sp</label>
       <div class="col-md-9">
        <form:input path="masp" cssClass="form-control" />
       </div>
      </div> 

      <div class="form-group">
       <label for="nhomsp" class="col-md-3 control-label">Nhóm sản phẩm</label>
       <div class="col-md-9">
        <form:input path="nhomsp" cssClass="form-control" />
       </div>
      </div> 
       <div class="form-group">
       <label for="tensp" class="col-md-3 control-label">Tên sản phẩm</label>
       <div class="col-md-9">
        <form:input path="tensp" cssClass="form-control" />
       </div>
      </div> 
       <div class="form-group">
       <label for="gia" class="col-md-3 control-label">Giá</label>
       <div class="col-md-9">
        <form:input path="gia" cssClass="form-control" />
       </div>
      </div> 
        <div class="form-group">
       <label for="mota" class="col-md-3 control-label">Mô tả</label>
       <div class="col-md-9">
        <form:input path="mota" cssClass="form-control" />
       </div>
      </div> 
       <div class="form-group">
       <label for="ngaytao" class="col-md-3 control-label">Ngày tạo</label>
       <div class="col-md-9">
        <form:input path="ngaytao" cssClass="form-control" />
       </div>
      </div> 

      <div class="form-group">
       <!-- Button -->
       <div class="col-md-offset-3 col-md-9">
        <button type="submit" class="btn btn-primary">Thêm sản phẩm </button>
       </div>
      </div>

     </form:form>
    </div>
   </div>
  </div>
 </div>
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
    
</body>
</html>