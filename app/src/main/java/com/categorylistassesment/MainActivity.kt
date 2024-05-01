package com.categorylistassesment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.categorylistassesment.R
import com.categorylistassesment.data.Category
import com.categorylistassesment.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { _, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            binding.root.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val categories = mutableListOf(
            Category.CategoryOneHeader("Category Number - 1"),
            Category.CategoryOne("Macbook", "$1000", R.drawable.macbook),
            Category.CategoryOne("Macbook 1", "$1300", R.drawable.macbook),
            Category.CategoryOne("Macbook 2", "$1240", R.drawable.macbook),
            Category.CategoryOne("Macbook 3", "$1200", R.drawable.macbook),
            Category.CategoryTwoHeader("Category Number - 2"),
            Category.CategoryTwo("IPad 1", "$1500", R.drawable.ipad),
            Category.CategoryTwo("IPad 2", "$1510", R.drawable.ipad),
            Category.CategoryTwo("IPad 3", "$1520", R.drawable.ipad),
            Category.CategoryTwo("IPad 4", "$1530", R.drawable.ipad)
        )

        adapter = CategoryAdapter(categories)

        binding.rvProduct.layoutManager = LinearLayoutManager(this)
        binding.rvProduct.adapter = adapter
    }
}