/* Autor: Julian Felipe Velasco Lopez */

function Registrar_Estudiante(){
    //Capturamos los datos del formulario
var Nombre = $("#Nombre").val();
var Nota1 = $("#NOTA1").val();
var Nota2 = $("#NOTA2").val();
var Nota3 = $("#NOTA3").val();
    //Se crea un arreglo para mandar los datos
var parametros = {'Operacion': 'Registrar','N1':Nota1,'N2':Nota2,'N3':Nota3,'Nomb':Nombre};

$.ajax({
    type: "POST",
    url:"Con_Estudiante",
    data: parametros,
    dataType: "text",
    success: function (resp){
        $("#NOMBRE").val('');
        $("#NOTA1").val('');
        $("#NOTA2").val('');
        $("#NOTA3").val('');
        $('#Respuesta_Servidor').html(resp);
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
