package com.compose.ui.components

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.IconButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun JelloImgViewClick(
  modifier: Modifier = Modifier,
  onClick: () -> Unit = {},
  color: Color = Color.Black,
  imageVector: ImageVector = Icons.AutoMirrored.Filled.ArrowBack,
  imageDescription: String = "Back",
) {
  IconButton(onClick = { onClick() }) {
    Icon(
      imageVector = imageVector,
      contentDescription = imageDescription,
      modifier = modifier.size(24.dp),
      tint = color
    )
  }
}

@Preview
@Composable
fun JelloImgViewClickPreview() {
  JelloImgViewClick()
}
