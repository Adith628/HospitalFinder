package com.lasagna.hospitalfinder.screens

import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.*

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.lasagna.hospitalfinder.R
import androidx.compose.ui.unit.dp
import com.lasagna.hospitalfinder.components.HeadingTextComponent
import com.lasagna.hospitalfinder.components.MyTextField
import com.lasagna.hospitalfinder.components.NormalTextComponent

@Composable
fun SignUpScreen() {

    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Surface(
            color = Color.White,
            modifier = Modifier
                .fillMaxSize()
                .padding(28.dp)
        ) {
            Column(modifier = Modifier.fillMaxSize() ){
                NormalTextComponent(value = stringResource(id = R.string.hello) )
                HeadingTextComponent(value = stringResource(id = R.string.create_acc))
                Spacer(modifier = Modifier.height(20.dp))
                MyTextField(labelValue = stringResource(id = R.string.firstname))
                MyTextField(labelValue = stringResource(id = R.string.lastname))
            }


        }
    }




}

@Preview
@Composable
fun DefaultPreviewOfSignUpScreen(){
    SignUpScreen()
}
