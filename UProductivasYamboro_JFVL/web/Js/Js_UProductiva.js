/* Autor: Julian Felipe Velasco Lopez */

function Registrar_UProductiva(){
    //Capturamos los datos del formulario
var Codigo = $("#Cod").val();
var Nombre = $("#Nom").val();
var Producto = $("#Pro").val();
var Cantidad = $("#Can").val();
var Precio = $("#Pre").val();
var Fecha = $("#Fec").val();
    //Se crea un arreglo para mandar los datos
var parametros = {'Operacion': 'Registrar','Cod':Codigo,'Nom':Nombre, 'Pro':Producto,'Can':Cantidad,'Pre':Precio, 'Fec':Fecha};

$.ajax({
    type: "POST",
    url:"Con_UProductiva",
    data: parametros,
    dataType: "text",
    success: function (resp){
        $("#CODIGO").val('');
        $("#NOMBRE").val('');
        $("#PRODUCTO").val('');
        $("#CANTIDAD").val('');
        $("#PRECIO").val('');
        $("#FECHA").val('');
        $('#Respuesta_Servidor').html(resp);
    }
}).fail(function (jqXHR, textStatus, errorThrown){
    alert("Error : " + jqXHR.status);
});

}

function Eliminar_UProductiva(id){
    var parametros = {'Operacion':'Eliminar','id':id};
    
    $.ajax({
        type: "POST",
        url: "Con_UProductiva",
         data: parametros,
        dataType: "text",
        success: function (resp){
            $('#Respuesta_Servidor').html(resp);
            Registrar_UProductiva();
        }
}).fail(function (jqXHR, textStatus, errorThrown){
    alert("Error : " + jqXHR.status);
});
}

function Listar_UProductivajson (){
    var parametros = {'Operacion':'Listar_Json'};
    $.ajax({
        type: "POST",
        url: "Con_UProducto",
        data: parametros,
        dataType: "json",
        success: function (resp){
            var tbody = "";
            var i = 0;
            $.each(resp,function (index,val){
                tbody +="<tr><td>"+i+"</td>";
                tbody +="<td>"+val.Codigo+"</td>";
                tbody +="<td>"+val.Nombre+"</td>";
                tbody +="<td>"+val.Producto+"</td>";
                tbody +="<td>"+val.Cantidad+"</td>";
                tbody +="<td>"+val.Precio+"</td>";
                tbody +="<td>"+val.Fecha+"</td>";
                tbody +="<td>"+val.Precio+"</td>";
                tbody +="<td>"+val.Precio+"</td>";
                tbody +="<td><a href = 'javascript:Eliminar_UProductiva("+i+");'>Eliminar</a><td></tr>";
                i++;
            });
                $('#Lista_UProductiva').html(tbody);
        }
    }).fail(function (jqXHR, textStatus, errorThrown){
        alert("Error : " + jqXHR.status);
    });
}




































function Listar_Estudiantes(){
    //Se crea un arreglo para enviar los datos
    var parametros = {'Operacion' : 'Listar'};
    $.ajax({
    type: "POST",
    url:"Con_Estudiante",
    data: parametros,
    dataType: "text",
    success: function (resp){
        $("#Lista_Estudiante").html(resp);
        
    }
}).fail(function (jqXHR, textStatus, errorThrown){
    alert("Error : " + jqXHR.status);
});

}

function Eliminar_Estudiante(id){
    var parametros = {'Operacion':'Eliminar','id':id};
    
    $.ajax({
        type: "POST",
        url: "Con_Estudiante",
         data: parametros,
        dataType: "text",
        success: function (resp){
            $('#Respuesta_Servidor').html(resp);
            Listar_Estudiantes();
        }
}).fail(function (jqXHR, textStatus, errorThrown){
    alert("Error : " + jqXHR.status);
});
}

function Listar_Estudiantesjson (){
    var parametros = {'Operacion':'Listar_Json'};
    $.ajax({
        type: "POST",
        url: "Con_Estudiante",
        data: parametros,
        dataType: "json",
        success: function (resp){
            var tbody = "";
            var i = 0;
            $.each(resp,function (index,val){
                tbody +="<tr><td>"+i+"</td>";
                tbody +="<td>"+val.Nombre+"</td>";
                tbody +="<td>"+val.Nota1+"</td>";
                tbody +="<td>"+val.Nota2+"</td>";
                tbody +="<td>"+val.Nota3+"</td>";
                tbody +="<td>"+val.Definitiva+"</td>";
                tbody +="<td><a href = 'javascript:Eliminar_Estudiante("+i+");'>Eliminar</a><td></tr>";
                i++;
            });
                $('#Lista_Estudiante').html(tbody);
        }
    }).fail(function (jqXHR, textStatus, errorThrown){
        alert("Error : " + jqXHR.status);
    });
}
