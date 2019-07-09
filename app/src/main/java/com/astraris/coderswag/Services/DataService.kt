package com.astraris.coderswag.Services

import com.astraris.coderswag.Model.Category
import com.astraris.coderswag.Model.Product

object DataService {
    val categories = listOf(
        Category("SHORTS", "shirtimages"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie","$18","hat01"),
        Product("Devslopes Hat Black","$20","hat02"),
        Product("Devslopes Hat White","$18","hat03"),
        Product("Devslopes Hat Snapback","$22 ","hat04")
    )

    val hoodies = listOf(
        Product("Devslopes Hoode Gray", "$28", "hoodie01"),
        Product("Devslopes Hoode Red", "$32", "hoodie02"),
        Product("Devslopes Gray Hoode", "$28", "hoodie03"),
        Product("Devslopes Red Hoode", "$32", "hoodie04")

    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "$18", "shirt01"),
        Product("Devslopes Badge Light Gray", "$20", "shirt02"),
        Product("Devslopes Logo Shirt Red", "$22", "shirt03"),
        Product("Devslopes Hustle", "$22", "shirt04"),
        Product("Kickflip studios", "$18", "shirt05")
    )
}

