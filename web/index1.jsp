

<%@page import="com.test.bean.Ipsm"%>
<%@page import="com.test.dao.IpsmDao"%>
<%@page import="com.test.bean.Snm"%>
<%@page import="com.test.dao.SnmDao"%>
<%@page import="com.test.bean.Vdds"%>
<%@page import="com.test.dao.VddsDao"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.test.bean.Bgw"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.test.dao.Dao"%>

<!DOCTYPE html>
<html lang="en">
  
<!-- Mirrored from zoyothemes.com/tripaco/layouts/index.html by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 17 Nov 2016 10:18:51 GMT -->
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <link href='https://fonts.googleapis.com/css?family=Lato:300,400,700' rel='stylesheet' type='text/css'>
 
    <link href='Accets/custom.css' rel='stylesheet' type='text/css'>

    <link rel="shortcut icon" href="images/favicon.ico">

    <title>Title</title>
    
    
    <!--<link rel="stylesheet" type="text/css" href="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.0/css/jquery.dataTables.css">-->
     <link rel="stylesheet" type="text/css" href="Accets1/css/jquery.dataTables.css">
     <script type="text/javascript" src="Accets/js/jquery-2.1.4.min.js"></script>
     <script type="text/javascript" src="Accets/js/bootstrap.min.js"></script>
     <!--<script type="text" src="https://cdn.datatables.net/1.10.12/js/dataTables.bootstrap.min.js"></script>-->
     <script type="text/javascript" src="Accets/js/jquery-datatable.js"></script>
     <!--<link rel="stylesheet" href="https://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css" />-->
     <link rel="stylesheet" type="text/css" href="Accets1/css/jquery.dataTables.min.css">
 
        <!-- 
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-          BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">-->
         <link rel="stylesheet" type="text/css" href="Accets1/css/bootstrap.min.css">
            <!-- Google font -->
    <link href="https://fonts.googleapis.com/css?family=Arimo:400,700|Josefin+Sans:400,600,700" rel="stylesheet">

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" type="text/css" href="Accets/css/bootstrap.min.css">

    <!-- Material-design-iconic-font -->
    <link rel="stylesheet" type="text/css" href="Accets/css/material-design-iconic-font.min.css">
    <link rel="stylesheet" type="text/css" href="Accets/css/ionicons.min.css">

    <!-- headline.css -->
    <link rel="stylesheet" type="text/css" href="Accets/css/headline.css">

    <!-- jquery.fullPage.css -->
    <link rel="stylesheet" type="text/css" href="Accets/css/jquery.fullPage.css">

    <!-- Custom styles for this template -->
    <link rel="stylesheet" type="text/css" href="Accets/css/style.css">

	<link rel="stylesheet" type="text/css" href="Accets/css/table.css">
	
       <link rel="stylesheet" type="text/css" href="Accets/css/style.css" />
       <!--<script src="Accets/js/modernizr.custom.63321.js"></script>--> 
  
      
    
    <script>
        $(document).ready(function() {
        $('#example').DataTable();
        $('#example2').DataTable();
        $('#example3').DataTable();
        $('#example1').DataTable();
        });
    </script>
    
 
    <script>
        //This code is to view the page
$(document).ready(function () {

   
    $(".sh").change(function () {
         
      if ($(this).val() == "BGW") {
//          $('#appId1').val($(this).val());
$('.m1id').val("");
//$('.m1month').val("");
$('.m1month').val("");
$('.m1date').val("");
$('.m1col1').val("");
$('.m1col2').val("");
$('.m1col3').val("");
$('.m1col4').val("");
$('.m1col5').val("");
$('.m1col6').val("");
$('.m1col7').val("");
$('.m1col8').val("");
$('.m1col9').val("");
$('.m1col10').val("");
$('.m1col11').val("");
$('.m1col12').val("");
$('.m1col13').val("");
$('.m1col14').val("");
$('.m1col15').val("");
$('.m1col16').val("");

          $('#appName1').val($(this).val());
              $('#myModal2').modal('hide');
              $('#myModal3').modal('hide');
              $('#myModal4').modal('hide');
//              $('.formModel1').closest('form').find("input[type=text]").valueOf("");
//            $("#formModel1").trigger('reset');
            $('#myModal1').modal();
              
             
      }
      if ($(this).val() == "VDDS") {
//          $('#appId2').val($(this).val());
//document.getElementById('m1month').valueOf("");
$('.m2id').val("");   
        $('.m2month').val("");
        $('.m2date').val("");
        $('.m2col1').val("");
        $('.m2col2').val("");
        $('.m2col3').val("");
        $('.m2col4').val("");
        $('.m2col5').val("");
        $('.m2col6').val("");
        $('.m2col7').val("");
              $('#myModal1').modal('hide');
              $('#myModal3').modal('hide');
              $('#myModal4').modal('hide');
          $('#appName2').val($(this).val());            
        $('#myModal2').modal();        
      }
              if ($(this).val() == "SNM") {        
                  $('.m3id').val("");
     $('.m3month').val("");
        $('.m3date').val("");
        $('.m3col1').val("");
        $('.m3col2').val("");
        $('.m3col3').val("");
        $('.m3col4').val("");
        $('.m3col5').val("");        
        $('.m3col6').val("");
        $('.m3col7').val("");
        $('.m3col8').val("");
//          $('#appId3').val($(this).val());
            $('#myModal1').modal('hide');
              $('#myModal2').modal('hide');
              $('#myModal4').modal('hide');
          $('#appName3').val($(this).val());  
         
        $('#myModal3').modal();
      }
              if ($(this).val() == "IPSM") {
       
        
            $('.m4month').val("");
            $('.m4id').val("");
        $('.m4date').val("");
        $('.m4col1').val("");
        $('.m4col2').val("");
        $('.m4col3').val("");
        $('.m4col4').val("");
        $('.m4col5').val("");
//          $('#appId4').val($(this).val());
               $('#myModal1').modal('hide');
              $('#myModal2').modal('hide');
              $('#myModal3').modal('hide');
          $('#appName4').val($(this).val());
        
        $('#myModal4').modal();
      }
   
 });

});
</script>
    
    <!--            graph      -->
    	<!--<link rel="stylesheet" href="assets/bootstrap/bootstrap4-alpha3.min.css">-->
    
    
    <style>
			body {
				background-color: #fafafa;
				font-size: 12px;
				line-height: 1.5;
			}
			
			h1,h2,h3,h4,h5,h6 {
				font-weight: 400;	
			}
			
			#header {
				border-bottom: 5px solid #37474F;
				color: #37474F;
				margin-bottom: 1.5rem;
				padding: 1rem 0;
			}
			
			#revenue-tag {
				font-weight: inherit !important;
				border-radius: 0px !important;
			}
			
			.card {
				border: 0rem;
				border-radius: 0rem;
			}
			
			.card-header {
				background-color: #37474F;
				border-radius: 0 !important;
				color:	white;
				margin-bottom: 0;
				padding:	1rem;
			}
			
			.card-block {
				border: 1px solid #cccccc;	
			}
			
			.shadow {
				box-shadow: 0 6px 10px 0 rgba(0, 0, 0, 0.14),
										0 1px 18px 0 rgba(0, 0, 0, 0.12),
										0 3px 5px -1px rgba(0, 0, 0, 0.2);
			}
			
			#revenue-column-chart, #products-revenue-pie-chart, #orders-spline-chart {
				height: 300px;
				width: 100%;
			}	
                        .modal, .modal-backdrop{
                            position: inherit !important;
                        }
		</style>
                		<!-- Scripts -->
		
  </head>

    <body class="image-background" bg-image="images/bg6.jpg">
    


    <header class="header">
      <nav class="navbar navbar-custom" style="float:left !important">
        <div class="container-fluid">
        
          <!-- Collect the nav links, forms, and other content for toggling -->
          <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav navbar-right dark-nav" id="menu">
              <li class="active" data-menuanchor="1stPage"><a href="#1stPage" class="active">Home</a></li>
              <li data-menuanchor="2ndPage">
			 <a href="#2ndPage">Graph</a> 
			  </li>
			  <li class="active" data-menuanchor="3rdPage">
			  <a href="#3rdPage">Add Result</a></li>
               <li data-menuanchor="4thPage"><a href="#4thPage">DB Result </a></li> 
            </ul>
          </div>
        </div>
      </nav>
    </header>

    <div id="fullpage">
      <div class="overlay-demo"></div>
      

      <div class="section subscribe dark-image" id="section1">
        <div class="container">
          <div class="common-container">
            <div class="row">
              <div class="col-md-10 col-md-offset-1">
                <div class="Home-section section-title title">
                  <h1 class="text-center">Home</h1>
                  <p class="text-center">To create an application status view for every release from a performance aspect. Performance Dahsboard Page should generate charts for different transaction for the same application based on date-range or release month selection. Along with this, it should also give historical data based on user need for any given application. On the right side of page a view on upcoming activities(this will be kind of moving them).</p>
				  <p class="text-center">Currently, we are expecting a very simple HTML page to feed data manually on the page and that will insert record in DB. Please help to complete this activity by EOD of Tuesday(11/15). Please see attached deck for HTML Page design.</p>
				  <p class="text-center">Will share template for main dashboard page soon.</p>
                
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>

      <div class="section about dark-image" id="section2">
        <div class="container">
          <div class="common-container">
            <div class="row">
              <div class="col-md-10 col-md-offset-1">

                <div class="about-section section-title title">
                  <h1 class="text-center">Graph</h1>	  
                </div>
		<div class="container">
			<div class="row m-b-1">
				

				<div class="col-lg-10">
						<div class="card shadow">
						<h4 class="card-header">Graphical Representation of Transactions</h4>
						<div class="card-block">
							<div id="products-revenue-pie-chart"></div>
						</div>
					</div>
				</div>
			</div> <!-- row -->
		</div> <!-- container -->

              </div><!-- End col -->
            </div><!-- End row -->

          </div>
        </div>
      
