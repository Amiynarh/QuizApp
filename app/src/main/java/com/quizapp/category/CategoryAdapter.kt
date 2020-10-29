package com.quizapp.category

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.quizapp.R
import kotlinx.android.synthetic.main.single_category_layout.view.*

class CategoryAdapter (
    private val context: Context,
    private val categories : List<Category>,
    private val listener : (Category) -> Unit
) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    /*companion object {
        val CALLBACK = object : DiffUtil.ItemCallback<Category>() {
            override fun areItemsTheSame(oldItem: Category, newItem: Category): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: Category, newItem: Category): Boolean {
                return oldItem == newItem
            }
        }
    }*/

    class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvCategory = itemView.tv_category!!
        val ivCategoryImage = itemView.iv_categoryImage!!
        val layoutCategory = itemView.layout_category!!

        fun bindView(category: Category, listener: (Category) -> Unit) {
            ivCategoryImage.setImageResource(category.categorySrc)
            tvCategory.text = category.categoryTitle
            layoutCategory.setOnClickListener {
                listener(category)

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.single_category_layout,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return categories.size
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.bindView(categories[position], listener)
    }

}


