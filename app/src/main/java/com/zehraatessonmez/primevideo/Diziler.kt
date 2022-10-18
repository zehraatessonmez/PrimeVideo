package com.zehraatessonmez.primevideo

import java.io.Serializable

data class Diziler(var diziId:Int,
                   var diziAdi:String,
                   var diziResimAdi:String,
                   var diziYil:Int,
                   var filmYönetmen:String) : Serializable {
}