function nuevoAjax() {
    var xmlhttp = false;
    try {
        // Creacion del objeto AJAX para navegadores no IE
        xmlhttp = new ActiveXObject("Msxml2.XMLHTTP");
    }
    catch (e) {
        try {
            // Creacion del objet AJAX para IE
            xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
        }
        catch (E) {
            xmlhttp = false;
        }
    }
    if (!xmlhttp && typeof XMLHttpRequest != "undefined") {
        xmlhttp = new XMLHttpRequest();
    }
    return xmlhttp;
}
function xGetContextPath() {
    var context = "";
    var loct = document.location;
    var array = loct.href.split("/");
    try {
        context = array[0] + "/" + array[1] + "/" + array[2] + "/" + array[3];
    }
    catch (e) {
    }
    return context;
}
function usuarioInsertar(){
    var idUsuario = document.getElementById("idUsuario").value;
    var clave = document.getElementById("clave").value;
    var nombres = document.getElementById("nombres").value;
    var cadena ="metodo=doInsertar2&idUsuario="+idUsuario+"&clave"+clave+"=&nombres="+nombres;
    var ajax = nuevoAjax();
    ajax.open("POST", xGetContextPath()+"/usuarios_mantener.htm", true);
    ajax.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    ajax.send(cadena);
    ajax.onreadystatechange = function () {
        if (ajax.readyState === 4) {
            var respuesta = ajax.responseText;
            document.getElementById("tablaContenido").innerHTML = respuesta;
        }
    }
}
