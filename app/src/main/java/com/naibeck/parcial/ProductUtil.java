package com.naibeck.parcial;

import java.util.ArrayList;
import java.util.List;

public class ProductUtil {

    public static List<Product> products() {
        List<Product> products = new ArrayList<>();

        //TODO: Agregar el listado de productos que deberan ser mostrados en el y agregar una imagen por defecto o representativa del producto
        //TODO: Cargar un minimo de 30 productos.
        //Son libres de modificar la estructura de la clase Product a sus necesidades.
        //El drawable puede repetirse por categoria, misma imagen para articulos deportivos por ejemplo
        // products.add(new Product(...))

        //juegos
        for (int i = 1; i < 10; i++) {
            Product game = new Product();
            game.setmName("FIFA 20" + (i + 9));
            game.setmDescription("La entrega anual (" + 20 + (i + 9) + ") del juego de fútbol más famoso de todos los tiempos.");
            game.setmCategory("Juegos");
            game.setmImage(R.drawable.ic_games_black_24dp);
            game.setmPrice((i * 6) + 9.0);
            game.setmRating((float) (Math.random() * 5) + 1); //el rate se crea de forma aleatoria del 1 al 5
            products.add(game);
        }

        //celulares
        for (int i = 1; i < 10; i++) {
            Product phone = new Product();
            phone.setmName("Samsung Galaxy S" + i);
            phone.setmDescription("Generación N° " + i + " del gama alta de Samsung.");
            phone.setmCategory("Teléfonos");
            phone.setmImage(R.drawable.ic_phone_iphone_black_24dp);
            phone.setmPrice((i * 100) + 0.0);
            phone.setmRating((float) (Math.random() * 5) + 1);
            products.add(phone);
        }

        //Peliculas
        for (int i = 1; i < 8; i++) {
            Product movie = new Product();
            movie.setmName("Resident Evil " + i);
            movie.setmDescription("Entrega N° " + i + " de la película de zombies basada en el videojuego del mismo nombre.");
            movie.setmCategory("Películas y Series");
            movie.setmPrice(19.99);
            movie.setmImage(R.drawable.ic_movie_black_24dp);
            movie.setmRating((float) (Math.random() * 5) + 1);
            products.add(movie);

        }

        //Computadoras
        for (int i = 1; i < 10; i++) {
            Product laptop = new Product();
            laptop.setmName("MacBook 20" + (i + 9));
            laptop.setmDescription("Generación 20" + (i + 9) + " del ordenador portatil de Apple.");
            laptop.setmCategory("Computadoras");
            laptop.setmPrice((i * 400) + 0.0);
            laptop.setmImage(R.drawable.ic_laptop_mac_black_24dp);
            laptop.setmRating((float) (Math.random() * 5) + 1);
            products.add(laptop);
        }

        //series
        for (int i = 1; i < 10; i++) {
            Product series = new Product();
            series.setmName("The Walking Dead: Temporada " + (i + 2));
            series.setmDescription("Disfruta de la temporada N° " + (i + 2) + " de la serie de Zombies más exitosa de todos los tiempos.");
            series.setmCategory("Películas y Series");
            series.setmPrice(14.99);
            series.setmImage(R.drawable.ic_movie_black_24dp);
            series.setmRating((float) (Math.random() * 5) + 1);
            products.add(series);

        }

        return products;

    }

}
