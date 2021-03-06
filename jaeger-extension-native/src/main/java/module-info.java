module io.ballerina.observe.trace.extension.jaeger {
    requires io.ballerina.runtime;
    requires opentracing.api;
    requires opentracing.noop;
    requires jaeger.core;

    provides io.ballerina.runtime.observability.tracer.spi.TracerProvider
            with io.ballerina.observe.trace.jaeger.JaegerTracerProvider;
}