</div>
	  
	  <!---- Form ------------------------------------------->
	      <div class="section about dark-image" id="section3">
        <div class="container">
          <div class="common-container">
            <div class="row">
              

                <div class="about-section section-title title">
                  <h1 class="text-center">For DB to store data</h1>
                  			  
                </div>
				
				
		
		     <%
                int ID=0;
                String name1="";
                String date1="";
                String month1="";
                String col1a="";
                String col2a="";
                String col3a="";
                String col4a="";
                String col5a="";
                String col6a="";
                String col7a="";
                String col8a="";
                String col9a="";
                String col10a="";
                String col11a="";
                String col12a="";
                String col13a="";
                String col14a="";
                String col15a="";
                String col16a="";        
              
                
                if(request.getAttribute("edit")!=null){
                Bgw d1=(Bgw)request.getAttribute("edit");
                
                ID=d1.getId();
                System.out.print("ID is :"+ID);
//                name1=d1.getName();
//                date1=d1.getDate();
//                month1=d1.getMonth();
//                col1a=d1.getCol1();
//                col2a=d1.getCol2();
//                col3a=d1.getCol3();
//                col4a=d1.getCol4();
//                col5a=d1.getCol5();
//                col6a=d1.getCol6();
//                col7a=d1.getCol7();
//                col8a=d1.getCol8();
//                col9a=d1.getCol9(); 
//                col10a=d1.getCol10();
//                col11a=d1.getCol11();
//                col12a=d1.getCol12();
//                col13a=d1.getCol13();
//                col14a=d1.getCol14();
//                col15a=d1.getCol15();
//                col16a=d1.getCol16();                                                                        
               }
            %>
            
              <div class="form-group col-md-3" id="hideMenu">
      <label for="sel1">Application :</label>
      <select class="form-control sh" size="1" id="Rank" title="" name="Rank">
        <option value="" disabled selected>Choose</option>
        <option value="BGW" <%= (name1.equals("BGW"))?"selected":"BGW" %> >BGW</option>
        <option value="VDDS" <%= (name1.equals("VDDS"))?"selected":"VDDS" %> >VDDS</option>
        <option value="SNM" <%= (name1.equals("SNM"))?"selected":"SNM" %> >SNM</option>
        <option value="IPSM" <%= (name1.equals("IPSM"))?"selected":"IPSM" %> >IPSM</option>
    </select>
              </div>
            <div id="myModal1" class="modal fade" style="width: 1163px !important;">
            <div class="modal-dialog" style="width: 1159px !important;">
                <div class="modal-content">
                     <form class="form-horizontal" id="formModel1" action="BgwController" method="post" >
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title">Transaction Form</h4>
                    </div>
                    <div class="modal-body col-md-12">
                        
                       
                            <input class="form-control m1id" id="dbId1" type="hidden" name="id" value="${edit1.id}"/>
                            <!--<input type="hidden" name="name" id="appId1" value="<%=name1%>" placeholder="application name" />-->
                            <div class="row col-xs-12"> 
                                <div class="row">
                                <div class="form-group has-warning col-xs-4">
                                        <label class="col-xs-4 control-label" for="inputSuccess">Application Name</label>
                                        <div class="col-xs-8" style="padding-top: 24px;">
                                            <input class="form-control" type="text" name="name" id="appName1" value="${edit1.name}"/>
                                        </div>
                                    </div>
                                    <div class="form-group has-warning col-xs-4">
                                        <label class="col-xs-4 control-label" for="inputSuccess">Rel.Month</label>
                                        <div class="col-xs-8" style="padding-top: 24px;">
                                            <input class="form-control m1month" type="month" name="month" value="${edit1.month}" />
                                        </div>
                                    </div>
                                         <div class="form-group has-warning col-xs-4">
                                        <label class="col-xs-4 control-label" for="inputSuccess">Date</label>
                                        <div class="col-xs-8" style="padding-top: 24px;">
                                            <input class="form-control m1date" type="date" name="date" value="${edit1.date}"/>
                                        </div>
                                    </div>
                                </div>
                                          <label style="margin-left: 440px;font-size: 15px;font-weight: 800;color: #0f3352;" class="control-label has-error" for="inputError">Transactions & Response Time</label>
                                    
