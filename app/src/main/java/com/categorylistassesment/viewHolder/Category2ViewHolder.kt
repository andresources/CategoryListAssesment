package com.example.categorylistviewholder.viewHolder

import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.categorylistassesment.data.Category
import com.categorylistassesment.databinding.ViewHolderCategoryTwoBinding


class Category2ViewHolder(private val binding: ViewHolderCategoryTwoBinding) : RecyclerView.ViewHolder(binding.root) {
    private val productName: TextView = binding.productName
    private val productImage: ImageView = binding.productImageView
    private val productPrice: TextView = binding.productPrice

    fun bind(categoryOne: Category.CategoryTwo) {
        productName.text = categoryOne.name
        productImage.setImageResource(categoryOne.image)
        productPrice.text = categoryOne.price
    }
}