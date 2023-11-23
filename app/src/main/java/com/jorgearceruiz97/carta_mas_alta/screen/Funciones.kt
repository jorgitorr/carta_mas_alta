import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jorgearceruiz97.carta_mas_alta.R
import com.jorgearceruiz97.carta_mas_alta.clases.Baraja
import com.jorgearceruiz97.carta_mas_alta.clases.Carta


//con el lambda lo que le introduzco por parametros es la variable que voy a modificar
@Preview(showBackground = true)
@SuppressLint("ResourceType")
@Composable
fun BotonesYCartas(){
//reiniciar:(Baraja)->Unit, dameCarta: (Carta) -> Unit, carta: Carta
    var carta = Baraja.dameCarta()
    Baraja.crearBaraja()
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0, 100, 0))
    ){

        Image(
            painter = painterResource(R.drawable.facedown),//lo que no funciona es el metodo recuperaIdCarta()
            //painter = painterResource(id = recuperaIdCarta(carta)
            contentDescription = "",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .fillMaxWidth()
                .padding(50.dp)
        )

        Column(modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 40.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally){

            Row {
                Button(onClick = { /*dameCarta*/carta = Baraja.dameCarta() } , modifier = Modifier.padding(horizontal = 5.dp)) {
                    Text(text = "Dame Carta")
                }
                Button(onClick = { /*reiniciar*/Baraja.crearBaraja()
                                 Baraja.barajar()} , modifier = Modifier.padding(horizontal = 5.dp)) {
                    Text(text = "Reiniciar")
                }
            }

        }
    }
}

/**
 * @return id de la carta
 */
@SuppressLint("DiscouragedApi")
@Composable
fun recuperaIdCarta(carta: Carta): Int {
    val context = LocalContext.current
    val nombre = "${carta.palo}${carta.idDrawable}"
    return context.resources.getIdentifier(nombre, "drawable", context.packageName)
}


/*@Preview(showBackground = true)
@Composable
fun visualizacion(){
    var carta by rememberSaveable {
        mutableStateOf(Baraja.dameCarta())
    }

    BotonesYCartas(
        reiniciar = {
            Baraja.crearBaraja()
            Baraja.barajar() },
        dameCarta = {
            carta = Baraja.dameCarta()
        },
        carta
    )
}*/
