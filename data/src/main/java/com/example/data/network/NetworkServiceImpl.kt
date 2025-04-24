package com.example.data.network

import com.example.domain.model.Product
import com.example.domain.network.NetworkService
import com.example.domain.network.ResultWrapper
import io.ktor.client.HttpClient
import io.ktor.client.request.request

class NetworkServiceImpl(val client: HttpClient): NetworkService {
    override suspend fun getProducts(): ResultWrapper<List<Product>> {
        TODO("Not yet implemented")
    }
    suspend inline fun <reified T,R> makeWebRequest(
         url:String,
         method:String,
         body:Any?=null,
         header:Map<String,String> =emptyMap(),
         parameters:Map<String,String> =emptyMap(),
         noinline mapper:((T)->R)?=null

    ) {
         try{
             val response = client.request(url){
                 this.method= method
                 url{
                     
                 }


             }
         }

    }

}