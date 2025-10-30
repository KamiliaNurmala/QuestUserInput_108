package com.example.praktikum4

import androidx.compose.runtime.mutableStateOf


@Composable
fun FormDataDiri(modifier: Modifier)
{
    var textNama by remember (mutableStateOf(""))

}