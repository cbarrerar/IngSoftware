<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>IKEA Employee Control</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="default.css" rel="stylesheet" type="text/css" media="all" />
<link href="fonts.css" rel="stylesheet" type="text/css" media="all" />
<!--[if IE 6]>
<link href="default_ie6.css" rel="stylesheet" type="text/css" />
<![endif]-->
</head>
<body>
<div id="wrapper">
	<div id="menu-wrapper">
		<div id="menu" class="container">
			<ul>
				<li class="current_page_item"><a href="#">Homepage</a></li>
				<li><a href="#">About</a></li>
				<li><a href="#">Blog</a></li>
				<li><a href="#">Portfolio</a></li>
				<li><a href="#">Contact</a></li>
			</ul>
		</div>
		<!-- end #menu --> 
	</div>
	<div id="header-wrapper">
		<div id="header" class="container">
			<div id="logo">
				<h1><a href="index.jsp">IKEA Employee Control</a></h1>
				
			</div>
		</div>
	</div>
        <div>   
                    <form id="inicio-form" action="InitSesion" method="post">
                      <fieldset>
                          <div class="contact">
                            <span> Usuario </span>
                            <input type="text" name="usuario" />
                            <!-- <input type="text" name="your_usern" value="" id="txtuser" /> -->
                          </div>
                          <div class="contact">
                            <span> Contraseña </span>
                            <input type="password" name="pass" />
                            <!--<input type="password" name="your_passw" value="" id="txtpass"/>  -->
                          </div>
                          <br>
                        <input type="submit" class="submit" value="Ingresar" id="btniniciar"> 
                      </fieldset>
                    </form>
        </div>
</div>
</body>
</html>
