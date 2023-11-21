package com.jorgearceruiz97.carta_mas_alta


class Carta (nombre:Naipes, palo:Palos, puntosMax:Int, puntosMin: Int, idDrawable:Int){
    val nombre = nombre
    val palo = palo
    val puntosMax = puntosMax
    val puntosMin = puntosMin
    val idDrawable = idDrawable
    override fun toString(): String {
        return "${palo.toString().lowercase()}_${idDrawable}"
    }


}