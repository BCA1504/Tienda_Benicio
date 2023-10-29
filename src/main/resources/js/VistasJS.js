function eliminarEstudiante(id) {
    if (confirm("¿Seguro que deseas eliminar este estudiante?")) {
        $.ajax({
            type: "GET",
            url: "/estudiantes/eliminar/" + id,
            success: function () {
                location.reload();
            }
        });
    }
}

function cargarDetallesEstudiante(id) {
    $.ajax({
        type: "GET",
        url: "/estudiantes/editar/" + id,
        success: function (data) {
            $("#id").val(data.id);
            $("#nombre").val(data.nombre);
        }
    });
}