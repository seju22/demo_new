<%@page import="com.test.dao.VddsDao"%>
<%@page import="com.test.dao.SnmDao"%>
<%@page import="com.test.dao.IpsmDao"%>
<%@page import="com.test.dao.Dao"%>
<%@page import="com.test.bean.Bgw"%>
<%@page import="com.test.bean.Vdds"%>
<%@page import="com.test.bean.Snm"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.test.bean.Ipsm"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
        <link rel="stylesheet" type="text/css" href="//cdn.rawgit.com/davidstutz/bootstrap-multiselect/master/dist/css/bootstrap-multiselect.css">
    
        <style>
            .ui-datepicker-calendar {
                display: none;
                }
        </style>
    
      <script type="text/javascript" src="//cdn.rawgit.com/davidstutz/bootstrap-multiselect/master/dist/js/bootstrap-multiselect.js"></script>
      
    
    <script>
        $(document).ready(function() {
        $('#example').DataTable();
        $('#example2').DataTable();
        $('#example3').DataTable();
        $('#example1').DataTable();
        });
    </script>
    
 
  
    <!--            graph      -->
    	<!--<link rel="stylesheet" href="assets/bootstrap/bootstrap4-alpha3.min.css">-->
    
 
  </head>
    
     <body class="image-background" bg-image="images/bg6.jpg">
    


    <header class="header">
      <nav class="navbar navbar-custom" style="float:left !important">
        <div class="container-fluid">
        
          <!-- Collect the nav links, forms, and other content for toggling -->
