package com.example.praktikum4

import androidx.compose.runtime.mutableStateOf


@Composable
fun FormDataDiri(modifier: Modifier) {
    //variabel-variabel untuk mengingat nilai masukan dari keyboard
    var textNama by remember { mutableStateOf(value = "") }
    var textAlamat by remember { mutableStateOf(value = "") }
    var textJK by remember { mutableStateOf(value = "") }

    //variabel-variabel untuk mengingat data yang diperoleh dari komponen UI
    var nama by remember { mutableStateOf(value = "") }
    var alamat by remember { mutableStateOf(value = "") }
    var jenis by remember { mutableStateOf(value = "") }

    val gender: List<String> = listOf("laki-laki", "Perempuan")

}