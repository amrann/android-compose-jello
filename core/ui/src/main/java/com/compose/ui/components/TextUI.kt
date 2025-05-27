package com.compose.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.compose.ui.theme.VividMagenta

@Composable
fun JelloTextHeader(
  modifier: Modifier = Modifier,
  text: String = "Welcome to Login",
  color: Color = Color.Black
) {
  Text(
    text = text,
    modifier = modifier.padding(16.dp),
    style = TextStyle(
      fontSize = 20.sp,
      fontWeight = FontWeight.Bold,
      lineHeight = 24.sp,
      color = Color.Black,
      textAlign = TextAlign.Left
    ),
    overflow = TextOverflow.Ellipsis, // mengatasi ketika kelebihan text
    color = color,
    maxLines = 1
  )
}

@Preview(device = Devices.PIXEL_3A, showSystemUi = true)
@Composable
fun JelloTextHeaderPreview() {
  JelloTextHeader(
    text = "Hello, holaaa"
  )
}

@Composable
fun JelloTextWithClick (
  modifier: Modifier = Modifier,
  text: String = "Please fill email & password to login your app account.",
  textClick: String = " Sign Up",
  onClick: () -> Unit = {}
) {
  val annotatedText = buildAnnotatedString {
    append(text)
    pushStringAnnotation(
      tag = "TEXT_CLICK",
      annotation = textClick
    )
    withStyle(
      style = SpanStyle(
        color = VividMagenta,
        fontWeight = FontWeight.Bold
      )
    ) {
      append(textClick)
    }
    pop()
  }
  ClickableText(
    text = annotatedText,
    modifier = modifier.padding(16.dp),
    style = TextStyle(
      fontSize = 14.sp,
      fontWeight = FontWeight.Normal,
      lineHeight = 24.sp,
      textAlign = TextAlign.Left
    ),
    onClick = { offset ->
      annotatedText.getStringAnnotations(
        tag = "TEXT_CLICK",
        start = offset,
        end = offset
      ).firstOrNull()?.let {
        onClick()
      }
    }
  )
}

@Preview
@Composable
fun JelloTextWithClickPreview() {
  JelloTextWithClick()
}