<!--          <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav navbar-right dark-nav" id="menu">
              <li class="active" data-menuanchor="1stPage"><a href="#1stPage" class="active">Performance Engineering</a></li>
               <li data-menuanchor="2ndPage">
			 <a href="index1.jsp">Home</a> 
			  </li>
           
            </ul>
          </div>-->
        </div>
      </nav>
    </header>

    <div id="fullpage">
     
     
      <div class="section " id="section2">
        <div class="container">
          <div class="">
            <div class="row" style="margin-top: -200px;">
              <div class="col-md-10 col-md-offset-1">

               
		<div class="container">
                    <div class="row">
                    <form action="Graphcontroller" method="post">
                    <div class="col-md-2">	
                       <label for="name">App Name</label> 
                    <select class="form-control " id="AppName"  name="gName">
                        <option value="" disabled selected>Choose</option>
                        <option value="BGW">BGW</option>
                        <option value="VDDS">VDDS</option>
                        <option value="SNM" >SNM</option>
                        <option value="IPSM">IPSM</option>
                    </select>
                    </div>
                     <div class="col-md-2">
                          <label for="name">Rel Month</label> 
                           <!--<input class="form-control" type="month" name="gMonth" />-->
                              <input class="form-control" type="text" name="gMonth" class="relMonth" id="datepicker"/>  
                    </div>
                   
                    <div class="col-md-2">
                          <label for="name">Select Date</label> 
                          <select class="form-control " id="dateValues" multiple="multiple" name="gDays" required="">
                                <option value="" disabled=""  >Choose</option>
                                
                            
                        

                            </select>
                    </div>
                    <div class="col-md-2" style="margin-top: 29px;">
                        <label for="name"> &nbsp&nbsp&nbsp&nbsp&nbsp</label> 
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </div>
                        
                    </form>
                    </div>
                    <div class="row">
                   <% List snm = (List) request.getAttribute("snmList"); 
                   String snmMonth=(String)request.getAttribute("snmMonth");
                   String str="";
                   String str1="";
                   String str2="";
                   String str3="";
                   String str4="";
                   String str5="";
                   String str6="";
                   
                   String date="";
                   
                   
                   int len=0;
                   if(snm!=null){
                    len= snm.size();
                   int count=31-len;
                    Iterator itr=snm.iterator();
                    
                    while(itr.hasNext()){
                        Snm s1=(Snm)itr.next();
                        if(str.isEmpty()){
                              str="'Search Trunk',"+s1.getSNMAdvancedTrunkSearchSearchTrunks();
                              str1="'Find Ports Field',"+s1.getSNMCircuitAssignProvisionFindPortsField();
                              str2="'Provision Assign',"+s1.getSNMCircuitAssignProvisionAssign();
                              str3="'Modify Query',"+s1.getSNMCircuitViewModifyQuery();
                              str4="'Circuit Capacity',"+s1.getSNMWSfindAccessCicuitCapacityAtMultipleSites();
                              str5="'Path Capacity',"+s1.getSNMWSfindPathCapacity();
                              str6="'NNI Capacity',"+s1.getSNMWSgetNNICapacityFromSNM();
                              date="'"+s1.getReldate()+"'";
                              
                              
                            }
                          else{
                              str=str+","+s1.getSNMAdvancedTrunkSearchSearchTrunks();
                              str1=str1+","+s1.getSNMCircuitAssignProvisionFindPortsField();
                              str2=str2+","+s1.getSNMCircuitAssignProvisionAssign();
                              str3=str3+","+s1.getSNMCircuitViewModifyQuery();
                              str4=str4+","+s1.getSNMWSfindAccessCicuitCapacityAtMultipleSites();
                              str5=str5+","+s1.getSNMWSfindPathCapacity();
                              str6=str6+","+s1.getSNMWSgetNNICapacityFromSNM();
                              date=date+","+"'"+s1.getReldate()+"'";
                          }   
                         
                    }
                  %>
                 <div id="chart_div" style="width: 1000px; height: 500px;"></div>
                        <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>	
                           <script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawVisualization);


      function drawVisualization() {
        // Some raw data (not necessarily accurate)
        var data = google.visualization.arrayToDataTable([
         ['Month', <%=date%>],
         [<%=str6%>],
         [<%=str5%>],
         [<%=str4%>],
         [<%=str3%>],
         [<%=str2%>],
         [<%=str1%>],
         [<%=str%>],
      ]);

    var options = {
      title : 'Performance Engineering',
      vAxis: {title: 'Average Responce Time '},
      hAxis: { direction:-1, slantedText:true, slantedTextAngle:30 },
      seriesType: 'bars',
      series: {5: {type: 'line'}}
    };

    var chart = new google.visualization.ComboChart(document.getElementById('chart_div'));
    chart.draw(data, options);
  }
    </script>
                   <%}
                   else{
                       
                   }
                  
                   %>
                   
                   <!---------BGW-------->
                   <% List bgw = (List) request.getAttribute("bgwList"); 
                   //String snmMonth=(String)request.getAttribute("snmMonth");
                   
                   String str1BGW="";
                   String str2BGW="";
                   String str3BGW="";
                   String str4BGW="";
                   String str5BGW="";
                   String str6BGW="";
                    String str7BGW="";
                     String str8BGW="";
                      String str9BGW="";
                       String str10BGW="";
                        String str11BGW="";
                         String str12BGW="";
                          String str13BGW="";
                       String str14BGW="";
                       String str15BGW="";
                       String str16BGW="";
                       String str17BGW="";
                       String str18BGW="";
                   
                   String dateBGW="";
                   
                    
                   
                   //int len=0;
                   if(bgw!=null){
                    //len= snm.size();
                   //int count=31-len;
                    Iterator itr2=bgw.iterator();
                    
                    while(itr2.hasNext()){
                        Bgw b1=(Bgw)itr2.next();
                        
                        if(str1BGW.isEmpty()){
                                        str1BGW="'Open Equipment',"+b1.getBGWOpenEquipmentPage();
                                        str2BGW="'Add Aisle',"+b1.getBGWOpenAddAislePage();
                                        str3BGW="'Rack Details',"+b1.getBGWLoadRackDetails();
                                        str4BGW="'Select Path',"+b1.getBGWPathSelectPath();
                                        str5BGW="'CircuitID',"+b1.getBGWPathOpenCircuitIdDetails();
                                        str6BGW="'CircuitViewPage',"+b1.getBGWPathOpenCircuitViewPage();
                                        str7BGW="'PrintViewPage',"+b1.getBGWPathOpenPrintViewPage();
                                        str8BGW="'PremisesPage',"+b1.getBGWPathOpenCircuitPremisesPage();
                                        str9BGW="'ClickModify',"+b1.getBGWPathClickModify();
                                        str10BGW="'AddNewSite',"+b1.getBGWSiteOpenAddNewSitePage();
                                        str11BGW="'OpenViewOrder',"+b1.getBGWViewOrderOpenViewOrderPage();
                                        str12BGW="'OpenOrderDetail',"+b1.getBGWViewOrderOpenDetailsPage();
                                        str13BGW="'OpenAudits',"+b1.getBGWViewOrderOpenAuditsTab();
                                        str14BGW="'InterfaceActivity',"+b1.getBGWViewOrderOpenInterfaceActivityTab();
                                        str15BGW="'TaskRecord',"+b1.getBGWSearchTaskRecord();
                                        str16BGW="'TaskDetail',"+b1.getBGWSearchTaskOpenTaskDetailPage();
                                        str17BGW="'SNC Info',"+b1.getbGWSearchViewOrderOpenSncCcInfo();
                                        str18BGW="'CirCuitHyperlink',"+b1.getbGWSearchViewOrderClickCircuitIdHyperlink();
                                        dateBGW="'"+b1.getReldate()+"'";
                              
                              
                            }
                          else{
                                    str1BGW=str1BGW+","+b1.getBGWOpenEquipmentPage();
                                    str2BGW=str2BGW+","+b1.getBGWOpenAddAislePage();
                                    str3BGW=str3BGW+","+b1.getBGWLoadRackDetails();
                                    str4BGW=str4BGW+","+b1.getBGWPathSelectPath();
                                    str5BGW=str5BGW+","+b1.getBGWPathOpenCircuitIdDetails();
                                    str6BGW=str6BGW+","+b1.getBGWPathOpenCircuitViewPage();
                                    str7BGW=str7BGW+","+b1.getBGWPathOpenPrintViewPage();
                                    str8BGW=str8BGW+","+b1.getBGWPathOpenCircuitPremisesPage();
                                    str9BGW=str9BGW+","+b1.getBGWPathClickModify();
                                    str10BGW=str10BGW+","+b1.getBGWSiteOpenAddNewSitePage();
                                    str11BGW=str11BGW+","+b1.getBGWViewOrderOpenViewOrderPage();
                                    str12BGW=str12BGW+","+b1.getBGWViewOrderOpenDetailsPage();
                                    str13BGW=str13BGW+","+b1.getBGWViewOrderOpenAuditsTab();
                                    str14BGW=str14BGW+","+b1.getBGWViewOrderOpenInterfaceActivityTab();
                                    str15BGW=str15BGW+","+b1.getBGWSearchTaskRecord();
                                    str16BGW=str16BGW+","+b1.getBGWSearchTaskOpenTaskDetailPage();
                                    str17BGW=str17BGW+","+b1.getbGWSearchViewOrderOpenSncCcInfo();
                                    str18BGW=str18BGW+","+b1.getbGWSearchViewOrderClickCircuitIdHyperlink();
                                    dateBGW=dateBGW+",'"+b1.getReldate()+"'";
                          }   
                         
                    }
                  %>
                 <div id="chart_div" style="width: 1000px; height: 500px;"></div>
                        <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>	
                           <script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawVisualization);


      function drawVisualization() {
        // Some raw data (not necessarily accurate)
        var data = google.visualization.arrayToDataTable([
         ['Month', <%=dateBGW%>],
         [<%=str1BGW%>],
         [<%=str2BGW%>],
         [<%=str3BGW%>],
         [<%=str4BGW%>],
         [<%=str5BGW%>],
         [<%=str6BGW%>],
         [<%=str7BGW%>],
         [<%=str8BGW%>],
         [<%=str9BGW%>],
         [<%=str10BGW%>],
         [<%=str11BGW%>],
         [<%=str12BGW%>],
         [<%=str13BGW%>],
         [<%=str14BGW%>],
         [<%=str15BGW%>],
         [<%=str16BGW%>],
         [<%=str17BGW%>],
         [<%=str18BGW%>]
 
      ]);

    var options = {
      title : 'Performance Engineering',
      vAxis: {title: 'Average Responce Time '},
      hAxis: { title: 'Sec', direction:-1, slantedText:true, slantedTextAngle:30 },
      seriesType: 'bars',
      series: {5: {type: 'line'}}
    };

    var chart = new google.visualization.ComboChart(document.getElementById('chart_div'));
    chart.draw(data, options);
  }
    </script>
                   <%}
                   else{
                       
                   }
                  
                   %>
                   
                   <!-----------------IPSM----------------------->
                   <% List ipsm = (List) request.getAttribute("ipsmList"); 
                   //String snmMonth=(String)request.getAttribute("snmMonth");
                   System.out.print("Sivaraj :"+ipsm);
                   String str1IPSM="";
                   String str2IPSM="";
                   String str3IPSM="";
                   String str4IPSM="";
                   String str5IPSM="";
                   
                   
                   String dateIPSM="";
                   
                   
                   //int len=0;
                   if(ipsm!=null){
                       //System.out.print("Sivaraj :"+ipsm.size()); 
                    //len= snm.size();
                   //int count=31-len;
                    Iterator itr3=ipsm.iterator();
                    
                    while(itr3.hasNext()){
                        Ipsm i=(Ipsm)itr3.next();
                        if(str1IPSM.isEmpty()){
                              
                              str1IPSM="'Cloud Service',"+i.getIPSMSITESelectCloudservicesClickSearch();
                              str2IPSM="'Part Name',"+i.getIPSMSITESearchSitePartname();
                              str3IPSM="'Circuit ID',"+i.getIPSMSITESearchCircuitid();
                              str4IPSM="'Click Search',"+i.getIPSMVPNSelectCloudservicesClickSearch();
                              str5IPSM="'Ubdate Site Info',"+i.getIPSMWSUpdateSiteInfoInvoke();
                             
                              dateIPSM="'"+i.getReldate()+"'";
                              
                              
                            }
                          else{
                            
                              str1IPSM=str1IPSM+","+i.getIPSMSITESelectCloudservicesClickSearch();
                              str2IPSM=str2IPSM+","+i.getIPSMSITESearchSitePartname();
                              str3IPSM=str3IPSM+","+i.getIPSMSITESearchCircuitid();
                              str4IPSM=str4IPSM+","+i.getIPSMVPNSelectCloudservicesClickSearch();
                              str5IPSM=str5IPSM+","+i.getIPSMWSUpdateSiteInfoInvoke();
                              
                           
                              dateIPSM=dateIPSM+","+"'"+i.getReldate()+"'";
                          }   
                         
                    }
                  %>
                 <div id="chart_div" style="width: 1000px; height: 500px;"></div>
                        <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>	
                           <script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawVisualization);


      function drawVisualization() {
        // Some raw data (not necessarily accurate)
        var data = google.visualization.arrayToDataTable([
         ['Month', <%=dateIPSM%>],
         [<%=str1IPSM%>],
         [<%=str2IPSM%>],
         [<%=str3IPSM%>],
         [<%=str4IPSM%>],
         [<%=str5IPSM%>],
      ]);

    var options = {
      title : 'Performance Engineering',
      vAxis: {title: 'Average Responce Time '},
      hAxis: { direction:-1, slantedText:true, slantedTextAngle:30 },
      seriesType: 'bars',
      series: {5: {type: 'line'}}
    };

    var chart = new google.visualization.ComboChart(document.getElementById('chart_div'));
    chart.draw(data, options);
  }
    </script>
                   <%}
                   else{
                       
                   }
                  
                   %>
                   
                   
                   <!-------------------VDDS------------------------->
                   <% List vdds = (List) request.getAttribute("vddsList"); 
                   //String snmMonth=(String)request.getAttribute("snmMonth");
                  
                   String str1VDDS="";
                   String str2VDDS="";
                   String str3VDDS="";
                   String str4VDDS="";
                   String str5VDDS="";
                   String str6VDDS="";
                   
                   String dateVDDS="";
                   
                   
                   //int len=0;
                   if(vdds!=null){
                       //System.out.print("Sivaraj :"+ipsm.size()); 
                    //len= snm.size();
                   //int count=31-len;
                    Iterator itr3=vdds.iterator();
                    
                    while(itr3.hasNext()){
                        Vdds v=(Vdds)itr3.next();
                        if(str1VDDS.isEmpty()){
                              
                              str1VDDS="'Search Circuit',"+v.getVDDSCircuitSearchCircuit();
                              str2VDDS="'Work Order',"+v.getVDDSWorkOrderSearchWorkOrder();
                              str3VDDS="'Change Info',"+v.getVDDSWSGetPVCChangeinfo();
                              str4VDDS="'PVCS IPSM',"+v.getVDDSWSGetCircuitAndPvcsIPSM();
                              str6VDDS="'TDM Work Order',"+v.getVDDSTDMOrderProvisioningSearchWorkOrder();
                              str5VDDS="'Submit Approve',"+v.getVDDSTDMOrderApprove();
                             
                              dateVDDS="'"+v.getReldate()+"'";
                              
                              
                            }
                          else{
                            
                              str1VDDS=str1VDDS+","+v.getVDDSCircuitSearchCircuit();
                              str2VDDS=str2VDDS+","+v.getVDDSWorkOrderSearchWorkOrder();
                              str3VDDS=str3VDDS+","+v.getVDDSWSGetPVCChangeinfo();
                              str4VDDS=str4VDDS+","+v.getVDDSWSGetCircuitAndPvcsIPSM();
                              str6VDDS=str6VDDS+","+v.getVDDSTDMOrderProvisioningSearchWorkOrder();
                              str5VDDS=str5VDDS+","+v.getVDDSTDMOrderApprove();
                              
                             
                              
                           
                              dateVDDS=dateVDDS+","+"'"+v.getReldate()+"'";
                          }   
                         
                    }
                  %>
                 <div id="chart_div" style="width: 1000px; height: 500px;"></div>
                        <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>	
                           <script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawVisualization);


      function drawVisualization() {
        // Some raw data (not necessarily accurate)
        var data = google.visualization.arrayToDataTable([
         ['Month', <%=dateVDDS%>],
         [<%=str1VDDS%>],
         [<%=str2VDDS%>],
         [<%=str3VDDS%>],
         [<%=str4VDDS%>],
         [<%=str5VDDS%>],
         [<%=str6VDDS%>],
      ]);

    var options = {
      title : 'Performance Engineering',
      vAxis: {title: 'Average Responce Time '},
      hAxis: { direction:-1, slantedText:true, slantedTextAngle:30 },
      seriesType: 'bars',
      series: {5: {type: 'line'}}
    };

    var chart = new google.visualization.ComboChart(document.getElementById('chart_div'));
    chart.draw(data, options);
  }
    </script>
                   <%}
                   else{
                       
                   }
                  
                   %>
                        

                  </div>
		</div> <!-- container -->

              </div><!-- End col -->
            </div><!-- End row -->

          </div>
        </div>
      
