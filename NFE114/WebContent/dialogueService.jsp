 <%--inclusion du header --%>
 <%@ include file="header.jsp" %>
  
<title>dialogue Service</title>

  <body>

    <div class="container">

      <!-- The justified navigation menu is meant for single line per list item.
           Multiple lines will require custom code not provided by Bootstrap. -->
      <div class="masthead">
       <%--inclusion de la barre de menu --%>
       <%@ include file="barMenu.jsp" %>
      </div>

      <!-- Jumbotron -->
      <div class="jumbotron">
        <h1>Gestion des services web </h1>
     
      </div>
      
      <!-- Example row of columns -->
      <div class="row">
    <fieldset class="fieldset-default">
    <legend class="scheduler-border">Gestion des services web</legend>
    <p class="glyphicon glyphicon-hand-right" style="color:red">
    &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
    &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
    &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
    
     La repr&eacute;sentation de la date est la suivante : DD/MM/YY</p>
    
    <div class="row">
        <div class="nav a-centernav-pills nav-stacked">
            
            <div class="col-md-9 col-md-push-3">
                
                <table name="general">
                    <div class="container">
                        <div class='col-md-5'>
                            <div class="form-group">
                                <div class='input-group date'>
                                    <input type='text' class="form-control" id='datetimepicker6' name="datetimepicker6" placeholder="date de début de recherche"/>
                                    <span class="input-group-addon">
                                        <span class="glyphicon glyphicon-calendar"></span>
                                    </span>
                                </div>
                            </div>
                        </div>
                        
                        <div class='col-md-5'>
                            <div class="form-group">
                                <div class='input-group date'>
                                    <input type='text' class="form-control" id='datetimepicker7' name="datetimepicker7" placeholder="date de fin de recherche"/>
                                    <span class="input-group-addon">
                                        <span class="glyphicon glyphicon-calendar"></span>
                                    </span>
                                </div>
                            </div>
                        </div>

                    </div>
               
                </table>
            </div>
                        <h2></h2>
            
                        <table id="acces1" class="table table-striped table-bordered" cellspacing="0" width="100%">

                            <thead>
                                <tr>
                                    <th>Name service</th>
                                    <th>Type</th>
                                    <th>Description</th>
                                    <th>Name fabricant</th>
                                    <th>Email fabricant</th>
                                    <th>Supprimer</th>
                                    <th>Modifier</th>
                                    
                                </tr>
                            </thead>

                            <tfoot>
                            <tr>
                              		<th>Name service</th>
                                    <th>Type</th>
                                    <th>Description</th>
                                    <th>Name fabricant</th>
                                    <th>Email fabricant</th>
                                    <th>Supprimer</th>
                                    <th>Modifier</th>
                            </tr>
                            </tfoot>

                        </table>

                        

                        <h2></h2>

        </div>
    </div>
</fieldset>  
   
        
      </div>
 <%--inclusion du footer --%>
     <%@ include file="footer.jsp" %>
