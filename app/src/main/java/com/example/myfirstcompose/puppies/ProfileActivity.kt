package com.example.myfirstcompose.puppies

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import com.example.myfirstcompose.puppies.data.Puppy
import com.example.myfirstcompose.ui.theme.MyFirstComposeTheme

class ProfileActivity : AppCompatActivity() {
    companion object {
        const val PUPPY_ID = "puppy_id"
        fun newIntent(context: Context, puppy: Puppy) {
            context.startActivity(Intent(context,ProfileActivity::class.java).putExtra(PUPPY_ID, puppy))
        }
    }

    //GET Data
    private val puppySelected by lazy {
        intent.getSerializableExtra(PUPPY_ID) as Puppy
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstComposeTheme {
//                Text(text = puppySelected.name)
                ProfileScreen(puppySelected)
            }
        }
    }
}

