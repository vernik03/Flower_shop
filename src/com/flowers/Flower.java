package com.flowers;

import java.util.Date;

enum Color{
    RED,
    YELLOW,
    BLUE,
    WHITE,
    BLACK,
    ORANGE,
    GREEN,
    PINK,
    PURPLE,
    BROWN,
    GRAY,
    VIOLET,
    MULTICOLORED
}

enum Name{
    HYDRANGEA_MACROPHYLLA,
    HYDRANGEA_PANICULATA,
    HYDRANGEA_PETIOLARIS,
    LILY_ASIATIC,
    LILY_MARTAGON,
    LILY_ORIENTAL,
    PEONY_KANSAS,
    PEONY_SARAHBERNHARDT,
    PEONY_FESTIVAMAXIMA,
    SUNFLOWER_AUTUMNBEAUTY,
    SUNFLOWER_CHIANTI,
    SUNFLOWER_TEDDYBEAR,

    CHRYSANTHEMUM_ANASTASIA,
    CHRYSANTHEMUM_DUNE,
    CHRYSANTHEMUM_GAZELE,
    CHRYSANTHEMUM_INGA,
    EUSTOMA_CORELLI,
    EUSTOMA_ECHO,
    EUSTOMA_MARIACHI,
    EUSTOMA_ROSITA,
    GERBERA_HELIOS,
    GERBERA_ROMEO,
    GERBERA_TAMARA,
    GERBERA_VINCENT,
    ROSE_AKITO,
    ROSE_ALOHA,
    ROSE_AMSTERDAM,
    ROSE_CHERRYLOVE,
    ROSE_ENGAGEMENT,
    ROSE_GOLDSTRIKE,
    ROSE_KIKO,
    TULIP_ALBATROS,
    TULIP_BREST,
    TULIP_CUMMINS,
    TULIP_GABRIELLA,

    CONVALLARIA_LILYOFTHEVALLEY,
    GYPSOPHILA_ELEGANS,
    GYPSOPHILA_REPENS,
    MYOSOTIS_BLUEBALL,
    MYOSOTIS_INDIGO,
    MYOSOTIS_SNOWQUEEN,
}

public class Flower {
    private Name name;
    private Color color;
    private int price;
    private int height;
    private Date delivery_date;

    public Flower(Name name, Color color, int price, int height, Date delivery_date) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.height = height;
        this.delivery_date = delivery_date;
    }

    public Name getName() {return name;}

    public Color getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public int getHeight() {return height;}

    public Date getDeliveryDate() {return delivery_date;}
}
