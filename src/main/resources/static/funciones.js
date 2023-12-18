let sii = "viva js";


function eliminar(id) {
    Swal.fire({
        title: "Are you sure?",
        text: "You won't be able to revert this!",
        icon: "warning",
        showCancelButton: true,
        confirmButtonColor: "#3085d6",
        cancelButtonColor: "#d33",
        confirmButtonText: "Si, borrar."
    }).then((OK) => {
        if (OK.isConfirmed) {
            $.ajax({
                // type: "GET",
                url: "/delete/" + id, //igual como le pusimos a la ruta de eliminar
                // data: "data",
                // dataType: "dataType",
                // la funcion de exito 
                success: function(response) {
                    console.log(response);
                }
            });
            Swal.fire({
                title: "Eliminado!",
                text: "Your file has been deleted.",
                icon: "success"
            }).then((ok) => {
                // validamos si ok es true..
                if (ok) {
                    //hacemos una redireccion
                    location.href = "/listar"
                        // console.log(ok);
                }
            });
        } else {
            Swal.fire("Cancelado");
        }
    });
}