package com.coder.vincent.sharp_retrofit.annotations

import java.util.concurrent.TimeUnit

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
annotation class CallTimeout(val timeout: Int, val timeUnit: TimeUnit)