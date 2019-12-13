<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.*,com.finalwarehouseproject.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Iventory Request</title>

<style type="text/css">
.content-select select{
	appearance: none;
	-webkit-appearance: none;
	-moz-appearance: none;
}

.content-select select::-ms-expand {
    display: none;
}

.content-select{
	max-width: 250px;
	position: relative;
}
 
.content-select select{
	display: inline-block;
	width: 100%;
	cursor: pointer;
  	padding: 7px 10px;
  	height: 42px;
  	outline: 0; 
  	border: 0;
	border-radius: 0;
	background: #f0f0f0;
	color: #7b7b7b;
	font-size: 1em;
	color: #999;
	font-family: 
	'Quicksand', sans-serif;
	border:2px solid rgba(0,0,0,0.2);
    border-radius: 12px;
    position: relative;
    transition: all 0.25s ease;
}
 
.content-select select:hover{
	background: #B1E8CD;
}

.content-select i{
	position: absolute;
	right: 20px;
	top: calc(50% - 13px);
	width: 16px;
	height: 16px;
	display: block;
	border-left:4px solid #2AC176;
	border-bottom:4px solid #2AC176;
	transform: rotate(-45deg); /* Giramos el cuadrado */
	transition: all 0.25s ease;
}
 
.content-select:hover i{
	margin-top: 3px;
}

.button {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
}
</style>

</head>

<%	
   ArrayList inventory= new ArrayList();
   inventory.add("Rocket");
   inventory.add("Mortar");
   inventory.add("Catapult");
   inventory.add("Female RoadRunner");
   inventory.add("Giant Mouse Trap");
   inventory.add("Instant Hole");
   inventory.add("Koenigsegg CCX");
   inventory.add("Anvil");
   inventory.add("Monster Rubber Band");
   inventory.add("Mallet");
   inventory.add("TNT");
   inventory.add("Roadrunner Custom Bird Seed Mix");
   inventory.add("Grand Piano");
   inventory.add("Crash Helmet");
   inventory.add("Nylon Rope");
   inventory.add("Sticky Fence");
   inventory.add("Small Bomb");
   
   
%>

<body>

 <form action="ControlInventory" method="get">
 
 <div class="content-select">
  Name: <select name="Select1">
  	<%  for(int i = 0; i < inventory.size(); i++) {
           String option = (String)inventory.get(i);
   %>
   <option value="<%= option %>"><%= option %></option>
   <% } %>
  </select>
  <i></i>
 </div>
 
  <br><br>
  
  <input type="submit" value="Send">
 
 
 </form>

</body>
</html>