<!--                            <div class="form-group has-error" style="margin-bottom: -20px;">
                                <label class="control-label" for="inputError">Transactions Name</label>
                                <div class="col-xs-6">       
                                    <label class="control-label" for="inputError">Average Response Time</label>
                                </div>
                            </div>-->
                                     <br>
                                     <div class="row">
                                         <div class="form-group has-success col-xs-4">
                                             <label class="col-xs-6 control-label" for="inputSuccess">Open Equipment Page</label>
                                         <div class="col-xs-6" style="padding-top: 24px;">
                                            <input type="text" class="form-control m1col1" name="bGWOpenEquipmentPage" min="0" max="100" step="0.1" value="${edit1.col1}" required />
                                         </div>
                                    </div>
                                        <div class="form-group has-success col-xs-4">
                                          <label class="col-xs-6 control-label" for="inputSuccess">Open Add Aisle Page</label>
                                        <div class="col-xs-6" style="padding-top: 24px;">
                                            
                                            <input type="text" class="form-control m1col2" name="bGWOpenAddAislePage" min="0" max="100" step="0.1" value="${edit1.col2}" required/>
                                        </div>
                                    </div>
                                         <div class="form-group has-success col-xs-4">
                                         <label class="col-xs-6 control-label" for="inputSuccess">Load Rack Details</label>
                                        <div class="col-xs-6" style="padding-top: 24px;">
                                            
                                            <input type="text" class="form-control m1col3" name="bGWLoadRackDetails" min="0" max="100" step="0.1" value="${edit1.col3}" required />
                                        </div>
                                    </div>
                                     </div>
                                         <div class="row">
                                        
                                        <div class="form-group has-success col-xs-4">
                                          <label class="col-xs-6 control-label" for="inputSuccess">Path Select Path</label>
                                        <div class="col-xs-6" style="padding-top: 24px;">
                                            <input type="text" class="form-control m1col4" name="bGWPathSelectPath" min="0" max="100" step="0.1" value="${edit1.col4}"required/>
                                        </div>
                                    </div>
                                        <div class="form-group has-success col-xs-4">
                                         <label class="col-xs-6 control-label" for="inputSuccess">Path Open CircuitId Details</label>
                                        <div class="col-xs-6" style="padding-top: 24px;">
                                            <input type="text" class="form-control m1col5" name="bGWPathOpenCircuitIdDetails" min="0" max="100" step="0.1" value="${edit1.col5}" required />
                                        </div>
                                    </div>
                                         <div class="form-group has-success col-xs-4">
                                          <label class="col-xs-6 control-label" for="inputSuccess">Path Open Circuit View Page</label>
                                        <div class="col-xs-6" style="padding-top: 24px;">
                                            <input type="text" class="form-control m1col6" name="bGWPathOpenCircuitViewPage" min="0" max="100" step="0.1" value="${edit1.col6}" required/>
                                        </div>
                                    </div>
                                     </div>
                                        
                                          <div class="row">
                                         <div class="form-group has-success col-xs-4">
                                         <label class="col-xs-6 control-label" for="inputSuccess">Path Open Print View Page</label>
                                        <div class="col-xs-6" style="padding-top: 24px;">
                                            <input type="text" class="form-control m1col7" name="bGWPathOpenPrintViewPage" min="0" max="100" step="0.1" value="${edit1.col7}" required />
                                        </div>
                                    </div>
                                        <div class="form-group has-success col-xs-4">
                                          <label class="col-xs-6 control-label" for="inputSuccess">Path Open Circuit Premises Page</label>
                                        <div class="col-xs-6" style="padding-top: 24px;">
                                            <input type="text" class="form-control m1col8" name="bGWPathOpenCircuitPremisesPage" min="0" max="100" step="0.1" value="${edit1.col8}" required/>
                                        </div>
                                    </div>
                                         <div class="form-group has-success col-xs-4">
                                         <label class="col-xs-6 control-label" for="inputSuccess">Path Open Circuit View Page</label>
                                        <div class="col-xs-6" style="padding-top: 24px;">
                                            <input type="text" class="form-control m1col9" name="bGWPathClickModify" min="0" max="100" step="0.1" value="${edit1.col9}"  required />
                                        </div>
                                    </div>
                                     </div>
                                          <div class="row">
                                        
                                        <div class="form-group has-success col-xs-4">
                                          <label class="col-xs-6 control-label" for="inputSuccess">Path Click Modify</label>
                                        <div class="col-xs-6" style="padding-top: 24px;">
                                            <input type="text" class="form-control m1col10" name="bGWSiteOpenAddNewSitePage" min="0" max="100" step="0.1" value="${edit1.col10}" required/>
                                        </div>
                                    </div>
                                        <div class="form-group has-success col-xs-4">
                                         <label class="col-xs-6 control-label" for="inputSuccess">Site Open Add New Site Page</label>
                                        <div class="col-xs-6" style="padding-top: 24px;">
                                            <input type="text" class="form-control m1col11" name="bGWViewOrderOpenViewOrderPage" min="0" max="100" step="0.1" value="${edit1.col11}" required />
                                        </div>
                                    </div>
                                        <div class="form-group has-success col-xs-4">
                                          <label class="col-xs-6 control-label" for="inputSuccess">View Order OpenView Order Page</label>
                                        <div class="col-xs-6" style="padding-top: 24px;">
                                            <input type="text" class="form-control m1col12" name="bGWViewOrderOpenDetailsPage" min="0" max="100" step="0.1" value="${edit1.col12}"  required/>
                                        </div>
                                    </div>
                                     </div>
                                      
                                         <div class="row">
                                         <div class="form-group has-success col-xs-4">
                                         <label class="col-xs-6 control-label" for="inputSuccess">View Order Open Audits Tab</label>
                                        <div class="col-xs-6" style="padding-top: 24px;">
                                            <input type="text" class="form-control m1col13" name="bGWViewOrderOpenAuditsTab" min="0" max="100" step="0.1" value="${edit1.col13}" required />
                                        </div>
                                    </div>
                                        <div class="form-group has-success col-xs-4">
                                          <label class="col-xs-6 control-label" for="inputSuccess">View Order Open Interface Activity</label>
                                        <div class="col-xs-6" style="padding-top: 24px;">
                                            <input type="text" class="form-control m1col14" name="bGWViewOrderOpenInterfaceActivityTab" min="0" max="100" step="0.1" value="${edit1.col14}"  required/>
                                        </div>
                                    </div>
                                        <div class="form-group has-success col-xs-4">
                                         <label class="col-xs-6 control-label" for="inputSuccess">Search Task Record</label>
                                        <div class="col-xs-6" style="padding-top: 24px;">
                                            <input type="text" class="form-control m1col15" name="bGWSearchTaskRecord" min="0" max="100" step="0.1" value="${edit1.col15}" required />
                                        </div>
                                    </div>
                                     </div>
                                         <div class="row">
                                         
                                        <div class="form-group has-success col-xs-4">
                                          <label class="col-xs-6 control-label" for="inputSuccess">Search Task Open Task Detail</label>
                                        <div class="col-xs-6" style="padding-top: 24px;">
                                            <input type="text" class="form-control m1col16" name="bGWSearchTaskOpenTaskDetailPage" min="0" max="100" step="0.1" value="${edit1.col16}"  required/>
                                        </div>
                                    </div>
                                     </div>
                                    </div>
                                            <c:remove var="edit1"  scope="session"/>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal" >Close</button>
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </div>
                </form>
                </div>
            </div>
        </div>
		<div id="myModal2" class="modal fade" style="width: 1163px !important;">
            <div class="modal-dialog" style="width: 1159px !important;">
                <div class="modal-content">
                     <form class="form-horizontal" action="VddsController" method="post" >
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title">Transaction Form</h4>
                    </div>
                    <div class="modal-body col-md-12">
                        
                       
                            <input  class="form-control m2id" id="dbId2" type="hidden" name="id" value="${edit2.id}"/>
                            <!--<input type="hidden" name="name" id="appId1" value="<%=name1%>" placeholder="application name" />-->
                            <div class="row col-xs-12"> 
                                <div class="row">
                                <div class="form-group has-warning col-xs-4">
                                        <label class="col-xs-4 control-label" for="inputSuccess">Application Name</label>
                                        <div class="col-xs-8" style="padding-top: 24px;">
                                            <input type="text" class="form-control" name="name" id="appName2" value="${edit2.name}"/>
                                        </div>
                                    </div>
                                    <div class="form-group has-warning col-xs-4">
                                        <label class="col-xs-4 control-label" for="inputSuccess">Rel.Month</label>
                                        <div class="col-xs-8" style="padding-top: 24px;">
                                            <input type="month"  class="form-control m2month" name="month" value="${edit2.month}" />
                                        </div>
                                    </div>
                                         <div class="form-group has-warning col-xs-4">
                                        <label class="col-xs-4 control-label" for="inputSuccess">Date</label>
                                        <div class="col-xs-8" style="padding-top: 24px;">
                                            <input type="date" class="form-control m2date" name="date" value="${edit2.date}"/>
                                        </div>
                                    </div>
                                </div>
                                          
                                    <label style="margin-left: 440px;font-size: 15px;font-weight: 800;color: #0f3352;" class="control-label has-error" for="inputError">Transactions & Response Time</label>
