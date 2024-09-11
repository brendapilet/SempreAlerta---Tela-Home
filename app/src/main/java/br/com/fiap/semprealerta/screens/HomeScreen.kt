package br.com.fiap.semprealerta.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.tooling.preview.Preview
import br.com.fiap.semprealerta.R

@Composable
fun HomeScreen(navController: NavController) {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Box {

            Image(
                painter = painterResource(id = R.drawable.bairro1),
                contentDescription = "imagem de um bairro",
                modifier = Modifier
                    .fillMaxSize()
                    .graphicsLayer { alpha = 0.97f },
                contentScale = ContentScale.Crop
            )

            Column(
                modifier = Modifier
                    .padding(20.dp)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painterResource(id = R.drawable.logo),
                    contentDescription = "imagem de logo",
                    modifier = Modifier
                        .size(190.dp)
                        .align(Alignment.CenterHorizontally)
                )

                Spacer(modifier = Modifier.height(32.dp))

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(
                        onClick = { },
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White, RoundedCornerShape(50.dp)),
                        colors = ButtonDefaults.buttonColors(containerColor = Color.White)
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(
                                painterResource(id = R.drawable.ic_report),
                                contentDescription = "Ícone Comunicar Ocorrência",
                                modifier = Modifier.size(24.dp)
                            )
                            Text("COMUNICAR OCORRÊNCIA", color = Color(0xFF0A1734), fontSize = 16.sp)
                        }
                    }
                    Button(
                        onClick = { },
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White, RoundedCornerShape(50.dp)),
                        colors = ButtonDefaults.buttonColors(containerColor = Color.White)
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(
                                painterResource(id = R.drawable.ic_group),
                                contentDescription = "Ícone Grupos do Bairro",
                                modifier = Modifier.size(24.dp)
                            )
                            Text("GRUPOS DO BAIRRO", color = Color(0xFF0A1734), fontSize = 16.sp)
                        }
                    }
                    Button(
                        onClick = { },
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White, RoundedCornerShape(50.dp)),
                        colors = ButtonDefaults.buttonColors(containerColor = Color.White)
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(
                                painterResource(id = R.drawable.ic_map),
                                contentDescription = "Ícone Mapa de Ocorrências",
                                modifier = Modifier.size(24.dp)
                            )
                            Text("MAPA DE OCORRÊNCIAS", color = Color(0xFF0A1734), fontSize = 16.sp)
                        }
                    }
                    Button(
                        onClick = { },
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White, RoundedCornerShape(50.dp)),
                        colors = ButtonDefaults.buttonColors(containerColor = Color.White)
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(
                                painterResource(id = R.drawable.ic_recent),
                                contentDescription = "Ícone Últimas Ocorrências",
                                modifier = Modifier.size(24.dp)
                            )
                            Text("ÚLTIMAS OCORRÊNCIAS", color = Color(0xFF0A1734), fontSize = 16.sp)
                        }
                    }
                    Button(
                        onClick = { },
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White, RoundedCornerShape(50.dp)),
                        colors = ButtonDefaults.buttonColors(containerColor = Color.White)
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(
                                painterResource(id = R.drawable.ic_annoucement),
                                contentDescription = "Ícone Comunicados",
                                modifier = Modifier.size(24.dp)
                            )
                            Text("COMUNICADOS", color = Color(0xFF0A1734), fontSize = 16.sp)
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(navController = rememberNavController())
}

