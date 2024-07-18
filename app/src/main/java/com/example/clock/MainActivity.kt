package com.example.clock

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.clock.ui.theme.ClockAnimationTheme
import java.lang.Math.toRadians


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ClockAnimationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ClockAnimation()
                }
            }
        }
    }
}

@Composable
fun ClockAnimation() {
    val infiniteTransition = rememberInfiniteTransition()

    val seconds by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween(60000, easing = LinearEasing)
        )
    )

    val minutes by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween(3600000, easing = LinearEasing)
        )
    )

    val hours by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween(43200000, easing = LinearEasing)
        )
    )

    Box(modifier = Modifier.fillMaxSize()) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            val radius = size.minDimension / 2
            val centerX = size.width / 2
            val centerY = size.height / 2

            drawCircle(
                color = Color.Black,
                radius = radius,
                center = androidx.compose.ui.geometry.Offset(centerX, centerY),
                style = androidx.compose.ui.graphics.drawscope.Stroke(width = 4.dp.toPx())
            )

            drawLine(
                color = Color.Red,
                start = androidx.compose.ui.geometry.Offset(centerX, centerY),
                end = androidx.compose.ui.geometry.Offset(
                    x = (centerX + radius * 0.8f * kotlin.math.cos(toRadians((minutes - 90f).toDouble()).toFloat())),
                    y = (centerY + radius * 0.8f * kotlin.math.sin(toRadians((minutes - 90f).toDouble()).toFloat()))
                ),
                strokeWidth = 2.dp.toPx(),
                cap = StrokeCap.Round
            )

            drawLine(
                color = Color.Blue,
                start = androidx.compose.ui.geometry.Offset(centerX, centerY),
                end = androidx.compose.ui.geometry.Offset(
                    x = (centerX + radius * 0.6f * kotlin.math.cos(toRadians((minutes - 90f).toDouble()).toFloat())),
                    y = (centerY + radius * 0.6f * kotlin.math.sin(toRadians((minutes - 90f).toDouble()).toFloat()))
                ),
                strokeWidth = 4.dp.toPx(),
                cap = StrokeCap.Round
            )

            drawLine(
                color = Color.Green,
                start = androidx.compose.ui.geometry.Offset(centerX, centerY),
                end = androidx.compose.ui.geometry.Offset(
                    x = (centerX + radius * 0.4f * kotlin.math.cos(toRadians((hours - 90f).toDouble()).toFloat())),
                    y = (centerY + radius * 0.4f * kotlin.math.sin(toRadians((hours - 90f).toDouble()).toFloat()))
                ),
                strokeWidth = 6.dp.toPx(),
                cap = StrokeCap.Round
            )
        }
    }
}