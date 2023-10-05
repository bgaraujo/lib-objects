package com.home.dtos.enums;

import com.google.gson.annotations.SerializedName;

public enum DocumentType {
    @SerializedName("CPF")
    CPF,
    @SerializedName("CNPJ")
    CNPJ,
    @SerializedName("RG")
    RG,
    @SerializedName("PASSAPOR_NUMBER")
    PASSAPOR_NUMBER,
    @SerializedName("CNH")
    CNH
}
