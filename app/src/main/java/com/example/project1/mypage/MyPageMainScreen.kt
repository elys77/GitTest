package com.example.project1.mypage

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project1.R

@Composable
fun MyPageMainScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .padding(top = 30.dp)
                    .fillMaxWidth()
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.backlogo), // 변경해야 할 아이콘 리소스 ID
                    contentDescription = null,
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .padding(16.dp)
                        .size(24.dp) // 아이콘 크기
                )
                Text(
                    text = "마이페이지",
                    modifier = Modifier
                        .align(Alignment.Center)
                        .padding(top = 16.dp, bottom = 16.dp),
                    fontSize = 16.sp
                )
            }
            Spacer(modifier = Modifier.padding(top = 150.dp))
            Image(
                painter = painterResource(id = R.drawable.konkuklogo),
                contentDescription = null,
                modifier = Modifier
                    .size(200.dp)
                    .align(Alignment.CenterHorizontally)
                    .padding(bottom = 16.dp)
            )
            Button(
                onClick = {},
                modifier = Modifier
                    .border(1.dp, Color.Black, shape = RoundedCornerShape(16.dp))
                    .width(330.dp)
                    .align(Alignment.CenterHorizontally),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color.Black
                )
            ) {
                Text(text = "개인 정보 확인")
            }
            Spacer(modifier = Modifier.padding(top = 20.dp))
            Button(
                onClick = {},
                modifier = Modifier
                    .border(1.dp, Color.Black, shape = RoundedCornerShape(16.dp))
                    .width(330.dp)
                    .align(Alignment.CenterHorizontally),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color.Black
                )
            ) {
                Text(text = "개인 정보 수정")
            }
            Spacer(modifier = Modifier.padding(top = 20.dp))
            Row(
              modifier = Modifier
                  .width(350.dp),
                horizontalArrangement = Arrangement.End
            ) {
                Text(text = "로그아웃", Modifier.clickable {  }, color = Color.Gray)
            }
        }
    }
}