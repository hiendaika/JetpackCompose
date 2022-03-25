package com.example.myfirstcompose.puppies

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.myfirstcompose.puppies.data.Puppy

@Composable
fun PuppyItem(puppy: Puppy, navigateToProfile: (Puppy) -> Unit) {
    //Add card same CardView
    Card(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth(),
        elevation = 2.dp,
//        backgroundColor = Color.White,
        shape = RoundedCornerShape(corner = CornerSize(10.dp))
    ) {
        Row(Modifier.clickable { navigateToProfile(puppy) }) {
            PuppyImage(puppy = puppy)
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)
            ) {
                Text(text = puppy.name, style = typography.h6)
                Text(text = "View Detail", style = typography.caption)
            }
        }
    }
}

@Composable
fun PuppyImage(puppy: Puppy) {
    Image(
        painter = painterResource(id = puppy.image),
        contentDescription = "Image item",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(all = 9.dp)
            .size(80.dp)
            .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
    )
}