<!--                            <div class="form-group has-error" style="margin-bottom: -20px;">
                                <label class="col-xs-6 control-label" for="inputError">Transaction Name</label>
                                <div class="col-xs-6">       
                                    <label class="control-label" for="inputError">Average Response Time</label>
                                </div>
                            </div>-->
                                     <br>
                                     <div class="row">
                                         <div class="form-group has-success col-xs-6">
                                         <label class="col-xs-6 control-label" for="inputSuccess">Circuit-Search Circuit</label>
                                        <div class="col-xs-6" style="padding-top: 24px;">
                                            <input type="text" class="form-control m2col1" name="vDDSCircuitSearchCircuit" min="0" max="100" step="0.1" value="${edit2.col1}" required />
                                        </div>
                                    </div>
                                        <div class="form-group has-success col-xs-6">
                                          <label class="col-xs-6 control-label" for="inputSuccess">Work Order-Search Work Order</label>
                                        <div class="col-xs-6" style="padding-top: 24px;">
                                            <input type="text"  class="form-control m2col2"  name="vDDSWorkOrderSearchWorkOrder"  min="0" max="100" step="0.1" value="${edit2.col2}" required/>
                                        </div>
                                    </div>
                                     </div>
                                         <div class="row">
                                         <div class="form-group has-success col-xs-6">
                                         <label class="col-xs-6 control-label" for="inputSuccess">WS Get PVC Changeinfo </label>
                                        <div class="col-xs-6" style="padding-top: 24px;">
                                            <input type="text" class="form-control m2col3"  name="vDDSWSGetPVCChangeinfo" min="0" max="100" step="0.1" value="${edit2.col3}" required />
                                        </div>
                                    </div>
                                        <div class="form-group has-success col-xs-6">
                                          <label class="col-xs-6 control-label" for="inputSuccess">WS Get Circuit & Pvcs IPSM</label>
                                        <div class="col-xs-6" style="padding-top: 24px;">
                                            <input type="text" class="form-control m2col4"   name="vDDSWSGetCircuitAndPvcsIPSM" min="0" max="100" step="0.1" value="${edit2.col4}"required/>
                                        </div>
                                    </div>
                                     </div>
                                         <div class="row">
                                         <div class="form-group has-success col-xs-6">
                                         <label class="col-xs-6 control-label" for="inputSuccess">TDM Order Approve</label>
                                        <div class="col-xs-6" style="padding-top: 24px;">
                                            <input type="text" class="form-control m2col5"  name="vDDSTDMOrderApprove" min="0" max="100" step="0.1" value="${edit2.col5}" required />
                                        </div>
                                    </div>
                                        <div class="form-group has-success col-xs-6">
                                          <label class="col-xs-6 control-label" for="inputSuccess">TDM Order Provisioning-Search WorkOrder</label>
                                        <div class="col-xs-6" style="padding-top: 24px;">
                                            <input type="text" class="form-control m2col6"  name="vDDSTDMOrderProvisioningSearchWorkOrder" min="0" max="100" step="0.1" value="${edit2.col6}" required/>
                                        </div>
                                    </div>
                                     </div>
                                          <div class="row">
                                         <div class="form-group has-success col-xs-6">
                                         <label class="col-xs-6 control-label" for="inputSuccess">TDM Order Provisioning-Click Submit Provision Button</label>
                                        <div class="col-xs-6" style="padding-top: 24px;">
                                            <input type="text" class="form-control m2col7"  name="vDDSTDMOrderProvisioningClickSubmitProvisionButton" min="0" max="100" step="0.1" value="${edit2.col7}" required />
                                        </div>
                                    </div>
                                       
                                     </div>
                      
                                    </div>
                       <c:remove var="edit2"  scope="session"/>
                    </div>
                    <div class="modal-footer">
                         <button type="button" class="btn btn-default" data-dismiss="modal" >Close</button>
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </div>
                </form>
                </div>
            </div>
        </div>
       
        <div id="myModal3" class="modal fade" style="width: 1163px !important;">
            <div class="modal-dialog" style="width: 1159px !important;">
                <div class="modal-content">
                     <form class="form-horizontal" action="SnmController" method="post" >
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title">Transaction Form</h4>
                    </div>
                    <div class="modal-body col-md-12">
                        
                       
                            <input class="form-control m3id" id="dbId3" type="hidden" name="id" value="${edit3.id}"/>
                            <!--<input type="hidden" name="name" id="appId1" value="<%=name1%>" placeholder="application name" />-->
                            <div class="row col-xs-12"> 
                                <div class="row">
                                <div class="form-group has-warning col-xs-4">
                                        <label class="col-xs-4 control-label" for="inputSuccess">Application Name</label>
                                        <div class="col-xs-8" style="padding-top: 24px;">
                                            <input type="text" class="form-control"  name="name" id="appName3" value="${edit3.name}"/>
                                        </div>
                                    </div>
                                    <div class="form-group has-warning col-xs-4">
                                        <label class="col-xs-4 control-label" for="inputSuccess">Rel.Month</label>
                                        <div class="col-xs-8" style="padding-top: 24px;">
                                            <input type="month" class="form-control m3month"  name="month" value="${edit3.month}" />
                                        </div>
                                    </div>
                                         <div class="form-group has-warning col-xs-4">
                                        <label class="col-xs-4 control-label" for="inputSuccess">Date</label>
                                        <div class="col-xs-8" style="padding-top: 24px;">
                                            <input type="date" class="form-control m3date"  name="date" value="${edit3.date}"/>
                                        </div>
                                    </div>
                                </div>
                                          
                                  <label style="margin-left: 440px;font-size: 15px;font-weight: 800;color: #0f3352;" class="control-label has-error" for="inputError">Transactions & Response Time</label>  
