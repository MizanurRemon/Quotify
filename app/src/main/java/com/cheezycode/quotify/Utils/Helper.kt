package com.cheezycode.quotify.Utils

class Helper {
    fun validatePassword(input: String) : Boolean{
        if(input.isNotEmpty() && input.length in 6..15){
            return true
        }

        return false
    }
}