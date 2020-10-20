package com.dsckiet.covid_tracker_android_app.models

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CountryWiseData(
    @Json(name = "Countries")
    val countries: List<Country>?=null,
    @Json(name = "Date")
    val date: String="",
    @Json(name = "Global")
    val global: Global?=null
) : Parcelable

@Parcelize
data class Country(
    @Json(name = "Country")
    val country: String="",
    @Json(name = "CountryCode")
    val countryCode: String="",
    @Json(name = "Date")
    val date: String="",
    @Json(name = "NewConfirmed")
    val newConfirmed: Int=0,
    @Json(name = "NewDeaths")
    val newDeaths: Int=0,
    @Json(name = "NewRecovered")
    val newRecovered: Int=0,
    @Json(name = "TotalConfirmed")
    val totalConfirmed: Int=0,
    @Json(name = "TotalDeaths")
    val totalDeaths: Int=0,
    @Json(name = "TotalRecovered")
    val totalRecovered: Int=0
) : Parcelable

@Parcelize
data class Global(
    @Json(name = "NewConfirmed")
    val newConfirmed: Int=0,
    @Json(name = "NewDeaths")
    val newDeaths: Int=0,
    @Json(name = "NewRecovered")
    val newRecovered: Int=0,
    @Json(name = "TotalConfirmed")
    val totalConfirmed: Int=0,
    @Json(name = "TotalDeaths")
    val totalDeaths: Int=0,
    @Json(name = "TotalRecovered")
    val totalRecovered: Int=0
) : Parcelable