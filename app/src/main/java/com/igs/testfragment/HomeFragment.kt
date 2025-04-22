package com.igs.testfragment

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun HomeFragment(navController: NavController) {
    val padding = 30f
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = padding.dp),
        contentAlignment = Alignment.Center

    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(padding.dp)
        ) {
            Text(
                text = "Title",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(top = padding.dp)
            )

            Button(
                onClick = {
                    Log.d("MainActivity", "Go to Screen 2")
                    navController.navigate(Routes.second_screen)
                },
                modifier = Modifier.padding(bottom = padding.dp)
            ) {
                Text("Click Me To Go To Screen 2")
            }
        }
    }
}