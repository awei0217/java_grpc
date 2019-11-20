package com.spw.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.*;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.*;

/**
 * <pre>
 *定义接口
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.23.1)",
    comments = "Source: hello_world.proto")
public final class HelloServiceGrpc {

  private HelloServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.HelloService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<HelloRequest,
      HelloResponse> getHelloWorldMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HelloWorld",
      requestType = HelloRequest.class,
      responseType = HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<HelloRequest,
      HelloResponse> getHelloWorldMethod() {
    io.grpc.MethodDescriptor<HelloRequest, HelloResponse> getHelloWorldMethod;
    if ((getHelloWorldMethod = HelloServiceGrpc.getHelloWorldMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getHelloWorldMethod = HelloServiceGrpc.getHelloWorldMethod) == null) {
          HelloServiceGrpc.getHelloWorldMethod = getHelloWorldMethod =
              io.grpc.MethodDescriptor.<HelloRequest, HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HelloWorld"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("HelloWorld"))
              .build();
        }
      }
    }
    return getHelloWorldMethod;
  }

  private static volatile io.grpc.MethodDescriptor<HelloRequest,
      HelloResponse> getHelloWorldServerStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HelloWorldServerStream",
      requestType = HelloRequest.class,
      responseType = HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<HelloRequest,
      HelloResponse> getHelloWorldServerStreamMethod() {
    io.grpc.MethodDescriptor<HelloRequest, HelloResponse> getHelloWorldServerStreamMethod;
    if ((getHelloWorldServerStreamMethod = HelloServiceGrpc.getHelloWorldServerStreamMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getHelloWorldServerStreamMethod = HelloServiceGrpc.getHelloWorldServerStreamMethod) == null) {
          HelloServiceGrpc.getHelloWorldServerStreamMethod = getHelloWorldServerStreamMethod =
              io.grpc.MethodDescriptor.<HelloRequest, HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HelloWorldServerStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("HelloWorldServerStream"))
              .build();
        }
      }
    }
    return getHelloWorldServerStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<HelloRequest,
      HelloResponse> getHelloWorldClientStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HelloWorldClientStream",
      requestType = HelloRequest.class,
      responseType = HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<HelloRequest,
      HelloResponse> getHelloWorldClientStreamMethod() {
    io.grpc.MethodDescriptor<HelloRequest, HelloResponse> getHelloWorldClientStreamMethod;
    if ((getHelloWorldClientStreamMethod = HelloServiceGrpc.getHelloWorldClientStreamMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getHelloWorldClientStreamMethod = HelloServiceGrpc.getHelloWorldClientStreamMethod) == null) {
          HelloServiceGrpc.getHelloWorldClientStreamMethod = getHelloWorldClientStreamMethod =
              io.grpc.MethodDescriptor.<HelloRequest, HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HelloWorldClientStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("HelloWorldClientStream"))
              .build();
        }
      }
    }
    return getHelloWorldClientStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<HelloRequest,
      HelloResponse> getHelloWorldClientAndServerStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HelloWorldClientAndServerStream",
      requestType = HelloRequest.class,
      responseType = HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<HelloRequest,
      HelloResponse> getHelloWorldClientAndServerStreamMethod() {
    io.grpc.MethodDescriptor<HelloRequest, HelloResponse> getHelloWorldClientAndServerStreamMethod;
    if ((getHelloWorldClientAndServerStreamMethod = HelloServiceGrpc.getHelloWorldClientAndServerStreamMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getHelloWorldClientAndServerStreamMethod = HelloServiceGrpc.getHelloWorldClientAndServerStreamMethod) == null) {
          HelloServiceGrpc.getHelloWorldClientAndServerStreamMethod = getHelloWorldClientAndServerStreamMethod =
              io.grpc.MethodDescriptor.<HelloRequest, HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HelloWorldClientAndServerStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("HelloWorldClientAndServerStream"))
              .build();
        }
      }
    }
    return getHelloWorldClientAndServerStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloServiceStub newStub(io.grpc.Channel channel) {
    return new HelloServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HelloServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HelloServiceFutureStub(channel);
  }

  /**
   * <pre>
   *定义接口
   * </pre>
   */
  public static abstract class HelloServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *一个简单的rpc
     * </pre>
     */
    public void helloWorld(HelloRequest request,
                           io.grpc.stub.StreamObserver<HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHelloWorldMethod(), responseObserver);
    }

    /**
     * <pre>
     *一个服务器端流式rpc
     * </pre>
     */
    public void helloWorldServerStream(HelloRequest request,
                                       io.grpc.stub.StreamObserver<HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHelloWorldServerStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     *一个客户端流式rpc
     * </pre>
     */
    public io.grpc.stub.StreamObserver<HelloRequest> helloWorldClientStream(
        io.grpc.stub.StreamObserver<HelloResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getHelloWorldClientStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     *一个客户端和服务器端双向流式rpc
     * </pre>
     */
    public io.grpc.stub.StreamObserver<HelloRequest> helloWorldClientAndServerStream(
        io.grpc.stub.StreamObserver<HelloResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getHelloWorldClientAndServerStreamMethod(), responseObserver);
    }

    @Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHelloWorldMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                HelloRequest,
                HelloResponse>(
                  this, METHODID_HELLO_WORLD)))
          .addMethod(
            getHelloWorldServerStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                HelloRequest,
                HelloResponse>(
                  this, METHODID_HELLO_WORLD_SERVER_STREAM)))
          .addMethod(
            getHelloWorldClientStreamMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                HelloRequest,
                HelloResponse>(
                  this, METHODID_HELLO_WORLD_CLIENT_STREAM)))
          .addMethod(
            getHelloWorldClientAndServerStreamMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                HelloRequest,
                HelloResponse>(
                  this, METHODID_HELLO_WORLD_CLIENT_AND_SERVER_STREAM)))
          .build();
    }
  }

  /**
   * <pre>
   *定义接口
   * </pre>
   */
  public static final class HelloServiceStub extends io.grpc.stub.AbstractStub<HelloServiceStub> {
    private HelloServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected HelloServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *一个简单的rpc
     * </pre>
     */
    public void helloWorld(HelloRequest request,
                           io.grpc.stub.StreamObserver<HelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHelloWorldMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *一个服务器端流式rpc
     * </pre>
     */
    public void helloWorldServerStream(HelloRequest request,
                                       io.grpc.stub.StreamObserver<HelloResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getHelloWorldServerStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *一个客户端流式rpc
     * </pre>
     */
    public io.grpc.stub.StreamObserver<HelloRequest> helloWorldClientStream(
        io.grpc.stub.StreamObserver<HelloResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getHelloWorldClientStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *一个客户端和服务器端双向流式rpc
     * </pre>
     */
    public io.grpc.stub.StreamObserver<HelloRequest> helloWorldClientAndServerStream(
        io.grpc.stub.StreamObserver<HelloResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getHelloWorldClientAndServerStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   *定义接口
   * </pre>
   */
  public static final class HelloServiceBlockingStub extends io.grpc.stub.AbstractStub<HelloServiceBlockingStub> {
    private HelloServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected HelloServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *一个简单的rpc
     * </pre>
     */
    public HelloResponse helloWorld(HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getHelloWorldMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *一个服务器端流式rpc
     * </pre>
     */
    public java.util.Iterator<HelloResponse> helloWorldServerStream(
        HelloRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getHelloWorldServerStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *定义接口
   * </pre>
   */
  public static final class HelloServiceFutureStub extends io.grpc.stub.AbstractStub<HelloServiceFutureStub> {
    private HelloServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected HelloServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *一个简单的rpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<HelloResponse> helloWorld(
        HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHelloWorldMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HELLO_WORLD = 0;
  private static final int METHODID_HELLO_WORLD_SERVER_STREAM = 1;
  private static final int METHODID_HELLO_WORLD_CLIENT_STREAM = 2;
  private static final int METHODID_HELLO_WORLD_CLIENT_AND_SERVER_STREAM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HelloServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HELLO_WORLD:
          serviceImpl.helloWorld((HelloRequest) request,
              (io.grpc.stub.StreamObserver<HelloResponse>) responseObserver);
          break;
        case METHODID_HELLO_WORLD_SERVER_STREAM:
          serviceImpl.helloWorldServerStream((HelloRequest) request,
              (io.grpc.stub.StreamObserver<HelloResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HELLO_WORLD_CLIENT_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.helloWorldClientStream(
              (io.grpc.stub.StreamObserver<HelloResponse>) responseObserver);
        case METHODID_HELLO_WORLD_CLIENT_AND_SERVER_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.helloWorldClientAndServerStream(
              (io.grpc.stub.StreamObserver<HelloResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return HelloWorldProto.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelloService");
    }
  }

  private static final class HelloServiceFileDescriptorSupplier
      extends HelloServiceBaseDescriptorSupplier {
    HelloServiceFileDescriptorSupplier() {}
  }

  private static final class HelloServiceMethodDescriptorSupplier
      extends HelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HelloServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HelloServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloServiceFileDescriptorSupplier())
              .addMethod(getHelloWorldMethod())
              .addMethod(getHelloWorldServerStreamMethod())
              .addMethod(getHelloWorldClientStreamMethod())
              .addMethod(getHelloWorldClientAndServerStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
