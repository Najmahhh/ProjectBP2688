package com.example.projectbp2688

class LoginModel {
    //variabel
    var username = " "
    var password = " "
    //method/func
    fun loginCek():Boolean{
        if(username.equals("najmahhh") && password.equals("najmah")){
            return true
        }else{
            return false
        }
    }
}