<!--                            <div class="form-group has-error" style="margin-bottom: -20px;">
                                <label class="col-xs-6 control-label" for="inputError">Transaction Name</label>
                                <div class="col-xs-6">       
                                    <label class="control-label" for="inputError">Average Response Time</label>
                                </div>
                            </div>-->
                                     <br>
                                     <div class="row">
                                         <div class="form-group has-success col-xs-6">
                                         <label class="col-xs-6 control-label" for="inputSuccess">Advanced Trunk Search-Search Trunks</label>
                                        <div class="col-xs-6" style="padding-top: 24px;">
                                            <input type="text" class="form-control m3col1"  name="sNMAdvancedTrunkSearchSearchTrunks"  min="0" max="100" step="0.1" value="${edit3.col1}" required />
                                        </div>
                                    </div>
                                        <div class="form-group has-success col-xs-6">
                                          <label class="col-xs-6 control-label" for="inputSuccess">Circuit Assign/Search Site Partname</label>
                                        <div class="col-xs-6" style="padding-top: 24px;">
                                            <input type="text" class="form-control m3col2"  name="provisionFindPortsField" min="0" max="100" step="0.1" value="${edit3.col2}" required/>
                                        </div>
                                    </div>
                                     </div>
                                         <div class="row">
                                         <div class="form-group has-success col-xs-6">
                                         <label class="col-xs-6 control-label" for="inputSuccess">Circuit Assign/Provisio-Find Ports Field </label>
                                        <div class="col-xs-6" style="padding-top: 24px;">
                                            <input type="text" class="form-control m3col3"  name="provisionAssignprovisionAssign" min="0" max="100" step="0.1" value="${edit3.col3}" required />
                                        </div>
                                    </div>
                                        <div class="form-group has-success col-xs-6">
                                          <label class="col-xs-6 control-label" for="inputSuccess">Circuit View Modify-Query</label>
                                        <div class="col-xs-6" style="padding-top: 24px;">
                                            <input type="text" class="form-control m3col4"  name="sNMCircuitViewModifyQuery" min="0" max="100" step="0.1" value="${edit3.col4}"required/>
                                        </div>
                                    </div>
                                     </div>
                                         <div class="row">
                                         <div class="form-group has-success col-xs-6">
                                         <label class="col-xs-6 control-label" for="inputSuccess">NNIConnection New-SEarch NNI</label>
                                        <div class="col-xs-6" style="padding-top: 24px;">
                                            <input type="text" class="form-control m3col5"  name="sNMNNIConnectionNewSearchNNI" min="0" max="100" step="0.1" value="${edit3.col5}" required />
                                        </div>
                                    </div>
                                        <div class="form-group has-success col-xs-6">
                                          <label class="col-xs-6 control-label" for="inputSuccess">WS find Access Cicuit Capacity At Multiple Sites</label>
                                        <div class="col-xs-6" style="padding-top: 24px;">
                                            <input type="text" class="form-control m3col6"   name="sNMWSfindAccessCicuitCapacityAtMultipleSites" min="0" max="100" step="0.1" value="${edit3.col6}" required/>
                                        </div>
                                    </div>
                                     </div>
                                          <div class="row">
                                         <div class="form-group has-success col-xs-6">
                                         <label class="col-xs-6 control-label" for="inputSuccess">WS find Path Capacity</label>
                                        <div class="col-xs-6" style="padding-top: 24px;">
                                            <input type="text" class="form-control m3col7"  name="sNMWSfindPathCapacity" min="0" max="100" step="0.1" value="${edit3.col7}" required />
                                        </div>
                                    </div>
									<div class="form-group has-success col-xs-6">
                                         <label class="col-xs-6 control-label" for="inputSuccess">WS get NNICapacity From SNM</label>
                                        <div class="col-xs-6" style="padding-top: 24px;">
                                            <input type="text" class="form-control m3col8"  name="sNMWSgetNNICapacityFromSNM" min="0" max="100" step="0.1" value="${edit3.col8}" required />
                                        </div>
                                    </div>
                                       
                                     </div>
                      
                                    </div>
                       <c:remove var="edit3"  scope="session"/>
                    </div>
                    <div class="modal-footer">
                         <button type="button" class="btn btn-default" data-dismiss="modal" >Close</button>
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </div>
                </form>
                </div>
            </div>
        </div>
        <div id="myModal4" class="modal fade" style="width: 1163px !important;">
            <div class="modal-dialog" style="width: 1159px !important;">
                <div class="modal-content">
                     <form class="form-horizontal" action="IpsmController" method="post" >
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title">Transaction Form</h4>
                    </div>
                    <div class="modal-body col-md-12">
                        
                       
                            <input class="form-control m4id" id="dbId4" type="hidden" name="id" value="${edit4.id}"/>
                            <!--<input type="hidden" name="name" id="appId1" value="<%=name1%>" placeholder="application name" />-->
                            <div class="row col-xs-12"> 
                                <div class="row">
                                <div class="form-group has-warning col-xs-4">
                                        <label class="col-xs-4 control-label" for="inputSuccess">Application Name</label>
                                        <div class="col-xs-8" style="padding-top: 24px;">
                                            <input type="text"  class="form-control" name="name" id="appName4" value="${edit4.name}"/>
                                        </div>
                                    </div>
                                    <div class="form-group has-warning col-xs-4">
                                        <label class="col-xs-4 control-label" for="inputSuccess">Rel.Month</label>
                                        <div class="col-xs-8" style="padding-top: 24px;">
                                            <input type="month" class="form-control m4month"  name="month" value="${edit4.month}" />
                                        </div>
                                    </div>
                                         <div class="form-group has-warning col-xs-4">
                                        <label class="col-xs-4 control-label" for="inputSuccess">Date</label>
                                        <div class="col-xs-8" style="padding-top: 24px;">
                                            <input type="date" class="form-control m4date"  name="date" value="${edit4.date}"/>
                                        </div>
                                    </div>
                                </div>
                                          
                                 <label style="margin-left: 440px;font-size: 15px;font-weight: 800;color: #0f3352;" class="control-label has-error" for="inputError">Transactions & Response Time</label>   
