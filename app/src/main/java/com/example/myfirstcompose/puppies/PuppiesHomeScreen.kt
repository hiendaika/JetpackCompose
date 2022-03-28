package com.example.myfirstcompose.puppies

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import com.example.myfirstcompose.puppies.data.DataPuppies
import com.example.myfirstcompose.puppies.data.Puppy

@Composable
fun PuppiesHomeScreen(navigateToProfile: (Puppy) -> Unit) {
    //Puppies
    val puppies = remember { DataPuppies.puppies }

    //RecyclerView hien thi theo chieu doc
    LazyColumn(contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)) {
        items(
            items = puppies,
            itemContent = {
                PuppyItem(puppy = it, navigateToProfile)
            }
        )
    }
}