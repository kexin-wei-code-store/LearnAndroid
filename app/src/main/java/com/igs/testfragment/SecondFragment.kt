package com.igs.testfragment

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun SecondFragment(navController: NavController) {
    Column(modifier = Modifier.fillMaxWidth())
    {
        Text(text = "Second Fragment")
        Button(onClick = {
            Log.d("MainActivity", "Go Back")
            navController.navigate(Routes.home)
        }) {
            Text(text = "Go Back")
        }
    }
}