<!--                            <div class="form-group has-error" style="margin-bottom: -20px;">
                                <label class="col-xs-6 control-label" for="inputError">Transaction Name</label>
                                <div class="col-xs-6">       
                                    <label class="control-label" for="inputError">Average Response Time</label>
                                </div>
                            </div>-->
                                     <br>
                                     <div class="row">
                                         <div class="form-group has-success col-xs-6">
                                         <label class="col-xs-6 control-label" for="inputSuccess">SITE Level Search-Select Cloudservices Click Search</label>
                                        <div class="col-xs-6" style="padding-top: 24px;">
                                            <input type="text" class="form-control m4col1"  name="iPSMSITESelectCloudservicesClickSearch" min="0" max="100" step="0.1" value="${edit4.col1}" required />
                                        </div>
                                    </div>
                                        <div class="form-group has-success col-xs-6">
                                          <label class="col-xs-6 control-label" for="inputSuccess">SITE Level Search-Search Site Partname</label>
                                        <div class="col-xs-6" style="padding-top: 24px;">
                                            <input type="text" class="form-control m4col2"   name="iPSMSITESearchSitePartname"  min="0" max="100" step="0.1" value="${edit4.col2}" required/>
                                        </div>
                                    </div>
                                     </div>
                                         <div class="row">
                                         <div class="form-group has-success col-xs-6">
                                         <label class="col-xs-6 control-label" for="inputSuccess">SITE Level Search-Search Circuit Id </label>
                                        <div class="col-xs-6" style="padding-top: 24px;">
                                            <input type="text" class="form-control m4col3"  name="iPSMSITESearchCircuitid" min="0" max="100" step="0.1" value="${edit4.col3}" required />
                                        </div>
                                    </div>
                                        <div class="form-group has-success col-xs-6">
                                          <label class="col-xs-6 control-label" for="inputSuccess">VPN Level Search-Select Cloudservices Click Search</label>
                                        <div class="col-xs-6" style="padding-top: 24px;">
                                            <input type="text" class="form-control m4col4"  name="iPSMVPNSelectCloudservicesClickSearch" min="0" max="100" step="0.1" value="${edit4.col4}"required/>
                                        </div>
                                    </div>
                                     </div>
                                         <div class="row">
                                         <div class="form-group has-success col-xs-6">
                                         <label class="col-xs-6 control-label" for="inputSuccess">WS UpdateSiteinfo Invoke</label>
                                        <div class="col-xs-6" style="padding-top: 24px;">
                                            <input type="text" class="form-control m4col5"   name="iPSMWSUpdateSiteInfoInvoke" min="0" max="100" step="0.1" value="${edit4.col5}" required />
                                        </div>
                                    </div>
                                        
                                     </div>
                                       <c:remove var="edit4"  scope="session"/>   
                      
                                    </div>
                      
                    </div>
                    <div class="modal-footer">
                          <button type="button" class="btn btn-default" data-dismiss="modal" >Close</button>
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </div>
                </form>
                </div>
            </div>
        </div>
                                    
            <% if(ID != 0) { System.out.print("ID is :"+ID);%>          
                <div id="main" >
                    <input id="dbId" type="hidden" name="id" value="<%=ID%>"/>		                   
                </div> 
            </div>
                                        <% } %>
            </div> 
          </div>
        </div>
</div>
	  
	    <!-- End section -->
<div class="section contact dark-image" id="section4">
        <div class="container">
          <div class="common-container contact-container">
            

            <div class="row">
              <div class="col-md-10 col-md-offset-1" style="padding-top:50px;margin-left: 2.333333%;">

                <div class="about-section section-title title">
                 <div class="widget blank no-padding">
								<div class="panel panel-default work-progress-table" >
									  <!-- Default panel contents -->
									<div class="panel-heading">DB Table1</i>
										
									</div>
									  <!-- Table -->
									<!--<table id="mytable" class="table" >-->
                            <table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%">                                   
										<thead>
										  <tr>
											
					<!--<th>Id</th>-->				
                                        <th style="width:7%">Rel.Month</th>
                                        <th style="width:12%">Test Date</th>
					<th style="width:14%">Transaction Name</th>
                                        <th style="width:10%">Action</th>
										  </tr>
										</thead>
										<tbody> 
                                                       
                                            <%
                int id;
                String date;
                String month;
                String name;
                String col1;
                String col2;
                String col3;
                String col4;
                String col5;
                String col6;
                String col7;
                String col8;
                String col9;
                String col10;
                String col11;
                String col12;
                String col13;
                String col14;
                String col15;
                String col16;              
                               
             Dao dao=new Dao();
                List list=dao.display();
                if(list!=null){
                    Iterator itr=list.iterator();
                    while(itr.hasNext()){
                        Bgw d=(Bgw)itr.next();
                        id=d.getId();
                        date=d.getDate();
                        month=d.getMonth();
                        name=d.getName();
                        col1=d.getBGWOpenEquipmentPage();
                        col2=d.getBGWOpenAddAislePage();
                        col3=d.getBGWLoadRackDetails();
                        col4=d.getBGWPathSelectPath();
                        col5=d.getBGWPathOpenCircuitIdDetails();
                        col6=d.getBGWPathOpenCircuitViewPage();
                        col7=d.getBGWPathOpenPrintViewPage();
                        col8=d.getBGWPathOpenCircuitPremisesPage();
                        col9=d.getBGWPathClickModify();
                        col10=d.getBGWSiteOpenAddNewSitePage();
                        col11=d.getBGWViewOrderOpenViewOrderPage();
                        col12=d.getBGWViewOrderOpenDetailsPage();
                        col13=d.getBGWViewOrderOpenAuditsTab();
                        col14=d.getBGWViewOrderOpenInterfaceActivityTab();
                        col15=d.getBGWSearchTaskRecord();
                        col16=d.getBGWSearchTaskOpenTaskDetailPage();         
                                             
                                   %>
            <tr>
<!--            <td><%=id%></td>-->
                <td><%=month%></td>  
                <td><%=date%></td>                  
                <td><%=name%></td>   
               
                <td><a href="BgwController?id=<%=id%>&action=edit#3thPage">Edit</a>|<a href="BgwController?id=<%=id%>&action=delete">Delete</a></td> 
                
            </tr>
            <%
                }
                }
