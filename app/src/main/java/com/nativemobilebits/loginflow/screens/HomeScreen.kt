package com.nativemobilebits.loginflow.screens

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.nativemobilebits.loginflow.R
import com.nativemobilebits.loginflow.components.AppToolbar
import com.nativemobilebits.loginflow.components.Header
import com.nativemobilebits.loginflow.components.HorizontalScrollbar
import com.nativemobilebits.loginflow.components.MyTextFieldComponent
import com.nativemobilebits.loginflow.components.NavigationDrawerBody
import com.nativemobilebits.loginflow.components.NavigationDrawerHeader
import com.nativemobilebits.loginflow.components.SearchBar
import com.nativemobilebits.loginflow.components.Specialities
import com.nativemobilebits.loginflow.components.Speciality
import com.nativemobilebits.loginflow.data.home.HomeViewModel
import com.nativemobilebits.loginflow.data.signup.SignupUIEvent
import com.nativemobilebits.loginflow.data.signup.SignupViewModel
import kotlinx.coroutines.launch

@Composable
fun HomeScreen(homeViewModel: HomeViewModel = viewModel()) {

    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()

    homeViewModel.getUserData()

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            AppToolbar(toolbarTitle = stringResource(id = R.string.home),
                logoutButtonClicked = {
                    homeViewModel.logout()
                },
                navigationIconClicked = {
                    coroutineScope.launch {
                        scaffoldState.drawerState.open()
                    }
                }
            )
        },
        drawerGesturesEnabled = scaffoldState.drawerState.isOpen,
        drawerContent = {
            NavigationDrawerHeader(homeViewModel.emailId.value)
            NavigationDrawerBody(navigationDrawerItems = homeViewModel.navigationItemsList,
                onNavigationItemClicked = {
                    Log.d("ComingHere","inside_NavigationItemClicked")
                    Log.d("ComingHere","${it.itemId} ${it.title}")
                })
        }


    ) { paddingValues ->

        Surface(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.LightGray)
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {

                Header("Welcome !")
                HorizontalScrollbar()
                
                Speciality("Search by speciality")
                SearchBar()


                Spacer(modifier = Modifier.height(5.dp))
                Specialities()
            }

        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}