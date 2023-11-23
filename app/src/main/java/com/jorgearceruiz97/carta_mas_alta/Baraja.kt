package com.jorgearceruiz97.carta_mas_alta

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext


class Baraja {
    companion object {
        var cartas = ArrayList<Carta>()


        /**
         * crea una baraja de cartas
         */

        fun crearBaraja(){
            var palos = Palos.values()
            var naipes = Naipes.values()

            var idDrawable = 0
            for(palo in palos){
                idDrawable++
                for(naipe in naipes){
                    cartas.add(Carta(naipe,palo, naipe.valorMax, naipe.valorMin,idDrawable))
                    idDrawable++
                }
            }
        }


        fun barajar(){
            cartas.shuffle()
        }

        /**
         * guarda la ultima carta de la baraja y la elimina de la lista
         * @return devuelve la carta con la ultima carta de la baraja
         */
        fun dameCarta():Carta{
            var carta = cartas[cartas.size-1]
            cartas.remove(carta)
            return carta
        }

    }
}