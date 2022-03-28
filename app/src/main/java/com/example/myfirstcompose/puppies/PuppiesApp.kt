package com.example.myfirstcompose.puppies

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.myfirstcompose.puppies.data.DataPuppies
import com.example.myfirstcompose.puppies.data.Puppy
import com.example.myfirstcompose.puppies.infinitescroll.PuppiesScreen

@Composable
fun PuppiesApp(navigateToProfile: (Puppy) -> Unit) {
    Scaffold(content = {
//        PuppiesHomeScreen(navigateToProfile)
        PuppiesScreen(list = DataPuppies.puppies, modifier = Modifier.fillMaxWidth())
    })
}