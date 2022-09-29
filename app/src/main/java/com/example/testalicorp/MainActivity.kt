package com.example.testalicorp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContextCompat
import com.example.testalicorp.compose.LoadingAnimation
import com.google.accompanist.appcompattheme.AppCompatTheme
import com.google.android.material.internal.ContextUtils.getActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cviLoading = findViewById<ComposeView>(R.id.cviLoading)
        cviLoading.setContent {
            AppCompatTheme { // or AppCompatTheme
                Column(modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                   // LoadingAnimation(circleColor = "#" + Integer.toHexString(ContextCompat.getColor(this@MainActivity, R.color.purple_200)))
                    LoadingAnimation(circleColor = resources.getString(R.color.purple_700))
                }
            }
        }
    }

    @Composable
    @Preview
    private fun previewLoading() {
        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            LoadingAnimation(circleColor = "#FFBB86FC")
        }
    }
}

