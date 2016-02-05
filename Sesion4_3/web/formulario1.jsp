<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>label{background-color: olive;font-weight: bolder; padding: 3px; min-width: 200px !important} div{padding:3px;}</style>
    </head>
    <body>

        <div style="background-color: goldenrod; font-weight: bolder;margin-bottom: 5px">VIDEOCLUB ON-LINE</div>
        <form method="post" action="CapturaDatosVideoClub">
        <div>
            <label for="pelicula">Nombre Pelicula</label>
            <input type="text" name="pelicula" id="pelicula">
        </div>
        <div>
            <label for="dias">Numero Dias Alquiler</label>
            <input type="text" name="dias" id="dias">
        </div>
        <div>
            <label>Edad Cliente</label>
            <div>
                <input type="radio" name="edad" value="1"> Menor de 7 años<br>
                <input type="radio" name="edad" value="2"> Menor de 14 años<br>
                <input type="radio" name="edad" value="3"> Menor de 18 años<br>
                <input type="radio" name="edad" value="4"> Mayor de 18 años<br>
            </div>
        </div>
        <div>
            <label>Forma de Pago</label>
            <select name="pago">
                <option value="1">VISA</option>
                <option value="2">MasterCard</option>
                <option value="3">Paypal</option>
                <option value="4">Contra reembolso</option>
            </select>
        </div>
        <div>
            <label>Especificaciones Extras</label>                 
            <div><textarea name="extras" cols="70" rows="10"></textarea></div>
        </div>
        <div>
            <input type="submit" value="Enviar Pedido">
            <input type="reset" value="Borrar Formulario">
        </div>
        </form>
    </body>
</html>
