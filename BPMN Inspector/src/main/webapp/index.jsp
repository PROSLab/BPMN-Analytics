<html>
<head>
<meta charset="ISO-8859-1">
<title>BPMN Element Counter </title>
<script src="https://use.fontawesome.com/6ee62c23ff.js"></script>
<link rel="stylesheet" href="index.css">
</head>
<body>
	<h1> BPMN Element Counter</h1>
	<div class = "separate"></div>
	<div class="wrapper">	
		<form action="webapi/counter/fileUpload" method="post" enctype="multipart/form-data">
	  			<div class="file-upload">
	    			<input type="file" name="model"/>
	   				<i class="fa fa-arrow-up"></i>
	 			</div>
	 			<div class="inputbutton">
	 				<input type="submit" name="confirm" value="Count Elements" class="blue">
	 			</div>
				<h4>  Made by <a href="https://github.com/PROSLab"> PROS Lab  </a> </h4>
		</form>
	</div>
</body>
</html>
