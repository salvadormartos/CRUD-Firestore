package com.smb.crud_firestore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.smb.crud_firestore.ui.theme.CRUDFirestoreTheme
import com.smb.crud_firestore.nav.NavGraph
import com.smb.crud_firestore.util.SharedViewModel

class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController
    private val sharedViewModel: SharedViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CRUDFirestoreTheme {

                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize().padding(20.dp),
                    color = MaterialTheme.colorScheme.background
                ) {
                    navController = rememberNavController()
                    NavGraph(
                        navController = navController,
                        sharedViewModel = sharedViewModel
                    )
                }

            }
        }
    }
}


