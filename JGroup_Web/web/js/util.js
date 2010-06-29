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
    var txt_nom = document.getElementById("txt_nom").value;
    var txt_ape = document.getElementById("txt_ape").value;
    var txt_dni = document.getElementById("txt_dni").value;
    var cadena ="metodo=doInsertar2&txt_nom="+txt_nom+"&txt_ape"+txt_ape+"=&txt?dni="+txt_dni;
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
