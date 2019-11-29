<%-- Autor: Julian Felipe Velasco Lopez --%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Peticiones AJAX</title>
        <link href="Css/Estilos.css" rel="stylesheet" type="text/css"/>
    </head>
    
    <script src="Js/jquery-3.4.1.min.js" type="text/javascript"></script>
    <script src="Js/Js_Estudiante.js" type="text/javascript"></script>
    <body background="pizarron.jpg">
            
            <center>
             
                
                
                <div><h3 id="txt1">FORMULARIO DE REGISTRO DE ESTUDIANTES</h3>
                    
                    <table>
                    <tr><td id="txt1">Nombre:</td> <td><input type="text" id="Nombre"</td></tr>
                    <tr><td id="txt1">Nota1</td> <td><input type="text" id="NOTA1"</td></tr>
                    <tr><td id="txt1">Nota2</td> <td><input type="text" id="NOTA2"</td></tr>
                    <tr><td id="txt1">Nota3</td> <td><input type="text" id="NOTA3"</td></tr>
                    <tr><td colspan="3" aling="center"> <button type="button" class="btn1" onclick="Registrar_Estudiante()">
                           REGISTRAR</button></td>
                        <td colspan="3" aling="center"> <button type="button" class="btn1" onclick="Listar_Estudiantes()">
                           LISTAR </button></td>
                        <td colspan="3" aling="center"> <button type="button" class="btn1" onclick="Listar_Estudiantesjson()">
                           LISTAR JSON</button></td>
                    </tr>
                </table>  
                <div id="Respuesta_Servidor"> </div>
                <hr>
            </center>
        </form><IMG/></div>
                <center>
              
                    <table id="tab" border="1">
                        <caption id="txt2">LISTA DE ESTUDIANTES REGISTRADOS</caption>
                        <thead>
                            <tr id="txt3">
                            <th>ID</th>
                            <th>Nombre</th>
                            <th>Nota1</th>
                            <th>Nota2</th>
                            <th>Nota3</th>
                            <th>Definitiva</th>
                            <th>Admi</th>
                        </tr>
                    </thead>
                    <tbody id="Lista_Estudiante"> <%--cuerpo de la tabla--%> 
                    </tbody>
                    </table>
                </center>
        
    </body>
</html>
