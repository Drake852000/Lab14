package com.example.lab14

import android.content.Context
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.glance.*
import androidx.glance.action.actionStartActivity
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.provideContent
import androidx.glance.layout.*
import androidx.glance.text.Text

class MiWidgetContenido : GlanceAppWidget() {
    override suspend fun provideGlance(context: Context, id: GlanceId) {
        // Datos simulados
        val nombreUsuario = "Omar"
        val tareasPendientes = 3

        provideContent {
            GlanceTheme {
                Column(
                    modifier = GlanceModifier
                        .fillMaxSize()
                        .padding(12.dp)
                        .background(GlanceTheme.colors.background),
                    verticalAlignment = Alignment.Top,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text("👋 ¡Hola, Omar!")
                    Spacer(GlanceModifier.height(4.dp))
                    Text("📝 Tienes 3 tareas pendientes")
                    Spacer(GlanceModifier.height(12.dp))
                    Button(
                        text = "Ver mis tareas",
                        onClick = actionStartActivity<TareasActivity>()
                    )
                }

            }
        }
    }
}
