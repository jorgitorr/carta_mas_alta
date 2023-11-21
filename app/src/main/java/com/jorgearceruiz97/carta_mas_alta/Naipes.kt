package com.jorgearceruiz97.carta_mas_alta
enum class Naipes(valorMin:Int, valorMax: Int){
    AS(1,11),DOS(2,2), TRES(3,3),
    CUATRO(4,4), CINCO(5,5),
    SEIS(6,6), SIETE(7,7),
    OCHO(8,8), NUEVE(9,9),
    DIEZ(10,10), JOTA(11,11),
    REINA(12,12), REY(13,13);

    var valorMin = valorMin
    var valorMax = valorMax
    override fun toString(): String {
        return "$name"
    }


}