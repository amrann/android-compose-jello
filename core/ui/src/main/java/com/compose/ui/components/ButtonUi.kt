package com.compose.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.ui.R
import com.compose.ui.theme.LightOrange
import com.compose.ui.theme.ModerateBlue
import com.compose.ui.theme.VeryDarkGrayishBlue
import com.compose.ui.theme.VividRed

@Composable
fun JelloButtonPrimary(
  text: String = "Login Now",
  onClick: () -> Unit = {},
  enabled: Boolean = true,
) {
  JelloBaseButton(
    text = text,
    onClick = onClick,
    enabled = enabled,
    modifier = Modifier
      .fillMaxWidth()
      .padding(16.dp)
      .height(56.dp),
    colorBtn = ButtonDefaults.buttonColors(
      containerColor = LightOrange,
      contentColor = VeryDarkGrayishBlue
    )
  )
}

@Preview
@Composable
fun JelloButtonPrimaryPreview() {
  JelloButtonPrimary()
}

@Composable
fun JelloButtonFacebook(
  modifier: Modifier = Modifier,
  text: String = "Facebook",
  onClick: () -> Unit = {}
) {
  JelloWithIconBaseButton(
    text = text,
    onClick = onClick,
    enabled = true,
    modifier = modifier
      .fillMaxWidth()
      .padding(16.dp)
      .height(56.dp),
    colorBtn = ButtonDefaults.buttonColors(
      containerColor = ModerateBlue,
      contentColor = Color.White
    ),
    srcIcon = R.drawable.ic_fb,
    descIcon = "Facebook"
  )
}

@Preview
@Composable
fun JelloButtonFacebookPreview() {
  JelloButtonFacebook()
}

@Composable
fun JelloButtonGoogle(
  modifier : Modifier = Modifier,
  text: String = "Google",
  onClick: () -> Unit = {}
) {
  JelloWithIconBaseButton(
    text = text,
    onClick = onClick,
    enabled = true,
    modifier = modifier
      .fillMaxWidth()
      .padding(16.dp)
      .height(56.dp),
    colorBtn = ButtonDefaults.buttonColors(
      containerColor = VividRed,
      contentColor = Color.White
    ),
    srcIcon = R.drawable.ic_google,
    descIcon = "Google"
  )
}

@Preview
@Composable
fun JelloButtonGooglePreview() {
  JelloButtonGoogle()
}
