package com.compose.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Surface
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.clickable
import androidx.compose.foundation.Image
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.compose.ui.R
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun JelloBannerSliderUi(
  bannerImage : List<Painter>,
  onClick : (Int) -> Unit
) {
  val pagerState = rememberPagerState()
  Column {
    HorizontalPager(
      count = bannerImage.size,
      state = pagerState,
      modifier = Modifier
        .fillMaxWidth()
        .height(200.dp)
    ) {
      page ->
      Surface(
        modifier = Modifier
          .clickable {
            onClick(page)
          },
        color = Color.White.copy(alpha = 0f)
      ) {
        Image(
          painter = bannerImage[page],
          contentDescription = "Banner Image",
          contentScale = ContentScale.Crop,
          modifier = Modifier.fillMaxWidth()
        )
      }
    }
  }
}

@Preview
@Composable
fun JelloBannerSliderUiPreview() {
  val images = listOf(
    painterResource(id = R.drawable.sample_slide1),
    painterResource(id = R.drawable.sample_slide1),
    painterResource(id = R.drawable.sample_slide1))
    JelloBannerSliderUi(
        bannerImage = images,
        onClick = {}
    )
}
