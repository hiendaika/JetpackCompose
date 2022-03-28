package com.example.myfirstcompose.puppies.infinitescroll

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.myfirstcompose.puppies.PuppyImage
import com.example.myfirstcompose.puppies.data.Puppy

@Composable
fun PuppyItem(puppy: Puppy) {
    Card(
        shape = RoundedCornerShape(corner = CornerSize(10.dp)),
        modifier = Modifier
            .size(60.dp)
            .aspectRatio(1f)
            .padding(1.dp),
        elevation = 2.dp
    ) {
        PuppyImage(puppy = puppy)
    }
}