package com.example.atmosphere_songs.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.atmosphere_songs.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(
    title: String = "Home",
    isHome: Boolean = true,
    navIcon: ImageVector = Icons.Default.Menu,
    actionOneIcon: Int = R.drawable.icon_options,
    actionTwoIcon: Int = R.drawable.icon_qr_code_scanner,
    onNavigationIconClicked: () -> Unit = {},
    onActionClicked: () -> Unit = {}
) {
    TopAppBar(
        title = {
            Text(
                text = title,
                fontSize = 13.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 65.dp)
            )
        },
        navigationIcon = {
            IconButton(
                onClick = { onNavigationIconClicked.invoke() },
                modifier = Modifier
                    .scale(0.8f)
                    .padding(start = 7.dp)
                    .shadow(
                        spotColor = Color.White,
                        elevation = 3.dp,
                        shape = RoundedCornerShape(8.dp),
                    ),
            ) {
                Icon(
                    imageVector = navIcon,
                    contentDescription = "icon_menu"
                )
            }
        },
        actions = {
            if (isHome) {
                IconButton(
                    onClick = {},
                    modifier = Modifier
                        .scale(0.8f)
                        .shadow(
                            spotColor = Color.White,
                            elevation = 1.dp,
                            shape = RoundedCornerShape(8.dp)
                        ),
                ) {

                    Icon(
                        painter = painterResource(id = actionOneIcon),
                        contentDescription = "icon_options"
                    )
                }
                Spacer(modifier = Modifier.width(0.dp))
            }
            IconButton(
                onClick = { onActionClicked.invoke() },
                modifier = Modifier
                    .background(Color.White)
                    .scale(0.8f)
                    .padding(end = 7.dp)
                    .shadow(
                        spotColor = Color.White,
                        elevation = 1.dp,
                        shape = RoundedCornerShape(8.dp),
                    ),
            )

            {
                Icon(
                    painter = painterResource(id = actionTwoIcon),
                    contentDescription = "icon_scanner"
                )
            }
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(
            containerColor = Color.White,
            scrolledContainerColor = Color.LightGray,
            titleContentColor = Color.Cyan,
            actionIconContentColor = Color.Black
        ),

        )
}