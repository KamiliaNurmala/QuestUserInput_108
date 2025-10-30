package com.example.praktikum4

import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource


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

    Column(
        modifier = Modifier.padding(top = 50.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = textNama,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = Modifier.width(250.dp),
            label = {Text(text = "Nama Lengkap")},
            onValueChange = {
                textNama = it
            }
        )
    }

    Row {
        gender.forEach{ item ->
            Row(modifier = Modifier.selectable(
                selected = textJK == item,
                onClick = { textJK = item}
            ), verticalAlignment = Alignment.centerVertically) {
                RadioButton(
                    selected = textJK == item,
                    onClick = {
                        textJK = item
                    }
                )
                Text(item)
            }
        }
    }

    OutlinedTextField(
        value = textAlamat,
        singleLine = true,
        modifier = Modifier.width(250.dp),
        label = {Text(text = "Alamat Lengkap")},
        onValueChange = {
            textAlamat = it
        }
    )

    HorizontalDivider(
        modifier = Modifier.padding(
            bottom = dimensionResource(R.dimen.padding_medium),
            top = dimensionResource(
                id = R.dimen.padding_medium
        )),
        thickness = dimensionResource(R.dimen.divider_tipis),
        color = Color.DarkGrey
    )



}