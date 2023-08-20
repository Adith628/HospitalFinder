package com.nativemobilebits.loginflow.screens
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nativemobilebits.loginflow.components.Header
import com.nativemobilebits.loginflow.components.HorizontalScrollbar
import com.nativemobilebits.loginflow.components.SearchBar
import com.nativemobilebits.loginflow.components.Specialities
import com.nativemobilebits.loginflow.components.AmbulanceMapRender
import android.widget.ImageView

@Composable
fun AmbulanceMap() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {

            Header("Live tracking ")
            AmbulanceMapRender()

        }

    }
}

