 package com.example.android_71




import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.android_71.ui.theme.Android71Theme
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class DetailActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Android71Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->


                    val listeAlbums = listOf(
                        Album.Album(1, "Antigéographiquement", "Jérôme 50"),
                        Album.Album(2, "J'ai Bu", "Québec Redneck Bluegrass Project"),
                        Album.Album(3, "Comment Debord", "Comment Debord"),
                        Album.Album(4, "Darlène", "Hubert Lenoir"),
                        Album.Album(5, "La Nuit Est Une Panthère", "Les Louanges"),
                        Album.Album(6, "Jaune", "Jean-Pierre Ferland")
                    )
                    LazyColumn(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)

                    ) {

                        items(listeAlbums){ element ->

                                LigneAlbum(album = element)


                        }
                    }
                }
            }
        }
    }
}

@Composable
fun LigneAlbum(album: Album.Album) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 12.dp)
    ) {
        // Nom de l'album (Plus grand et foncé)
        Text(
            text = album.name,
            fontSize = 18.sp,
            color = Color.DarkGray
        )
        // Nom de l'artiste (Plus petit et gris)
        Text(
            text = album.artistName,
            fontSize = 14.sp,
            color = Color.Gray
        )
    }
    // Petite ligne de séparation grise discrète entre chaque album
    HorizontalDivider(color = Color(0xFFE0E0E0), thickness = 1.dp)
}