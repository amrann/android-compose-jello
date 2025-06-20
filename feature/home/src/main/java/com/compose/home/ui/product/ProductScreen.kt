package com.compose.home.ui.product

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Divider
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.home.R
import com.compose.ui.components.JelloImgPhotoUrlView
import com.compose.ui.components.JelloImgViewClick
import com.compose.ui.components.JelloRatingBar
import com.compose.ui.components.JelloTextRegular
import com.compose.ui.theme.LightGrayishBlue
import com.compose.ui.theme.VeryLightGray
import com.compose.ui.theme.VividRed

@Composable
fun ProductScreen() {
  Column(
    modifier = Modifier
      .fillMaxSize()
      .background(Color.White)
  ) {
    Row(
      modifier = Modifier
        .padding(16.dp)
        .fillMaxWidth()
    ) {
      Card(
        modifier = Modifier
          .fillMaxWidth()
          .weight(1f)
          .clickable {},
        colors = CardDefaults.cardColors(
          containerColor = Gray.copy(alpha = 0.1f)
        )
      ) {
        Row(
          modifier = Modifier
            .padding(horizontal = 16.dp)
            .fillMaxWidth()
        ) {
          JelloTextRegular(
            modifier = Modifier
              .fillMaxWidth()
              .align(Alignment.CenterVertically)
              .weight(1f),
            text = "Cari barang Kamu disini",
            color = Gray
          )
          JelloImgViewClick(
            color = Gray,
            onClick = {},
            imageVector = Icons.Outlined.Search
          )
        }
      }
    }

    Divider(
      modifier = Modifier
        .fillMaxWidth(),
      thickness = 2.dp,
      color = VeryLightGray
    )

    Row(
      modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 25.dp),
      verticalAlignment = Alignment.CenterVertically
    ) {
      JelloTextRegular(
        text = "NEW PRODUCT",
        modifier = Modifier
          .weight(1f)
      )

      JelloImgViewClick(
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_filter),
        color = LightGrayishBlue
      )

      JelloImgViewClick(
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_katalog),
        color = LightGrayishBlue
      )
    }
    ItemProduct()
  }
}

@Composable
fun ItemProduct() {
  LazyColumn(
    modifier = Modifier
      .padding(top = 16.dp)
      .padding(horizontal = 16.dp)
      .background(Color.White)
  ) {
    items(10) {
      Row {
        Card(
          modifier = Modifier
            .size(100.dp)
            .padding(bottom = 16.dp)
            .clickable {},
          colors = CardDefaults.cardColors(containerColor = LightGrayishBlue)
        ) {
          JelloImgPhotoUrlView(
            url = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png",
            desc = "pokemon"
          )
        }

        Spacer(modifier = Modifier.padding(start = 8.dp))

        Column {
          JelloTextRegular(
            text = "Product Name",
            modifier = Modifier.padding(top = 3.dp)
          )
          JelloTextRegular(
            text = "Rp. 100.000",
            modifier = Modifier.padding(top = 7.dp),
            color = VividRed
          )
          JelloRatingBar(
            rating = 2f,
            modifier = Modifier.padding(top = 18.dp),
            onRatingChanged = {}
          )
        }
      }
    }
  }
}

@Preview(showBackground = true, device = Devices.NEXUS_5)
@Composable
fun ProductScreenPreview() {
  ProductScreen()
}
