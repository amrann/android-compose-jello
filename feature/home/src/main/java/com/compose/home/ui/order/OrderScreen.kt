package com.compose.home.ui.order

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.home.R
import com.compose.ui.components.JelloImgPhotoUrlView
import com.compose.ui.components.JelloImgViewClick
import com.compose.ui.components.JelloTextRegular
import com.compose.ui.theme.LightGrayishBlue
import com.compose.ui.theme.VeryLightGray
import com.compose.ui.theme.VividRed

@Composable
fun OrderScreen() {
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
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_more),
        color = LightGrayishBlue
      )
    }
    ItemProductGrid()
  }
}

@Composable
fun ItemProductGrid() {
  LazyVerticalGrid(
    columns = GridCells.Fixed(2),
    modifier = Modifier.background(Color.White),
    contentPadding = PaddingValues(16.dp),
    horizontalArrangement = Arrangement.spacedBy(16.dp),
    verticalArrangement = Arrangement.spacedBy(16.dp),
  ) {
    items(10) {
      Column {
        Card(
          modifier = Modifier
            .fillMaxWidth()
            .clickable {},
          colors = CardDefaults.cardColors(containerColor = LightGrayishBlue)
        ) {
          JelloImgPhotoUrlView(
            url = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png",
            desc = "pokemon"
          )
        }

        JelloTextRegular(
          text = "Nama Product",
          modifier = Modifier.padding(top = 11.dp)
        )

        JelloTextRegular(
          text = "$ 130",
          modifier = Modifier.padding(top = 9.dp),
          color = VividRed
        )
      }
    }
  }
}

@Preview
@Composable
fun OrderScreenPreview() {
  OrderScreen()
}
