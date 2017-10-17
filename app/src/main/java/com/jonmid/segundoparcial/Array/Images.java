package com.jonmid.segundoparcial.Array;

import java.util.Random;

/**
 * Created by software on 17/10/2017.
 */

public class Images {
    public static String imageRandom(){
        Random random = new Random();
        String imageArray[] = {
                "https://www.ligafutbol.net/wp-content/2009/04/escudo-madrid.png",
                "https://www.ligafutbol.net/wp-content/2009/04/escudo-barcelona.png",
                "http://www.eltiempo.com/contenido/multimedia/fotos/deportes14/IMAGEN/IMAGEN-16457389-2.png",
                "https://st-listas.20minutos.es/images/2008-06/23847/307214_640px.jpg?1214350171",
                "http://bncdn02.mundotkm.com/2016/08/roma.jpg"
        };
        int position = random.nextInt(4);
        return imageArray[position];
    }
}
