package app.plantdiary.individualassignment3048q.dto

import com.google.gson.annotations.SerializedName

data class Country(var code: String, var name : String) {
    override fun toString(): String {
        return name
    }
}