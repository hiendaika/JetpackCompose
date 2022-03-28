package com.example.myfirstcompose.puppies.infinitescroll

import android.widget.Space
import androidx.compose.foundation.MutatePriority
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myfirstcompose.puppies.data.Puppy
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun PuppiesScreen(
    list: List<Puppy>,
    modifier: Modifier
) {
    //Function hien thi danh sach cac puppy theo chieu nganbg
    var itemsListState by remember { mutableStateOf(list) }
    val lazyListState = rememberLazyListState()
    LazyRow(
        state = lazyListState,
        modifier = modifier,
    ) {
        
        items(itemsListState) {
            PuppyItem(puppy = it)
            Spacer(modifier = Modifier.width(1.dp))

            //Kiem tra neu item la thang cuoi
            if (it == itemsListState.last()) {
                var currentList = itemsListState

                val secondPart = currentList.subList(0, lazyListState.firstVisibleItemIndex)
                val firstPart =
                    currentList.subList(lazyListState.firstVisibleItemIndex, currentList.size)

                rememberCoroutineScope().launch {
                    lazyListState.scrollToItem(
                        0,
                        maxOf(0, lazyListState.firstVisibleItemScrollOffset - SCROLL_DX)
                    )
                }

                itemsListState = firstPart + secondPart

            }

        }
    }
    LaunchedEffect(Unit){
        autoScroll(lazyListState)
    }
}

private tailrec suspend fun autoScroll(lazyListState: LazyListState) {
    lazyListState.scroll(MutatePriority.PreventUserInput) {
        scrollBy(SCROLL_DX.toFloat())
    }
    delay(DELAY_BETWEEN_SCROLL_MS)

    autoScroll(lazyListState)
}

private const val DELAY_BETWEEN_SCROLL_MS = 8L
private const val SCROLL_DX = 1


