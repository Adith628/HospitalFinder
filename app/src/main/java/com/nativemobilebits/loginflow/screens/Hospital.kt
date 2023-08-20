package com.nativemobilebits.loginflow.screens
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.nativemobilebits.loginflow.components.Details
import com.nativemobilebits.loginflow.components.Header

@Composable
fun Hospital() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {

            Header("HOSPITAL DETAILS: ")
            Details()
        }

    }
}




