<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
		<thead>
			<tr>
				<td>Employee Id</td>
				<td>Employee Emp_Name</td>
				<td>Employee Emp_Email</td>
				<td>Employee Emp_Salary</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="employee">
			<tr>
				<td>${employee.empId }</td>
				<td>${employee.empname }</td>
				<td>${employee.EmpEmail }</td>
				<td>${employee.empsalary}</td>
				</tr>
			</c:forEach>

		</tbody>

	</table>
</body>
</html>