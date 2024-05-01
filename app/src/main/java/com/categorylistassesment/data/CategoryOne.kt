package com.categorylistassesment.data

sealed class Category{
    data class CategoryOneHeader(val name: String = "Category Number 1") : Category()

    data class CategoryOne(val name: String, val price: String, val image: Int) : Category()

    data class CategoryTwoHeader(val name: String = "Category Number 2") : Category()

    data class CategoryTwo(val name: String, val price: String, val image: Int) : Category()
}