$(document).ready(function(){
    //referencia al boton que el usuario va a presionar
    //por lo que colocamos el id del boton eliminar
    $("tr #btnDelete").click(function(){
        //Calcular el valor de la fila seleccionada
        //find poner el id del producto para hallar el id de la fila seleccionada
        var idp=$(this).parent().find("#idp").val();
        eliminar(idp);
    });
    function eliminar(idp){
        //Va a almacenar la direccion al controlador
        var url="Controlador?menu=Productos&accion=Delete";
        $.ajax({
           type: 'POST',
           url: url,
           data: "idp="+idp,
           success: function(data, textStatus, jqXHR){
                alert("Registro Eliminado!");
           }
        })
    }
});

