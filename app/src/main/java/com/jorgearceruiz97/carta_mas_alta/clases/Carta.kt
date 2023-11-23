package com.jorgearceruiz97.carta_mas_alta.clases


class Carta (val nombre: Naipes, val palo: Palos, val puntosMax:Int, val puntosMin: Int, val idDrawable:Int){

    override fun toString(): String {
        return "Carta(nombre=$nombre, palo=$palo)"
    }
}