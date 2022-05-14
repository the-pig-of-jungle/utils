package com.coder.vincent.sharp_retrofit.call_adapter.flow

import kotlinx.coroutines.flow.Flow
import retrofit2.Call
import retrofit2.CallAdapter
import java.lang.reflect.Type

class FlowCallAdapter<ResponseBodyType>(
    private val responseBodyType: ResponseBodyType,
    private val withResponseWrapper: Boolean,
) : CallAdapter<ResponseBodyType, Flow<*>> {

    override fun responseType() = responseBodyType as Type

    override fun adapt(call: Call<ResponseBodyType>) =
        if (withResponseWrapper) ResponseFlow(call) else BodyFlow(call)
}