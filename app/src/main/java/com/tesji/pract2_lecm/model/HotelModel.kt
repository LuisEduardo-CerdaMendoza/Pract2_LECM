package com.tesji.pract2_lecm.model

class HotelModel {

    var cantidadDias = 0.0
    var cantidadPrecio = 0.0

    fun calcularVenta(): String {
        val subTotal: Double
        val descuento: Double
        val total: Double
        val respuesta:String

        subTotal = cantidadDias * cantidadPrecio

        if (cantidadDias > 5 && cantidadDias <= 10){
            descuento = subTotal * 0.10
            respuesta = "Descuento aplicado de un 10%"
        }else if(cantidadDias > 10 && cantidadDias <= 15){
            descuento = subTotal * 0.15
            respuesta = "Descuento aplicado de un 15%"
        }else if (cantidadDias > 15){
            descuento = subTotal * 0.20
            respuesta = "Descuento aplicado de un 20%"
        }else{
            descuento = 0.0
            respuesta = "Sin descuento aplicado"
        }

        total = subTotal - descuento

        return """
           Descuento aplicado: $$subTotal
           $respuesta
           El total a pagar es de: $$total
           """
    }
}