</div>
</div>
	    <!-- End section -->
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
    
    
    <!----date picker--->
     <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
   <link rel="stylesheet" href="/resources/demos/style.css">
  <!--<script src="https://code.jquery.com/jquery-1.12.4.js"></script>-->
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
      $(document).ready(function(){ 
      $('#datepicker').datepicker({
        changeMonth: true,
        changeYear: true,
        showButtonPanel: true,
        dateFormat: 'mm-yy',
        onClose: function(dateText, inst) { 
           
            $(this).datepicker('setDate', new Date(inst.selectedYear, inst.selectedMonth, 1));
              var relMonth = $("#datepicker").val();
        var appName=$("#AppName").val();
//        alert(relMonth);
        $.get('ajaxDates', {
                relMonth : relMonth,appName:appName
        }, function(response) {

        var select = $('#dateValues');
        select.find('option').remove();
          $.each(response, function(index, value) {
          $('<option>').val(value).text(value).appendTo(select);
      });
        });
        },
        
    });
    });
      </script>
 <script>
//       $(document).ready(function(){ 
//
//$('#datepicker').datepicker( {
//    	changeMonth: true,
//    	changeYear: true,
//    	showButtonPanel: true,
//    	dateFormat: 'mm-yy',
//    	onChangeMonthYear: function(year, month, widget) {
//            setTimeout(function() {
//               $('.ui-datepicker-calendar').hide();
//            });
//    	},
//    	onClose: function(dateText, inst) { 
//    		var month = $("#ui-datepicker-div .ui-datepicker-month :selected").val();
//    		var year = $("#ui-datepicker-div .ui-datepicker-year :selected").val();
//    		$(this).datepicker('setDate', new Date(year, month, 1));
//    	},
//    }).click(function(){
//    	$('.ui-datepicker-calendar').hide();
//    });
//
//
//    
//});


//
//$('#datepicker').change(function(event) {
//        var relMonth = $("#datepicker").val();
//        var appName=$("#AppName").val();
////        alert(relMonth);
//        $.get('ajaxDates', {
//                relMonth : relMonth,appName:appName
//        }, function(response) {
//
//        var select = $('#dateValues');
//        select.find('option').remove();
//          $.each(response, function(index, value) {
//          $('<option>').val(value).text(value).appendTo(select);
//      });
//        });
////        
//        });


    </script>

 <!----date picker--->
  </body>
</html>