%>
										  
										</tbody>
									</table>
								</div>

							</div>
				</div>

              </div>
            </div>

<div class="row">
              <div class="col-md-10 col-md-offset-1" style="padding-top:50px;margin-left: 2.333333%;">

                <div class="about-section section-title title">
                 <div class="widget blank no-padding">
								<div class="panel panel-default work-progress-table" >
									  <!-- Default panel contents -->
									<div class="panel-heading">DB Table2</i>
										
									</div>
									  <!-- Table -->
									<!--<table id="mytable" class="table" >-->
                            <table id="example1" class="table table-striped table-bordered" cellspacing="0" width="100%">                                   
										<thead>
										  <tr>
											
					<!--<th>Id</th>-->				
                                        <th style="width:7%">Rel.Month</th>
                                        <th style="width:12%">Test Date</th>
					<th style="width:14%">Transaction Name</th>
                                        <th style="width:10%">Action</th>
										  </tr>
										</thead>
										<tbody> 
                                                       
                                            <%
                int id2;
                String date2;
                String month2;
                String name2;
             IpsmDao v=new IpsmDao();
                List list1=v.displayIpsm();
                if(list1!=null){
                    Iterator itr=list1.iterator();
                    while(itr.hasNext()){
                        Ipsm d=(Ipsm)itr.next();
                        id2=d.getId();
                        date2=d.getDate();
                        month2=d.getMonth();
                        name2=d.getName();
                        
                                             
                                   %>
            <tr>
<!--            <td><%=id2%></td>-->
                <td><%=month2%></td>  
                <td><%=date2%></td>                  
                <td><%=name2%></td>   
               
                <td><a href="#">Edit</a>|<a href="#">Delete</a></td> 
                
            </tr>
            <%
                }
                }
%>
										  
										</tbody>
									</table>
								</div>

							</div>
				</div>

              </div>
            </div>

<div class="row">
              <div class="col-md-10 col-md-offset-1" style="padding-top:50px;margin-left: 2.333333%;">

                <div class="about-section section-title title">
                 <div class="widget blank no-padding">
								<div class="panel panel-default work-progress-table" >
									  <!-- Default panel contents -->
									<div class="panel-heading">DB Table3</i>
										
									</div>
									  <!-- Table -->
									<!--<table id="mytable" class="table" >-->
                            <table id="example2" class="table table-striped table-bordered" cellspacing="0" width="100%">                                   
										<thead>
										  <tr>
											
					<!--<th>Id</th>-->				
                                        <th style="width:7%">Rel.Month</th>
                                        <th style="width:12%">Test Date</th>
					<th style="width:14%">Transaction Name</th>
                                        <th style="width:10%">Action</th>
										  </tr>
										</thead>
										<tbody> 
                                                       
                                            <%
                int id3;
                String date3;
                String month3;
                String name3;
             SnmDao s=new SnmDao();
                List list3=s.displaySnm();
                if(list3!=null){
                    Iterator itr=list3.iterator();
                    while(itr.hasNext()){
                        Snm d=(Snm)itr.next();
                        id3=d.getId();
                        date3=d.getDate();
                        month3=d.getMonth();
                        name3=d.getName();
                        
                                             
                                   %>
            <tr>
<!--            <td><%=id3%></td>-->
                <td><%=month3%></td>  
                <td><%=date3%></td>                  
                <td><%=name3%></td>   
               
                <td><a href="#">Edit</a>|<a href="#">Delete</a></td> 
                
            </tr>
            <%
                }
                }
%>
										  
										</tbody>
									</table>
								</div>

							</div>
				</div>

              </div>
            </div>

<div class="row">
              <div class="col-md-10 col-md-offset-1" style="padding-top:50px;margin-left: 2.333333%;">

                <div class="about-section section-title title">
                 <div class="widget blank no-padding">
								<div class="panel panel-default work-progress-table" >
									  <!-- Default panel contents -->
									<div class="panel-heading">DB Table4</i>
										
									</div>
									  <!-- Table -->
									<!--<table id="mytable" class="table" >-->
                            <table id="example3" class="table table-striped table-bordered" cellspacing="0" width="100%">                                   
										<thead>
										  <tr>
											
					<!--<th>Id</th>-->				
                                        <th style="width:7%">Rel.Month</th>
                                        <th style="width:12%">Test Date</th>
					<th style="width:14%">Transaction Name</th>
                                        <th style="width:10%">Action</th>
										  </tr>
										</thead>
										<tbody> 
                                                       
                                            <%
                int id4;
                String date4;
                String month4;
                String name4;
             VddsDao i=new VddsDao();
                List list4=i.displayVdds();
                if(list4!=null){
                    Iterator itr=list4.iterator();
                    while(itr.hasNext()){
                        Vdds d=(Vdds)itr.next();
                        id4=d.getId();
                        date4=d.getDate();
                        month4=d.getMonth();
                        name4=d.getName();
                        
                                             
                                   %>
            <tr>
<!--            <td><%=id4%></td>-->
                <td><%=month4%></td>  
                <td><%=date4%></td>                  
                <td><%=name4%></td>   
               
                <td><a href="#">Edit</a>|<a href="#">Delete</a></td> 
                
            </tr>
            <%
                }
                }
