package com.categorylistassesment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.categorylistassesment.data.Category
import com.categorylistassesment.databinding.ViewHolderCatOneHeaderBinding
import com.categorylistassesment.databinding.ViewHolderCatTwoHeaderBinding
import com.categorylistassesment.databinding.ViewHolderCategoryOneBinding
import com.categorylistassesment.databinding.ViewHolderCategoryTwoBinding
import com.categorylistassesment.viewHolder.Category1HeaderViewHolder
import com.categorylistassesment.viewHolder.Category1ViewHolder
import com.categorylistassesment.viewHolder.Category2HeaderViewHolder
import com.example.categorylistviewholder.viewHolder.Category2ViewHolder

class CategoryAdapter(private val categories: List<Category>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            VIEW_TYPE_CATEGORY_ONE -> {
                val binding = ViewHolderCategoryOneBinding.inflate(inflater, parent, false)
                Category1ViewHolder(binding)
            }
            VIEW_TYPE_CATEGORY_TWO -> {
                val binding = ViewHolderCategoryTwoBinding.inflate(inflater, parent, false)
                Category2ViewHolder(binding)
            }
            VIEW_TYPE_CATEGORY_ONE_HEADER -> {
                val binding = ViewHolderCatOneHeaderBinding.inflate(inflater, parent, false)
                Category1HeaderViewHolder(binding)
            }
            VIEW_TYPE_CATEGORY_TWO_HEADER -> {
                val binding = ViewHolderCatTwoHeaderBinding.inflate(inflater, parent, false)
                Category2HeaderViewHolder(binding)
            }
            else -> throw RuntimeException("Unknown View Type")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = categories[position]
        if (holder is Category1ViewHolder && item is Category.CategoryOne) {
            holder.bind(item)
        } else if (holder is Category2ViewHolder && item is Category.CategoryTwo) {
            holder.bind(item)
        }
    }

    override fun getItemCount() = categories.size

    override fun getItemViewType(position: Int): Int {
        val item = categories[position]
        if (item is Category.CategoryOne) {
            return VIEW_TYPE_CATEGORY_ONE
        } else if (item is Category.CategoryTwo) {
            return VIEW_TYPE_CATEGORY_TWO
        }else if (item is Category.CategoryOneHeader) {
            return VIEW_TYPE_CATEGORY_ONE_HEADER
        }else if (item is Category.CategoryTwoHeader) {
            return VIEW_TYPE_CATEGORY_TWO_HEADER
        }
        return super.getItemViewType(position)
    }


    companion object {
        const val VIEW_TYPE_CATEGORY_ONE_HEADER = 5
        const val VIEW_TYPE_CATEGORY_ONE = 10
        const val VIEW_TYPE_CATEGORY_TWO_HEADER = 15
        const val VIEW_TYPE_CATEGORY_TWO = 20
    }
}
