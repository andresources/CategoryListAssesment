package com.categorylistassesment.viewHolder

import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.categorylistassesment.data.Category
import com.categorylistassesment.databinding.ViewHolderCategoryOneBinding


class Category1ViewHolder(private val binding: ViewHolderCategoryOneBinding) : RecyclerView.ViewHolder(binding.root) {
    private val productName: TextView = binding.productName
    private val productImage: ImageView = binding.productImage
    private val productPrice: TextView = binding.productPrice

    fun bind(categoryOne: Category.CategoryOne) {
        productName.text = categoryOne.name
        productImage.setImageResource(categoryOne.image)
        productPrice.text = categoryOne.price
    }
}