%>
										  
										</tbody>
									</table>
								</div>

							</div>
				</div>

              </div>
            </div>
          </div><!-- End common-container -->
        </div><!-- End container -->
      </div><!-- End section -->

     

    </div><!-- End Fullpage -->


    <footer class="footer onstart animated dark-copyright" data-animation="fadeInUp" data-animation-delay="800">
    </footer>

    <!-- js placed at the end of the document so the pages load faster -->
    
    <!-- jquery.counterup.min.js -->
    <script type="text/javascript" src="Accets/js/jquery.waypoints.js"></script>
    <script type="text/javascript" src="Accets/js/jquery.counterup.min.js"></script>

    <!-- Background -->
    <script type="text/javascript" src="Accets/js/jquery.backstretch.min.js"></script>

    <!-- Jquery.ajaxchimp -->
    <script type="text/javascript" src="Accets/js/jquery.ajaxchimp.js"></script>

    <!-- easypiechart.js -->
    <script type="text/javascript" src="Accets/js/easypiechart.js"></script>

    <!-- headline -->
    <script type="text/javascript" src="Accets/js/animated-headline.js"></script>

    <!-- jquery.easings.min.js -->
    <script type="text/javascript" src="Accets/js/jquery.easings.min.js"></script>

    <!-- Jquery.fullPage.js -->
    <script type="text/javascript" src="Accets/js/jquery.fullPage.js"></script>

    <!-- TimeCircles.js -->
    <script type="text/javascript" src="Accets/js/TimeCircles.js"></script>

    <!-- parsley - form validation -->
    <script type="text/javascript" src="Accets/js/parsley.min.js"></script>

    <!-- custom script -->
    <script type="text/javascript" src="Accets/js/custom.js"></script>
     <script src="Accets/validator.js"></script>
        <script src="Accets/contact.js"></script>
        <!--<script src="assets/jquery/jquery-3.1.0.min.js"></script>-->
		<script src="assets/tether/tether.min.js"></script>
		<script src="assets/bootstrap/bootstrap4-alpha3.min.js"></script>
		<!--<script src="http://canvasjs.com/assets/script/canvasjs.min.js"></script>-->
                  <script src="Accets1/js/canvasjs.min.js"></script>
	<script>
			$(function () {
				var totalRevenue = 15341110;
				
				
				var productsRevenuePieChart = new CanvasJS.Chart("products-revenue-pie-chart", {
					animationEnabled: true,
					theme: "theme2",
					legend: {
						fontSize: 1
					},
					toolTip: {
						borderThickness: 0,
						content: "<span style='\"'color: {color};'\"'>{name}</span>: ${y} (#percent%)",
						cornerRadius: 0
					},
					data: [
						{       
							indexLabelFontColor: "#676464",
							indexLabelFontSize: 14,
							legendMarkerType: "square",
							legendText: "{indexLabel}",
							showInLegend: true,
							startAngle:  90,
							type: "pie",
							dataPoints: [
								{  y: 6289855, name:"BGW", indexLabel: "BGW - 41%", legendText: "BGW", exploded: true },
								{  y: 2761400, name:"VDDS", indexLabel: "VDDS - 18%", legendText: "VDDS" },
								{  y: 3681866, name:"SNM", indexLabel: "SNM - 24%", legendText: "SNM", color: "#8064a1" },
								{  y: 2607989, name:"IPSM", indexLabel: "IPSM - 17%", legendText: "IPSM" }
							]
						}
					]
				});
				
				productsRevenuePieChart.render();
				
			});
		</script>
    <script>
        $(document).ready(function() {
    var dataTable = $('#example').dataTable({
 "aaSorting": [[ 1, "asc" ]],
//"sDom": '<"support-table-header">',
// ^^^ this is wrong ^^^
"bDestroy" : true,
"bAutoWidth" : true,
"sScrollY" : "450",
"sScrollX" : "100%",
"bScrollCollapse" : true,
"bSort" : true,
"sPaginationType" : "full_numbers",
"iDisplayLength" : 5,
"bLengthChange" : true
    });
    
});
        
    </script>
		<script type="text/javascript">
			$(function(){
			    $(".showpassword").each(function(index,input) {
			        var $input = $(input);
			        $("<p class='opt'/>").append(
			            $("<input type='checkbox' class='showpasswordcheckbox' id='showPassword' />").click(function() {
			                var change = $(this).is(":checked") ? "text" : "password";
			                var rep = $("<input placeholder='Password' type='" + change + "' />")
			                    .attr("id", $input.attr("id"))
			                    .attr("name", $input.attr("name"))
			                    .attr('class', $input.attr('class'))
			                    .val($input.val())
			                    .insertBefore($input);
			                $input.remove();
			                $input = rep;
			             })
			        ).append($("<label for='showPassword'/>").text("Show password")).insertAfter($input.parent());
			    });

			    $('#showPassword').click(function(){
					if($("#showPassword").is(":checked")) {
						$('.icon-lock').addClass('icon-unlock');
						$('.icon-unlock').removeClass('icon-lock');    
					} else {
						$('.icon-unlock').addClass('icon-lock');
						$('.icon-lock').removeClass('icon-unlock');
					}
			    });
			});
		</script>

       <script>
           // This code is to edit table
           $(document).ready(function(){
               
               
               var path1 = $("#dbId1").val().replace(/C:\\fakepath\\/i, '');
               var path2 = $("#dbId2").val().replace(/C:\\fakepath\\/i, '');
               var path3 = $("#dbId3").val().replace(/C:\\fakepath\\/i, '');
               var path4 = $("#dbId4").val().replace(/C:\\fakepath\\/i, '');
               
               
          
             if (path1 != 0) { 
//                alert("ID is there!!");
//                $("#hideMenu").hide();
                 $("#myModal2").modal('hide');
                 $("#myModal3").modal('hide');
                 $("#myModal4").modal('hide');
                $('#myModal1').modal();
               
//                $("#main2").show();
//                $("#main3").show();
            }
               if (path2 != 0) { 
//                $("#hideMenu").hide();
                 $("#myModal1").modal('hide');
                 $("#myModal3").modal('hide');
                 $("#myModal4").modal('hide');
                $('#myModal2').modal();
            }
              if (path3 != 0) { 
//                $("#hideMenu").hide();
                 $("#myModal1").modal('hide');
                 $("#myModal2").modal('hide');
                 $("#myModal4").modal('hide');
                $('#myModal3').modal();
            }
              if (path4 != 0) { 
//                $("#hideMenu").hide();
                 $("#myModal1").modal('hide');
                 $("#myModal2").modal('hide');
                 $("#myModal3").modal('hide');
                $('#myModal4').modal();
            }
            
             $('.btnClose').click(function(){
                $('#myModal1').modal('hide');
            });
            $('.btnClose3').click(function(){
                $('#myModal3').modal('hide');
            });
         });
           
       </script>
       
		
    	
  </body>
</html>
