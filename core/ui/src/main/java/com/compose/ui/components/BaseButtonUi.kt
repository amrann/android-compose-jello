package com.compose.ui.components


import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.ui.R

@Composable
fun JelloBaseButton(
  modifier: Modifier = Modifier,
  text: String = "Default Text",
  onClick: () -> Unit = {  },
  enabled: Boolean = true,
  shape: Shape = RoundedCornerShape(8.dp),
  colorBtn: ButtonColors = ButtonDefaults.buttonColors(
    containerColor = Color.Black,
    contentColor = Color.White
  )
) {
  Button(
    modifier = modifier,
    enabled = enabled,
    shape = shape,
    colors = colorBtn,
    onClick = { onClick() }
  ) {
    Text(text = text)
  }
}

@Preview
@Composable
fun JelloBaseButtonPreview() {
  JelloBaseButton()
}

@Composable
fun JelloWithIconBaseButton(
  modifier: Modifier = Modifier,
  text: String = "Default Text",
  onClick: () -> Unit = {  },
  enabled: Boolean = true,
  shape: Shape = RoundedCornerShape(8.dp),
  colorBtn: ButtonColors = ButtonDefaults.buttonColors(
    containerColor = Color.Black,
    contentColor = Color.White
  ),
  colorIcon: Color = Color.White,
  srcIcon: Int = R.drawable.ic_fb,
  descIcon: String = "Facebook"
) {
  Button(
    modifier = modifier,
    enabled = enabled,
    shape = shape,
    colors = colorBtn,
    onClick = { onClick() }
  ) {
    Icon(
      painter = painterResource(id = srcIcon),
      contentDescription = descIcon,
      modifier = Modifier.size(24.dp),
      tint = colorIcon
    )
    Spacer(modifier = Modifier.width(8.dp)) // jarak diantara text
    Text(text = text)
  }
}

@Preview
@Composable
fun JelloWithIconBaseButtonPreview() {
  JelloWithIconBaseButton()
}
