package com.withjetpack.pagerlibrarywithjetpackcompose.screen

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState
import com.withjetpack.pagerlibrarywithjetpackcompose.R
import com.withjetpack.pagerlibrarywithjetpackcompose.data.Pager
import com.withjetpack.pagerlibrarywithjetpackcompose.data.dataList

@OptIn(ExperimentalPagerApi::class)
@Composable
fun OnBoardingScreen() {
    
    var pagerState= rememberPagerState()

    Column() {
        HorizontalPager(count = dataList.size, state = pagerState, modifier = Modifier
            .fillMaxWidth()
            .weight(1f)) { page ->
            PageUi(pager= dataList[page])
            
        }

    }
}

@Composable
fun PageUi(pager: Pager) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = pager.image),
            contentDescription = pager.desc,
            modifier = Modifier.size(300.dp).fillMaxWidth().fillMaxSize()
        )
        Text(text = pager.desc)
    }

}