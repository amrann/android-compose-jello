package com.compose.auth.ui.signup

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
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
import com.compose.ui.components.JelloButtonPrimary
import com.compose.ui.components.JelloEditText
import com.compose.ui.components.JelloImgViewClick
import com.compose.ui.components.JelloTextHeader
import com.compose.ui.components.JelloTextRegular
import com.compose.ui.components.JelloTextWithClick

@Composable
fun SignUpScreen(
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
        navController.popBackStack()
      }
    )

    JelloTextHeader(text = "Create Your Account")

    JelloTextWithClick(
      text = "Do you already have account?",
      textClick = " Sign In",
      onClick = {
        navController.popBackStack()
      }
    )

    JelloTextRegular(
      text = "Username",
      modifier = Modifier.padding(16.dp)
    )

    JelloEditText(
      value = "Username"
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

    Spacer(modifier = Modifier.height(30.dp))

    JelloButtonPrimary(
      text = "Create Account",
      onClick = {
        //
      }
    )
  }
}

@Preview(showBackground = true, device = Devices.NEXUS_5)
@Composable
fun SignUpScreenPreview() {
  SignUpScreen()
}

