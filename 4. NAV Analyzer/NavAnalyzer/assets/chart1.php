<?php

  // PHP variable to store the host address
 $db_host  = "localhost";
 // PHP variable to store the username
 $db_uid  = "root";
 // PHP variable to store the password
 $db_pass = "";
 // PHP variable to store the Database name  
 $db_name  = "android_api";
 // PHP variable to store the result of the PHP function 'mysql_connect()' which establishes the PHP & MySQL connection 

$db_con = mysql_connect($db_host,$db_uid,$db_pass) or die('could not connect');
 mysql_select_db($db_name);
/*
 * Following code will list all the products
 */
 if(isset($_POST['ShowChart']))

$sname=$_POST["sname"];


$result = mysql_query("SELECT history.date,history.nav from history INNER JOIN schemes ON history.code=schemes.pid where schemes.sname='". $_POST["sname"]."' order by date LIMIT 0, 30") or die(mysql_error());

while($row = mysql_fetch_array($result))
{
$data[] = $row[1];
$leg[] = $row[0];

}
require_once("C:/jpgraph-3.5.0b1/src/jpgraph.php"); 
require_once("C:/jpgraph-3.5.0b1/src/jpgraph_line.php"); 
require_once("C:/jpgraph-3.5.0b1/src/jpgraph_date.php");
 require_once("C:/jpgraph-3.5.0b1/src/jpgraph_bar.php");

 $graph = new Graph(450,600,"auto");
$graph->SetScale("textint");
$graph->img->SetMargin(50,30,50,50);
$graph->SetBackgroundImage(0.4,0.7,-1); //setting BG type
$graph->SetBackgroundImage("a.png",BGIMG_FILLFRAME); //adding image
$graph->SetShadow();

$graph->xaxis->SetTickLabels($leg);


$bplot = new BarPlot($data);
$bplot->SetFillColor("lightgreen"); // Fill color
$bplot->value->Show();
$bplot->value->SetFont(FF_ARIAL,FS_BOLD);
$bplot->value->SetAngle(45);
$bplot->value->SetColor("black","navy");

$graph->Add($bplot);
$graph->Stroke(); 








?>