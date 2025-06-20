package com.compose.auth.ui.signin

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.compose.auth.MainActivity.Screen
import com.compose.ui.components.JelloButtonPrimary
import com.compose.ui.components.JelloButtonSosmedRow
import com.compose.ui.components.JelloEditText
import com.compose.ui.components.JelloImgViewClick
import com.compose.ui.components.JelloTextHeader
import com.compose.ui.components.JelloTextRegular
import com.compose.ui.components.JelloTextViewRow
import com.compose.ui.components.JelloTextWithClick

@Composable
fun SignInScreen(
  navController: NavController = rememberNavController()
) {
  Column(
    modifier = Modifier
      .fillMaxSize()
      .padding(vertical = 16.dp)
      .background(Color.White)
  ) {
    JelloImgViewClick(
      onClick = {
        //
      }
    )

    JelloTextHeader(text = "Welcome to Login")

    JelloTextWithClick(
      text = "Please fill E-mail & password to login your app account.",
      textClick = " Sign Up",
      onClick = {
        navController.navigate(Screen.AuthSignUp.route)
      }
    )

    JelloTextRegular(
      text = "E-mail",
      modifier = Modifier.padding(16.dp)
    )

    JelloEditText(
      keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
    )

    JelloTextRegular(
      text = "Password",
      modifier = Modifier.padding(16.dp)
    )

    JelloEditText(
      visualTransformation = PasswordVisualTransformation()
    )

    JelloTextViewRow()

    JelloButtonPrimary(
      onClick = {
        //
      }
    )

    JelloButtonSosmedRow(
      onClickFacebook = {},
      onClickGoogle = {},
    )
  }
}

@Preview(showBackground = true, device = Devices.NEXUS_5)
@Composable
fun SignInScreenPreview() {
  SignInScreen()
}
