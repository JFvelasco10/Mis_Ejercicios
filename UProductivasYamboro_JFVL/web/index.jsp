<%-- Autor: Julian Felipe Velasco --%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>U. Productivas</title>
        <link href="Css/Estilos.css" rel="stylesheet" type="text/css"/>
    </head>
    <script src="Js/Js_UProductiva.js" type="text/javascript"></script>
    <script src="Js/jquery-3.4.1.min.js" type="text/javascript"></script>
    <body background="fondo.jpg">
        <center>
             
                
                
            <div><h3 id="txt1"><mark class="h">REGISTRAR UNIDADES PRODUCTIVAS</mark></h3>
                    
                    <table>
                        <tr><td id="txt1"><mark class="h">Codigo:</mark></td> <td><input type="text" id="Cod"</td></tr>
                        <tr><td id="txt1"><mark class="h">Nombre:</mark></td> <td><input type="text" id="Nom"</td></tr>
                    <tr><td id="txt1"><mark class="h">Producto:</mark></td> <td><input type="text" id="Pro"</td></tr>
                    <tr><td id="txt1"><mark class="h">Cantidad:</mark></td> <td><input type="text" id="Can"</td></tr>
                    <tr><td id="txt1"><mark class="h">Precio:</mark></td> <td><input type="text" id="Pre"</td></tr>
                    <tr><td id="txt1"><mark class="h">Fecha:</mark></td> <td><input type="date" id="Fec"</td></tr>
                    <tr><td colspan="3" aling="center"> <button type="button" class="btn1" onclick="Registrar_UProductiva()">
                           REGISTRAR</button></td>
                        <td colspan="3" aling="center"> <button type="button" class="btn1" onclick="Listar_UProductivajson()">
                           LISTAR JSON</button></td>
                    </tr>
                </table>  
                <div id="Respuesta_Servidor"> </div>
                <hr>
            </center>
        </form><IMG/></div>
                <center>
              
                    <table id="tab" border="1">
                        <caption id="txt2"><mark class="h">LISTA DE UNIDADES REGISTRADAS</mark></caption>
                        <thead>
                            <tr id="txt3">
                            <th>ID</th>
                            <th>Codigo</th>
                            <th>Nombre</th>
                            <th>Producto</th>
                            <th>Cantidad</th>
                            <th>Precio</th>
                            <th>Fecha</th>
                            <th>Total V. Produccion</th>
                            <th>Promedio Produccion</th>
                            <th>Admi</th>
                        </tr>
                    </thead>
                    <tbody id="Lista_UProductiva"> <%--cuerpo de la tabla--%> 
                    </tbody>
                    </table>
                </center>
        
    </body>
</html>

