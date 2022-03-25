package com.example.myfirstcompose.puppies

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.example.myfirstcompose.puppies.data.Puppy

@Composable
fun PuppiesApp(navigateToProfile: (Puppy) -> Unit) {
    Scaffold(content = {
        PuppiesHomeScreen(navigateToProfile)
    })
}