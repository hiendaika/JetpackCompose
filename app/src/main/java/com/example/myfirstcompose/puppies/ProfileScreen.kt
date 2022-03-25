package com.example.myfirstcompose.puppies

import android.icu.text.CaseMap
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.myfirstcompose.R
import com.example.myfirstcompose.puppies.data.Puppy

@Composable
fun ProfileScreen(puppy: Puppy) {
    //Bien luu trang thai scroll
    val scrollState = rememberScrollState()
    Column(modifier = Modifier.fillMaxSize()) {
        BoxWithConstraints {
            Surface {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(scrollState)
                ) {
                    HeaderProfile(puppy, this@BoxWithConstraints.maxHeight)
                    ProfileContent(puppy, this@BoxWithConstraints.maxHeight)
                }
            }
        }
    }
}

@Composable
fun HeaderProfile(puppy: Puppy, containerHeight: Dp) {
    Image(
        modifier = Modifier
            .heightIn(max = containerHeight / 2) //Set chieu cao bang 1 nua chieu cao man hinh
            .fillMaxWidth(),
        painter = painterResource(id = puppy.image),
        contentScale = ContentScale.Crop,
        contentDescription = null
    )
}

@Composable
fun ProfileContent(puppy: Puppy, containerHeight: Dp) {
    Column {
        Title(puppy = puppy)
        ProfileProperty(label = stringResource(R.string.gender), value = puppy.gender)
        ProfileProperty(label = stringResource(R.string.age), value = puppy.age.toString())
        ProfileProperty(label = stringResource(R.string.personality), value = puppy.description)

        //De scroll dc thi them 1 so khoang trang theo chieu doc sau thuoc tinh tinh cach
        //Dam bao chieu cao bo sung k nho hon 0dp
        Spacer(modifier = Modifier.height((containerHeight - 320.dp).coerceAtLeast(0.dp)))
    }
}

@Composable
fun Title(puppy: Puppy) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = 16.dp),
    ) {
        Text(
            text = puppy.name,
            style = MaterialTheme.typography.h5,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun ProfileProperty(label: String, value: String) {
    Column(modifier = Modifier.padding(all = 16.dp)) {
        //Add divider
        Divider(modifier = Modifier.padding(bottom = 4.dp))
        Text(
            text = label,
            modifier = Modifier.height(24.dp),
            style = MaterialTheme.typography.caption
        )
        Text(
            text = value,
            modifier = Modifier.height(24.dp),
            style = MaterialTheme.typography.body1,
            overflow = TextOverflow.Visible
        )
    }
}