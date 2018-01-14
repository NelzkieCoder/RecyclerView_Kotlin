package com.example.skadush.kotlin_recyclerview.Services

import com.example.skadush.kotlin_recyclerview.Model.Category
import com.example.skadush.kotlin_recyclerview.Model.Product

object DataService {

    val Categories = listOf(

            Category("HOODIES","hoodieimage"),
            Category("HATS","hatimage")
    )
    val hats = listOf(
            Product("Devslpws",17,"hat1"),
            Product("Devslpws",17,"hat2"),
            Product("Devslpws",17,"hat3"),
            Product("Devslpws",17,"ha4")
    )

    val hoodies = listOf(
            Product("Hoodies",25,"hoodie1"),
            Product("Hoodies",25,"hoodie2"),
            Product("Hoodies",25,"hoodie3"),
            Product("Hoodies",25,"hoodie4")
    )
}