<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.commondb.Common_DB"%>
<!DOCTYPE html>
<html lang="en" class="no-js">
	<head>
		<meta charset="UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
		<meta name="viewport" content="width=device-width, initial-scale=1.0"> 
		<title>College information</title>
		<meta name="description" content="Sticky Table Headers Revisited: Creating functional and flexible sticky table headers" />
		<meta name="keywords" content="Sticky Table Headers Revisited" />
		<meta name="author" content="Codrops" />
		<link rel="shortcut icon" href="../favicon.ico">
		<link rel="stylesheet" type="text/css" href="css/normalize_1.css" />
		<link rel="stylesheet" type="text/css" href="css/demo.css" />
		<link rel="stylesheet" type="text/css" href="css/component.css" />
		<!--[if IE]>
  		<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
		<![endif]-->
	</head>
        <style>
            input[type="checkbox"]{
  width: 30px; /*Desired width*/
  height: 30px; /*Desired height*/
}
        </style>
	<body align="center">
            <form name="ff1" action="CollegeDetails" method="POST">
		<div class="container">
			<!-- Top Navigation -->
			
			<header>
				<h1>College Information</h1>	
				
			</header>
			<div class="component">
				
				<table class="">
					<thead>
						<tr>
						<th>Select College</th>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Grade</th>
                        <th>Cut-off Minimum</th>
                        <th>Cut-off Maximum</th>
                        <th>Location</th>
                        <th>Type</th>
                        <th>Under of College</th>
                        <th>Information</th>
						</tr>
					</thead>
					<tbody>
                                             <%
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/counselling","root","password");
                    Statement st=con.createStatement();
                    String query="SELECT * FROM college ORDER BY count DESC";
                    ResultSet rs1=st.executeQuery(query);
                        //ResultSet rs1=Common_DB.ViewTable("counselling", "college");
                        while(rs1.next())
                        {
                     %>
						<tr>
			<td><input type="checkbox" name="c12" value="<%=rs1.getString(1)%>"/></td>
                        <td><%=rs1.getString("cid")%></td>
                        <td><%=rs1.getString("cname")%></td>
                        <td><%=rs1.getString("grade")%></td>
                        <td><%=rs1.getString("cutoffmini")%></td>
                        <td><%=rs1.getString("cutoffmax")%></td>
                        <td><%=rs1.getString("location")%></td>
                        <td><%=rs1.getString("type")%></td>
                        <td><%=rs1.getString("underofcollege")%></td>
                        <td><%=rs1.getString("information")%></td>
                                                       
						</tr>
                                                <%
            }
            %>
					</tbody>
				</table>
               <input type="submit" value="Submit" name="b2"  />
			
				
			
		<script src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
		<script src="http://cdnjs.cloudflare.com/ajax/libs/jquery-throttle-debounce/1.1/jquery.ba-throttle-debounce.min.js"></script>
		<script src="js/jquery.stickyheader.js"></script>
                </form>	
	</body>
</html>