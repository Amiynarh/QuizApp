package com.quizapp.category

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.quizapp.MainActivity
import com.quizapp.QuizQuestionsActivity
import com.quizapp.R
import kotlinx.android.synthetic.main.activity_category.*

class CategoryActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        val categoryList = listOf<Category>(
            Category(
                R.drawable.world,
                "World"

            ) ,
            Category(
                R.drawable.games,
                "Games"
            ),
            Category(
                R.drawable.music,
                "Music"
            ),
            Category(
                R.drawable.science,
                "Science"
            ),
            Category(
                R.drawable.sports,
                "Sports"
            ),
            Category(
                R.drawable.tech,
                "Tech"
            ),
            Category(
                R.drawable.movie,
                "Movie"
            ),
        Category(
            R.drawable.sports,
            "Sports"
        ),
        Category(
            R.drawable.tech,
            "Tech"
        ),
        Category(
            R.drawable.movie,
            "Movie"
        )

        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_categoryList )
        rv_categoryList.layoutManager = GridLayoutManager(this, 2)

        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = CategoryAdapter(this, categoryList){
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

    }


    }
