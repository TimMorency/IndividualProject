<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>Jumbotron Template for Bootstrap</title>
  <!-- Bootstrap core CSS -->
  <link href="bootstrap/css/bootstrap.css" rel="stylesheet">
  <!-- Custom styles for this template -->
  <link href="jumbotron.css" rel="stylesheet">
  <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">League Groups</a>
    </div>
    <div id="navbar" class="navbar-collapse collapse">
      <form class="navbar-form navbar-right" action="j_security_check">
        <div class="form-group">
          <input type="text" placeholder="UserName" NAME="j_username" class="form-control">
        </div>
        <div class="form-group">
          <input type="password" placeholder="Password" class="form-control" NAME="j_password">
        </div>
        <button type="submit" class="btn btn-success" value="Log In">Sign in</button>
      </form>
    </div>
    <!--/.navbar-collapse -->
  </div>
</nav>
<!-- Main jumbotron for a primary marketing message or call to action -->
<div class="jumbotron">
  <div class="container">
    <h1>Hello Summoners!</h1>
    <p>League Groups is a fun interactive dashboard to help you compete with your friends, keep stats, learn about your playstyle and imporve at the game.</p>
    <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more »</a></p>
  </div>
</div>
<div class="container">
  <!-- Example row of columns -->
  <div class="row">
    <div class="col-md-4">
      <h2>Groups</h2>
      <p>Its as simple as inviting friends, or using your other league accounts, it's a simple way of keeping track of all of the games going on around you.</p>
      <p><a class="btn btn-default" href="#" role="button">View details »</a></p>
    </div>
    <div class="col-md-4">
      <h2>Friends</h2>
      <p>Anyone can join just send an invite to your friends and have them come and setup their account.</p>
      <p><a class="btn btn-default" href="#" role="button">View details »</a></p>
    </div>
    <div class="col-md-4">
      <h2>League Of Legends</h2>
      <p>Everyone enjoys the game this is a great way to see how and what your friends are doing, trying out a crazy new build talk about it on here, want to show off your latest ranked win tell your friends and much more.</p>
      <p><a class="btn btn-default" href="#" role="button">View details »</a></p>
    </div>
  </div>
  <hr>
  <footer>
    <p><br></p>
  </footer>
</div>

<!-- /container -->
<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="assets/js/jquery.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
